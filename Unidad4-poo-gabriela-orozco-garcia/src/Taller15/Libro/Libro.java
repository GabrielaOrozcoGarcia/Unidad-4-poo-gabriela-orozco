package Taller15.Libro;

public class Libro {

    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
    }

    public void generarReporte() {
        System.out.println("..::Reporte del Libro::..");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + paginas);
    }

    public void guardarLibro() {
        System.out.println("Guardando el libro '" + titulo + "' en la base de datos...");
    }
}

