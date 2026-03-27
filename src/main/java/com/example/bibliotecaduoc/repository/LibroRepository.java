package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository //<- Indica que la clase es un repositorio, una abstraccion que se encarga de la persistencia de los datos, mejora la legibilidad de codigo.
public class LibroRepository { //Se usa como clase ya que no esta conectada a una base de datos.
    private List<Libro> listalibros = new ArrayList<>();

    public List<Libro> obtenerLibros() {
        return listalibros;
    }

    //Metodo para buscar por id.
    public Libro buscarPorId(int id) {
        for (Libro libro : listalibros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    //Metodo para buscar por isbn
    public Libro buscarPorIsbn(String isbn) {
        for (Libro libro : listalibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    //Metodo para guardar el libro en el array y retornarlo.
    public Libro guardar(Libro lib) {
        listalibros.add(lib);
        return lib;
    }

    //Metodo para actualizar el libro.
    public Libro actualizar(Libro lib) {
        int id = 0;
        int idPosicion = 0;
    
        for (int i = 0; i < listalibros.size(); i++) {
            if (listalibros.get(i).getId() == lib.getId()) {
                id = lib.getId();
                idPosicion = i;
            }
        }
        
        Libro libro1 = new Libro();
        libro1.setId(id);
        libro1.setTitulo(lib.getTitulo());
        libro1.setAutor(lib.getAutor());
        libro1.setFechaPublicacion(lib.getFechaPublicacion());
        libro1.setEditorial(lib.getEditorial());
        libro1.setIsbn(lib.getIsbn());
        return libro1;
        }
        public void eliminar(int id) {
            Libro libro = buscarPorId(id);
            if (libro != null) {
                listalibros.remove(libro);
            }
        }
    }


