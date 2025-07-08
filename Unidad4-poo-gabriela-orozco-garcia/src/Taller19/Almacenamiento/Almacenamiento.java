package Taller19.Almacenamiento;

public interface Almacenamiento {

    void guardar(String archivo, String contenido);
    String recuperar(String archivo);
}

