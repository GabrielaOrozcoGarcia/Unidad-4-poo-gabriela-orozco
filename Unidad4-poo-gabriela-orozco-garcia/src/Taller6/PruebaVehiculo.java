package Taller6;

public class PruebaVehiculo {
    public static void main(String[] args) {

        //Prueba Vehiculo desde la clase no relacionada
        Vehiculo vehiculo = new Vehiculo("Carro", "Mazda");
        System.out.println("Acceso desde clase no relacionada:");

        // Esto compila porque mostrarInformacion() es público
        vehiculo.mostrarDetalles();

        // Esto causa error porque tanto tipo como marca tienen acceso protected en Vehiculo
        // System.out.println(vehiculo.tipo);
        // System.out.println(vehiculo.marca);

        System.out.println("--------------------------------------------------------");

        //Prueba Moto desde subclase Moto
        Moto moto = new Moto("Motocicleta", "Yamaha", 250);
        System.out.println("Acceso desde subclase:");
        moto.mostrarInformacion(); //  acceso válido desde clase relacionada


    }
}
