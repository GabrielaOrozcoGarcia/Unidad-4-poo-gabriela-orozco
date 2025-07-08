package Taller18.OperacionBancaria;

public interface OperacionBancaria {

    void transferir(double monto);
    void retirar(double monto);
    void pagarFactura(String servicio);
}

