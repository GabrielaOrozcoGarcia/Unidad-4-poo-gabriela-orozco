package Taller14;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Estudiante(); // polimorfismo
        Persona persona3 = new Profesor();   // polimorfismo

        persona1.presentarse();
        persona2.presentarse();
        persona3.presentarse();
    }
}
