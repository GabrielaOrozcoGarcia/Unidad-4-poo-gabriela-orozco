package Taller2;


public class Main2 {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Camiseta", 25000);
        producto1.mostrarDetalles();
        producto1.mostrarMensaje();

        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante("Juan Orozco", 26);
        System.out.println("Estudiante 1: ");
        estudiante1.mostrarDetalles();
        System.out.println("Estudiante 2: ");
        estudiante2.mostrarDetalles();
    }
}