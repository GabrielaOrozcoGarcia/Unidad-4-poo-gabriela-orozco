package Taller18.OperacionBancaria;

public class Cajero implements OperacionBancaria {

    @Override
    public void transferir(double monto) {
        // No aplica
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retirando $" + monto + " desde cajero.");
    }

    @Override
    public void pagarFactura(String servicio) {
        System.out.println("Pagando factura de " + servicio + " en el cajero.");
    }
}

