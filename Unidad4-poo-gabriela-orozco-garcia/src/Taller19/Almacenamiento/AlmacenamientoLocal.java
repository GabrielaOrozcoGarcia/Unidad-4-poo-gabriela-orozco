package Taller19.Almacenamiento;

public class AlmacenamientoLocal implements Almacenamiento {

    @Override
    public void guardar(String archivo, String contenido) {
        System.out.println("Guardando en almacenamiento local: " + archivo);

    }

    @Override
    public String recuperar(String archivo) {
        return "Contenido recuperado de almacenamiento local: " + archivo;
    }
}
