package Taller8;

public class Coche extends Vehiculo{

    private int numeroDePuertas;

    public Coche(String marca, double velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Numero de puertas "+ numeroDePuertas);

    }


}
