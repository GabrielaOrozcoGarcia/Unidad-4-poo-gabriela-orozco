package Taller19.Autenticacion;

public class AutenticacionLocal implements ServicioAutenticacion {

    @Override
    public boolean autenticar(String usuario, String contrasenia) {

        // Simulación de autenticacion local
        return "ADMIN_USER".equals(usuario) && "2010".equals(contrasenia);
    }
}

