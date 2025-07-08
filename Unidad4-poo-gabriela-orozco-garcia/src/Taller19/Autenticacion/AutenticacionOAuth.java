package Taller19.Autenticacion;

public class AutenticacionOAuth implements ServicioAutenticacion {

    @Override
    public boolean autenticar(String usuario, String contrasenia) {

        // Simulación de autenticacion externa
        System.out.println("Autenticando al usuario " + usuario + " mediante OAuth...");
        return true;
    }
}

