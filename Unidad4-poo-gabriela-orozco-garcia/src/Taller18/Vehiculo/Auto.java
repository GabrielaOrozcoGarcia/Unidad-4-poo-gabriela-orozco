package Taller18.Vehiculo;

public class Auto implements Vehiculo {

    @Override
    public void conducir() {
        System.out.println("El auto esta siendo conducido.");
    }

    @Override
    public void cargarMercancia() {
        // No aplica, pero está obligado a implementarlo
    }
}
