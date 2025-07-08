package Taller17.CuentaBancaria;

public class CuentaAhorros extends CuentaBancaria {

    private double tasaInteres;

    public CuentaAhorros(double saldoInicial, double tasaInteres) {
        super(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    public void aplicarInteres() {
        saldo += saldo * tasaInteres;
    }
}

