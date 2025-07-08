package Taller16.Documento;

public class PruebaDocumento {
    public static void main(String[] args) {

        DocumentoOCP documento = new DocumentoOCP("Este es el informe mensual.");

        ExportadorDocumento pdf = new ExportadorPDF();
        ExportadorDocumento word = new ExportadorWord();
        ExportadorDocumento excel = new ExportadorExcel();

        System.out.println("..::Exportaciones del documento::..");
        pdf.exportar(documento);
        word.exportar(documento);
        excel.exportar(documento);
    }
}
