package Taller19.Reportes;

public class PruebaReportes {
    public static void main(String[] args) {


        GeneradorReporte pdf = new ReportePDF();
        GeneradorReporte excel = new ReporteExcel();

        GestorReportes gestor1 = new GestorReportes(pdf);
        gestor1.exportar("Informe financiero del mes de octubre");

        GestorReportes gestor2 = new GestorReportes(excel);
        gestor2.exportar("Datos financieros mensuales");
    }
}
