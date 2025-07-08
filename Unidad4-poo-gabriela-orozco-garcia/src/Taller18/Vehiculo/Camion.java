package Taller18.Vehiculo;

public class Camion implements Conducible, Transportador {

    @Override
    public void conducir() {
        System.out.println("El camion esta siendo conducido en autopista.");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("El camion esta cargando mercancias pesadas.");
    }
}

