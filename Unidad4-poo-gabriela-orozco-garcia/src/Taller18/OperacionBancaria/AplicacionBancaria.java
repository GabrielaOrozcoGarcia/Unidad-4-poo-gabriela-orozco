package Taller18.OperacionBancaria;

public class AplicacionBancaria implements Transferencia, PagoFactura {

    @Override
    public void transferir(double monto) {
        System.out.println("Transfiriendo $" + monto + " desde la app bancaria.");
    }

    @Override
    public void pagarFactura(String servicio) {
        System.out.println("Pagando factura de " + servicio + " desde la app bancaria.");
    }
}

