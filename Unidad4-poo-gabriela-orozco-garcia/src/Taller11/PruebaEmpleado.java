package Taller11;

public class PruebaEmpleado {
    public static void main(String[] args) {

        //Empleado e = new Empleado(); // Error de compilacion

        //Empleado e = new Gerente();
       // e.calcularSalario(); // Ejecuta el metodo de la clase base
        // } // Esto si compila pero, si se espera que todas las subclases
        // personalicen el cálculo del salario, se debe haber declarado el metodo como abstract.

        Empleado emp1 = new Gerente("Gabriela Orozco", 3000);
        Empleado emp2 = new Vendedor("Tania Garcia", 50000, 0.05);

        System.out.println("Detalles del gerente:");
        emp1.mostrarDetalles();

        System.out.println("Detalles del vendedor:");
        emp2.mostrarDetalles();
    }
}
