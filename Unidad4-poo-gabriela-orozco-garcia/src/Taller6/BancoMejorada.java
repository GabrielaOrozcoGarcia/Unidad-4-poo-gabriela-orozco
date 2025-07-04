package Taller6;

public class BancoMejorada {

    private double saldo;

    public BancoMejorada(double saldoInicial) {
        if (saldoInicial >= 0){
            this.saldo = saldoInicial;
        }else {
            this.saldo = 0;
        }

    }

    public void depositar(int cantidad){
        if (cantidad > 0){
            saldo += cantidad;
        }else{
            System.out.println("No se puede depositar una cantidad negativa");
        }

    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Error: saldo insuficiente o cantidad inválida.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }
}

//Para proteger adecuadamente esta propiedad, lo correcto es declarar saldo como private
// y proporcionar métodos públicos controlados (depositar, retirar, getSaldo) que verifiquen
// la validez de las operaciones y mantengan la integridad de los datos.
