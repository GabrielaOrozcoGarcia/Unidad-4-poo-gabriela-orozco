package Taller11;

public abstract class Empleado {

    //public void calcularSalario() {
        //System.out.println("Salario base: $1000");
    //} Como está concreto, no están obligadas
    // a sobrescribirlo, y eso puede llevar a un comportamiento no deseado o incompleto.

    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Metodo abstracto que deben implementar las subclases
    public abstract double calcularSalario();

    // Metodo común que usa calcularSalario()
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + calcularSalario());
    }
}

