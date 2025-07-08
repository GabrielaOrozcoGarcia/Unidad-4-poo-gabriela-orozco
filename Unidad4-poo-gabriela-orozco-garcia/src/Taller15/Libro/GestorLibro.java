package Taller15.Libro;

public class GestorLibro {

    public void mostrarInformacion(LibroSRP libro) {
        System.out.println("..::Informacion del Libro::..");
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Paginas: " + libro.getPaginas());
        System.out.println("=============================");
    }
}


