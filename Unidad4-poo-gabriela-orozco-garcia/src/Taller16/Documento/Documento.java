package Taller16.Documento;

public class Documento {

    private String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    public void exportarAPDF() {
        System.out.println("Exportando a PDF: " + contenido);
    }
}

