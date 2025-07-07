package Taller9;

public class Persona {

    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles(){
        System.out.print("Nombre: "+ nombre);
        System.out.print("Edad: "+ edad);
    }
}

