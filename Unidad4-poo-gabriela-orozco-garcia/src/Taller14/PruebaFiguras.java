package Taller14;

public class PruebaFiguras {
    public static void main(String[] args) {

        Figura figura1 = new Circulo(3.0);
        Figura figura2 = new Rectangulo(4.0, 5.0);
        Figura figura3 = new Figura();

        figura1.calcularArea(); // Llama al metodo de Circulo
        figura2.calcularArea(); // Llama al metodo de Rectangulo
        figura3.calcularArea(); // Llama al metodo general de Figura
    }
}

