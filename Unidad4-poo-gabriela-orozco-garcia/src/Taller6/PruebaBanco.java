package Taller6;

public class PruebaBanco {
    public static void main(String[] args) {

        BancoMejorada cuenta = new BancoMejorada(2000);

        cuenta.depositar(900);
        cuenta.retirar(100);
        cuenta.mostrarSaldo();

        // cuenta.saldo = -5000; // No se puede porque saldo es priuado

    }
}
