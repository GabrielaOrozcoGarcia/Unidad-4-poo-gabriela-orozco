package Taller15.Usuario;

public class ValidacionService {

    public boolean validarNombre(String nombre) {
        return nombre != null && !nombre.isEmpty();
    }

    public boolean validarContrasenia(String contrasenia) {
        return contrasenia != null && contrasenia.length() >= 6;
    }
}

