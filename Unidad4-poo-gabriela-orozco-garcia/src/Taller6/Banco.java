package Taller6;

public class Banco {

    protected double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void mostrarSaldo(){
        System.out.println("Saldo actual: $"+ saldo);
    }
}

//Usar el modificador protected para la propiedad saldo en la clase Banco no es seguro,
// ya que permite que tanto las subclases como cualquier clase del mismo paquete puedan
// acceder y modificar directamente ese valor, incluso de forma incorrecta o no intencionada.
// Esto rompe el principio de encapsulamiento, ya que no hay control sobre cómo se altera el saldo.
