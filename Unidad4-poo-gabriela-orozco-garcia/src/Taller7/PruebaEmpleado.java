package Taller7;

public class PruebaEmpleado {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Gabriela",4500000);
        Empleado empleado2 = new Empleado("Tania",7000000);

        empleado1.MostrarDetalles();
        empleado2.MostrarDetalles();

        //Modifica salarios
        empleado1.setSalario(6000000);
        empleado2.setSalario(8500000);

        System.out.println(empleado1.nombre + " ahora gana: $" + empleado1.getSalario());
        System.out.println(empleado2.nombre + " ahora gana: $" + empleado2.getSalario());
    }
}
