package Taller7;

public class PruebaCuentaBancaria {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria(987654321, 1000000, "Ahorros");

        cuenta1.mostrarDetalles();

        // Acceso permitido a tipoCuenta (es pública)
        cuenta1.tipoCuenta = "Corriente";
        System.out.println("Tipo de cuenta actualizado: " + cuenta1.tipoCuenta);

        // Modificar saldo mediante set
        cuenta1.setSaldo(2000000);
        System.out.println("Saldo actualizado: $" + cuenta1.getSaldo());

        // Intento de acceso directo a numeroCuenta
        // cuenta1.numeroCuenta = "111222333";  // <-- Error: numeroCuenta has private access

        // También causa error si se intenta leer directamente
        // System.out.println("Número de cuenta: " + cuenta1.numeroCuenta);  // <-- Error
    }
}
