package Taller18.OperacionBancaria;

public class CajeroISP implements Retiro, PagoFactura {

    @Override
    public void retirar(double monto) {
        System.out.println("Retirando $" + monto + " desde el cajero.");
    }

    @Override
    public void pagarFactura(String servicio) {
        System.out.println("Pagando factura de " + servicio + " desde el cajero.");
    }
}