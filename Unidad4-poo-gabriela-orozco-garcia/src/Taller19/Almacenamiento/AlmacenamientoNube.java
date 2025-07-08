package Taller19.Almacenamiento;

public class AlmacenamientoNube implements Almacenamiento {

    @Override
    public void guardar(String archivo, String contenido) {
        System.out.println("Guardando en la nube: " + archivo);

    }

    @Override
    public String recuperar(String archivo) {
        return "Contenido recuperado desde la nube: " + archivo;
    }
}

