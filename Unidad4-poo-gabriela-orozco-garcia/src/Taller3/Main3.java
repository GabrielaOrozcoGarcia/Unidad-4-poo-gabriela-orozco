package Taller3;

public class Main3 {
    public static void main(String[] args) {

        //Prueba Coche
        System.out.println("..::COCHE::..");

        Coche coche1 = new Coche("Mazda", "3");
        Coche coche2 = new Coche("Toyota", "Prado");
        Coche coche3 = new Coche("Mercedes Benz", "CLA 200");

        Coche.mostrarContador();

        //Prueba Matematicas
        System.out.println("..::Matematicas::..");

        int a = 10;
        int b = 2;

        System.out.println("Suma: "+ Matematicas.suma(a, b));
        System.out.println("Resta: "+ Matematicas.resta(a, b) );
        System.out.println("Multiplicacion: "+ Matematicas.multiplicacion(a, b));
        System.out.println("Division: "+ Matematicas.division(a, b));

        //Uso incorrecto y correcto de static
        //Coche.mostarMarca(); //Esto es incorrecto
        coche1.mostrarMarca();//Muestra marca Mazda
    }
}