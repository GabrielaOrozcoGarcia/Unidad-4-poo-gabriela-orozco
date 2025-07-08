package Taller18.Vehiculo;

public class PruebaVehiculo {
    public static void main(String[] args) {

        Conducible vehiculo1 = new AutoISP();
        Conducible vehiculo2 = new Camion();
        Transportador transporte = new Camion();

        vehiculo1.conducir();     // Auto
        vehiculo2.conducir();     // Camion
        transporte.cargarMercancia(); // Camion
    }
}
