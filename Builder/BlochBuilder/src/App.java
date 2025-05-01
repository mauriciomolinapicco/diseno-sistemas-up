import java.time.LocalDate;

import Builder.BlochBuilder.src.Libro.LibroBuilder;

public class App {
    public static void main(String[] args) throws Exception {
        Libro l = new LibroBuilder("Ana Karenina", "Leon Tolstoi", "L1-02")
        .fechaPublicacion(LocalDate.of(20,1,2019))
        .editorial("Ed. Alma")
        .cantidadCapitulos(34)
        .cantidadEjemplares(22)
        .build();

        // CONSTRUIR OBJETOS A PARTIR DE UNA MISMA BASE
        
        LibroBuilder builder = new LibroBuilder("Ana Karenina", "Leon Tolstoi", "L1-02");
        Libro l1 = builder
            .conFechaPublicacion(LocalDate.of(20,1,2019))
            .conEditorial("Ed. Alma")
            .conCantidadCapitulos(34)
            .conCantidadEjemplares(22)
            .build();

        //cargar el libro en la biblioteca central:
        BiblioCentral.agregarLibro(l1);

        //agrego a sucursal "oeste"
        builder.conCantidadEjemplares(5);
        Libro l2 = builder.build();
        BiblioOeste.agregarLibro(l2);

        //agrego a sucursal "sur"
        builder.conCantidadEjemplares(8);
        builder.conEditorial("Ed. Sudamericana");

        Libro l3 = builder.build();
        BiblioSur.agregarLibro(l3);

    }
}
