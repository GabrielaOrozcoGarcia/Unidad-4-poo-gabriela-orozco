package Taller8;

public class Vehiculo {

    private String marca;
    private double velocidadMaxima;

    public Vehiculo(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarDetalles(){
        System.out.println("Marca: "+ marca + "Velocidad maxima: "+ velocidadMaxima);
    }

}
