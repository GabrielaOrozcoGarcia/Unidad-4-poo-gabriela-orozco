package Taller17.CuentaBancaria;

public class CuentaBancaria {

    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes o monto invalido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

