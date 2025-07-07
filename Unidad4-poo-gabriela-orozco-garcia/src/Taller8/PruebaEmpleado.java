package Taller8;

public class PruebaEmpleado {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Gabriela Orozco", 2500000);
        Gerente gerente1 = new Gerente("Tania Garcia", 4500000, "Finanzas");

        System.out.println("..::Detalles del Empleado::..");
        empleado1.mostrarDetalles();

        System.out.println("..::Detalles del Gerente::..");
        gerente1.mostrarDetalles();
    }
}
