package Taller16.Documento;

public class ExportadorWord extends ExportadorDocumento {

    @Override
    public void exportar(DocumentoOCP documento) {
        System.out.println("Exportando a Word: " + documento.getContenido());
    }
}

