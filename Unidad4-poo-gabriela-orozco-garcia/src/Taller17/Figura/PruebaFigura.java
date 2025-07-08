package Taller17.Figura;

public class PruebaFigura {
    public static void main(String[] args) {

        Figura figura1 = new Circulo(3.0);
        Figura figura2 = new Rectangulo(4.0, 5.0);

        // Sustituimos la clase base por clases derivadas sin cambiar el comportamiento
        System.out.printf("Area del circulo: %.2f%n", figura1.calcularArea());
        System.out.printf("Area del rectangulo: %.2f%n", figura2.calcularArea());
    }
}
