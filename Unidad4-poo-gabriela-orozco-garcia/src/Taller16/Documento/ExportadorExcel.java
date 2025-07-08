package Taller16.Documento;

public class ExportadorExcel extends ExportadorDocumento {

    @Override
    public void exportar(DocumentoOCP documento) {
        System.out.println("Exportando a Excel: " + documento.getContenido());
    }
}

