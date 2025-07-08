package Taller15.Usuario;

public class PruebaUsuario {
    public static void main(String[] args) {

        // Crear un usuario
        UsuarioSRP usuario = new UsuarioSRP("USER_ADMIN", "201003");

        // Validar datos del usuario
        ValidacionService validador = new ValidacionService();
        boolean nombreValido = validador.validarNombre(usuario.getNombre());
        boolean contraseniaValida = validador.validarContrasenia(usuario.getContrasenia());

        if (nombreValido && contraseniaValida) {
            System.out.println("Datos validos del usuario.");

            // Autenticación
            AutenticacionService auth = new AutenticacionService();
            boolean autenticado = auth.autenticar(usuario, "201003");

            if (autenticado) {
                System.out.println("Autenticacion exitosa.");
            } else {
                System.out.println("Contrasenia incorrecta.");
            }
        } else {
            System.out.println("Datos invalidos. No se puede autenticar.");
        }
    }
}
