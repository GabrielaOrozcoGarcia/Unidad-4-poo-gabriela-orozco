package Taller15.Usuario;

public class AutenticacionService {

    public boolean autenticar(UsuarioSRP usuario, String inputContrasenia) {
        return usuario.getContrasenia().equals(inputContrasenia);
    }
}

