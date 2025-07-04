package Taller4;

public class Coche {

    private String marca;
    private String modelo;
    private double velocidadMaxima;

    public Coche(String marca, String modelo, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(int incremento){
        if (incremento > 0){
            velocidadMaxima += incremento;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    //Si esta clase no tendria get ni set estaria totalmente protegida, lo cual impide acceder
    //a los valores desde fuera, protegiendo asi los datos pero limitando la funcionalidad.
}
