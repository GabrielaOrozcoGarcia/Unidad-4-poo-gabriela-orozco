package Taller18.OperacionBancaria;

public class PruebaOperacionBancaria {
    public static void main(String[] args) {

        Retiro cajero = new CajeroISP();
        PagoFactura app = new AplicacionBancaria();
        Transferencia transferencia = new AplicacionBancaria();

        cajero.retirar(300000);
        app.pagarFactura("Electricidad");
        transferencia.transferir(210000);
    }
}
