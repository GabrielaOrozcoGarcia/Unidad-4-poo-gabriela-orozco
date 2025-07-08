package Taller15.Usuario;

public class Usuario {


    private String nombre;
    private String contrasenia;

    public Usuario(String nombre, String contrasenia) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }

    public boolean autenticar(String inputContrasenia) {
        return this.contrasenia.equals(inputContrasenia);
    }

    public boolean validarNombre() {
        return nombre != null && !nombre.isEmpty();
    }

    public boolean validarContrasena() {
        return contrasenia != null && contrasenia.length() >= 6;
    }
}

