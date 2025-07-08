package Taller14;

public class PruebaPolimorfismo {
    public static void main(String[] args) {

        Persona persona = new Estudiante(); // polimorfismo: referencia de tipo Persona
        persona.presentarse();              // Llama al metodo sobrescrito de Estudiante
        //persona.estudiar();                 //  estudiar() no está en la clase Persona
    }
}
