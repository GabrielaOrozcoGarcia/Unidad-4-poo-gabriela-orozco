package Taller19.Reportes;

public class ReporteExcel implements GeneradorReporte {

    @Override
    public void generar(String contenido) {
        System.out.println("Generando reporte Excel con el contenido: " + contenido);
    }
}

