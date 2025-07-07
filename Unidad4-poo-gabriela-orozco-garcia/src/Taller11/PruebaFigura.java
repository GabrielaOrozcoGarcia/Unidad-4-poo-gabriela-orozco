package Taller11;

public class PruebaFigura {
    public static void main(String[] args) {

        Figura f1 = new Circulo(5);
        Figura f2 = new Rectangulo(4, 6);

        System.out.println("Círculo:");
        f1.mostrarArea();

        System.out.println("Rectángulo:");
        f2.mostrarArea();
    }
}
