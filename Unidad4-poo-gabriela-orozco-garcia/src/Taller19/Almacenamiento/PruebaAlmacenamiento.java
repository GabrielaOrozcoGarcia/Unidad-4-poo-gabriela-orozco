package Taller19.Almacenamiento;

public class PruebaAlmacenamiento {
    public static void main(String[] args) {

        Almacenamiento local = new AlmacenamientoLocal();
        Almacenamiento nube = new AlmacenamientoNube();

        GestorArchivos gestorLocal = new GestorArchivos(local);
        gestorLocal.procesarArchivo("reporte.txt", "Contenido de prueba local");

        GestorArchivos gestorNube = new GestorArchivos(nube);
        gestorNube.procesarArchivo("backup.txt", "Contenido para la nube");
    }
}
