package Taller11;

public abstract class Figura {

    // Metodo abstracto que debe ser implementado por las subclases
    public abstract double calcularArea();

    // Metodo común que usa el metodo abstracto
    public void mostrarArea() {
        System.out.println("Área: " + calcularArea());
    }
}
