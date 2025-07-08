package Taller19.Reportes;

public class GestorReportes {

    private GeneradorReporte generador;

    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void exportar(String contenido) {
        generador.generar(contenido);
    }
}
