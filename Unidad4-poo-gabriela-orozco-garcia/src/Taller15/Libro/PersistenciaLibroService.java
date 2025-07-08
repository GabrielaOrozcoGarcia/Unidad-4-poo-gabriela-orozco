package Taller15.Libro;

public class PersistenciaLibroService {

    public void guardarLibro(LibroSRP libro) {
        // Simulacion de persistencia (sin base de datos real)
        System.out.println("Guardando el libro en la base de datos...");
        System.out.println("Libro guardado: " + libro.getTitulo() + " por " + libro.getAutor());
    }
}
