package Taller19.Autenticacion;

public class PruebaAutenticacion {
    public static void main(String[] args) {

        // Autenticacion local
        ServicioAutenticacion local = new AutenticacionLocal();
        GestorAutenticacion gestorLocal = new GestorAutenticacion(local);
        gestorLocal.iniciarSesion("ADMIN_USER", "2010");

        // Autenticación OAuth
        ServicioAutenticacion oauth = new AutenticacionOAuth();
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(oauth);
        gestorOAuth.iniciarSesion("Gabriela", "a1757@bbhkihk");
    }
}
