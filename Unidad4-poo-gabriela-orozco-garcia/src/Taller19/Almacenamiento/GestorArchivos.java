package Taller19.Almacenamiento;

public class GestorArchivos {

    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void procesarArchivo(String archivo, String contenido) {
        almacenamiento.guardar(archivo, contenido);
        String resultado = almacenamiento.recuperar(archivo);
        System.out.println("Resultado: " + resultado);
    }
}

