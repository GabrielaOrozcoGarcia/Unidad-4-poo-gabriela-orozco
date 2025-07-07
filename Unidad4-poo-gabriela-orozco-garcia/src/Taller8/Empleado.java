package Taller8;

public class Empleado {

    protected String  nombre;
    protected int salario;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $"+ salario);
    }
}

