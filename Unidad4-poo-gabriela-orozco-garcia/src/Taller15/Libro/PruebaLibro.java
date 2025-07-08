package Taller15.Libro;

public class PruebaLibro {
    public static void main(String[] args) {

        // Crear un libro
        LibroSRP libro = new LibroSRP("La Maria", "Jorge Isaac", 120);

        // Mostrar información
        GestorLibro gestor = new GestorLibro();
        gestor.mostrarInformacion(libro);

        // Generar reporte
        ReporteLibroService reporte = new ReporteLibroService();
        reporte.generarReporte(libro);

        // Guardar en la "base de datos"
        PersistenciaLibroService persistencia = new PersistenciaLibroService();
        persistencia.guardarLibro(libro);
    }
}

