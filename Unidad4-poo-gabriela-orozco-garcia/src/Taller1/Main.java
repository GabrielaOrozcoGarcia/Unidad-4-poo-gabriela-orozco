package Taller1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // === LIBRO ===
        System.out.println("..:: LIBRO ::..");
        System.out.print("Ingrese el titulo: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el numero de paginas: ");
        int numeroPaginas = scanner.nextInt();
        scanner.nextLine();
        Libro libro1 = new Libro(titulo, autor, numeroPaginas);

        // Otro libro con constructor por defecto
        Libro libro2 = new Libro();

        // === CUENTA BANCARIA ===
        System.out.println("\n..:: CUENTA BANCARIA ::..");
        System.out.print("Ingrese el numero de cuenta: ");
        int numeroCuenta = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        System.out.print("Ingrese el saldo: ");
        int saldo = scanner.nextInt();
        scanner.nextLine();
        CuentaBancaria cuenta1 = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);

        // Otra cuenta con constructor que solo incluye número de cuenta y tipo de cuenta
        CuentaBancaria cuenta2 = new CuentaBancaria(999999, "Corriente");

        // === ESTUDIANTE ===
        System.out.println("\n..:: ESTUDIANTE ::..");
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el curso: ");
        String curso = scanner.nextLine();
        Estudiante estudiante1 = new Estudiante(nombre, edad, curso);

        // Otro estudiante con constructor que solo incluye nombre y edad
        Estudiante estudiante2 = new Estudiante("Laura Ruiz", 19);

        // === MOSTRAR DETALLES USANDO toString() ===
        System.out.println("\n..:: OBJETOS CREADOS ::..");

        System.out.println("\nLibro 1 (datos ingresados):");
        System.out.println(libro1.toString());

        System.out.println("\nLibro 2 (constructor por defecto):");
        System.out.println(libro2.toString());

        System.out.println("\nCuenta 1 (datos ingresados):");
        System.out.println(cuenta1.toString());

        System.out.println("\nCuenta 2 (constructor con numero y tipo de cuenta):");
        System.out.println(cuenta2.toString());

        System.out.println("\nEstudiante 1 (datos ingresados):");
        System.out.println(estudiante1.toString());

        System.out.println("\nEstudiante 2 (constructor con nombre y edad):");
        System.out.println(estudiante2.toString());

        scanner.close();
    }
}