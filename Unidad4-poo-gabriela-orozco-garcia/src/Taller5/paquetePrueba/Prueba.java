package Taller5.paquetePrueba;

//import Taller5.vehiculos.Moto;

public class Prueba {
    public static void main(String[] args) {

        //Moto moto = new Moto(); // Error porque Moto es una clase default
        // Los siguientes generan error de compilación:
        // System.out.println(moto.tipo); // ERROR: 'tipo' tiene acceso default
        // moto.mostrarTipo(); // ERROR: metodo con acceso default

        // Acceso posible si mostrarMarca fuera public
        // moto.mostrarMarca(); // También falla porque no es public
    }
}

