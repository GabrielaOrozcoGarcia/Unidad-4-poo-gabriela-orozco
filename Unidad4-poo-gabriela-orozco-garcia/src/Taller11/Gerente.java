package Taller11;

public class Gerente extends Empleado {

    private double salarioBase;

    public Gerente(String nombre, double salarioBase) {
        super(nombre);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + 1000; // Bono fijo para gerentes
    }
}
