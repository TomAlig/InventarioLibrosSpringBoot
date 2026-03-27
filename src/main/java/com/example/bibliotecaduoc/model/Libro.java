package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Genera automaticamente los metodos de clase: Getter, Setter, ToString, EqualsAndHashCode y RequiredArgsConstructor.
@AllArgsConstructor //Genera automaticamente un constructor que inclue campos de clase como parametros.
@NoArgsConstructor //Genenera automaticamente un constructor sin argumentos para crear instancias de la clase sin inicializar sus campos inmediatamente.

public class Libro {
    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;
}