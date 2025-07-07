package Taller7;

public class PruebaUtilidades {
    public static void main(String[] args) {

        double num1 = 20.0;
        double num2 = 4.0;   // cambia a 0.0 para probar división por cero

        System.out.println("Suma: " + Utilidades.suma(num1, num2));
        System.out.println("Resta: " + Utilidades.resta(num1, num2));
        System.out.println("Multiplicación: " + Utilidades.multiplicacion(num1, num2));


        if (num2 != 0) {
            System.out.println("División: " + Utilidades.division(num1, num2));
        } else {
            System.out.println("División: No se puede dividir entre cero.");
        }
    }
}
