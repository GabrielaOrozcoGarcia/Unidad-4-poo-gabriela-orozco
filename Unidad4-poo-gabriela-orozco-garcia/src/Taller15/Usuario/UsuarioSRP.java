package Taller15.Usuario;

public class UsuarioSRP {
    private String nombre;
    private String contrasenia;

    public UsuarioSRP(String nombre, String contrasenia) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }
}

