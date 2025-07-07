package Taller8;

public class PruebaEstudiante {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Gabriela", 21, "A12345");
        Estudiante estudiante2 = new Estudiante("Tania", 22, "B54321");

        System.out.println("Estudiante 1: ");
        estudiante1.mostrarDetalles();

        System.out.println("Estudiante 2: ");
        estudiante2.mostrarDetalles();
    }
}
