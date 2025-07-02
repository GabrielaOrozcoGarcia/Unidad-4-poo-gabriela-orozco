package Taller2;

public class Estudiante {

    String nombre;
    int edad;

    public Estudiante(){
        this("Gabriela", 21);
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
