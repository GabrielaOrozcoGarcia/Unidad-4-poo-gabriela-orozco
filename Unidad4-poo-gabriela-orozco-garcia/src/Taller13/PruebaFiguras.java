package Taller13;

public class PruebaFiguras {
    public static void main(String[] args) {

        Figura rectangulo = new Rectangulo(5, 6);
        Figura triangulo = new Triangulo(8, 6);

        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
        System.out.println("Area del triangulo: " + triangulo.calcularArea());
    }
}

