package Taller15.Libro;

public class ReporteLibroService {

    public void generarReporte(LibroSRP libro) {
        System.out.println("..::Reporte del Libro::..");
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Numero de páginas: " + libro.getPaginas());
        System.out.println("-----------------------------");
    }
}

