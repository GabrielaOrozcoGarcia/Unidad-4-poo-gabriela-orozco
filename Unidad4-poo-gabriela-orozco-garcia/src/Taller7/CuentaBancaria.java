package Taller7;

public class CuentaBancaria {

    private int numeroCuenta;
    private int saldo;
    public String tipoCuenta;

    public CuentaBancaria(int numeroCuenta, int saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }

    public void mostrarDetalles(){
        System.out.println("Numero de cuenta: "+ numeroCuenta);
        System.out.println("Saldo: $"+ saldo);
        System.out.println("Tipo de cuenta: "+ tipoCuenta);
    }
}
