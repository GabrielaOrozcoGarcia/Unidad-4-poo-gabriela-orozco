package Taller15.Libro;

public class LibroSRP {

    private String titulo;
    private String autor;
    private int paginas;

    public LibroSRP(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }
}


