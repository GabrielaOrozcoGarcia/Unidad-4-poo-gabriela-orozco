package Taller14;

public class PruebaVehiculo {
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Coche();       // Referencia de tipo base
        Vehiculo vehiculo2 = new Bicicleta();   // Referencia de tipo base

        vehiculo1.mover();  // Ejecuta mover() de Coche
        vehiculo2.mover();  // Ejecuta mover() de Bicicleta
    }
}
