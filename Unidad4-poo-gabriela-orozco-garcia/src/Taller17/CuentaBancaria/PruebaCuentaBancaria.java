package Taller17.CuentaBancaria;

public class PruebaCuentaBancaria {
    public static void main(String[] args) {

        // Usamos la clase derivada como si fuera la base (polimorfismo)
        CuentaBancaria cuenta = new CuentaAhorros(1000, 0.05);

        cuenta.depositar(500);
        cuenta.retirar(200);
        System.out.println("Saldo actual: $" + cuenta.getSaldo());

        // Acceso a funcionalidad adicional usando cast seguro
        if (cuenta instanceof CuentaAhorros) {
            ((CuentaAhorros) cuenta).aplicarInteres();
            System.out.println("Saldo con interes aplicado: $" + cuenta.getSaldo());
        }
    }
}
