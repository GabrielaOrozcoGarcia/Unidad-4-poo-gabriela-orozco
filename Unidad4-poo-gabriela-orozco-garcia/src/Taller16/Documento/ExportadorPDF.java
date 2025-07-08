package Taller16.Documento;

public class ExportadorPDF extends ExportadorDocumento {

    @Override
    public void exportar(DocumentoOCP documento) {
        System.out.println("Exportando a PDF: " + documento.getContenido());
    }
}

