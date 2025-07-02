package Taller1;

public class CuentaBancaria {

    int numeroCuenta;
    int saldo;
    String tipoCuenta;

    public CuentaBancaria() {
        this.numeroCuenta = 123456;
        this.saldo = 2500 ;
        this.tipoCuenta = "Ahorros";
    }

    public CuentaBancaria(int numeroCuenta,  String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;

    }

    public CuentaBancaria(int numeroCuenta, int saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [Numero de cuenta: " + numeroCuenta + ", Saldo: " + saldo + ", Tipo: " + tipoCuenta + "]";
    }

}
