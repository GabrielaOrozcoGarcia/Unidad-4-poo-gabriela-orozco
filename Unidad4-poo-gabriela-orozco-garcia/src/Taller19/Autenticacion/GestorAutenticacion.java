package Taller19.Autenticacion;

public class GestorAutenticacion {

    private ServicioAutenticacion servicio;

    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }

    public void iniciarSesion(String usuario, String contrasenia) {
        if (servicio.autenticar(usuario, contrasenia)) {
            System.out.println("Autenticacion exitosa.");
        } else {
            System.out.println("Autenticacion fallida.");
        }
    }
}

