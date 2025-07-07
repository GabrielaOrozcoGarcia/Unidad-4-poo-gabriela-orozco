package Taller10;

public class PruebaPersona {
    public static void main(String[] args) {

        Persona persona = new Persona();
        Persona estudiante = new Estudiante(); //Se aplica polimorfismo
        Persona profesor = new Profesor(); //Se aplica polimorfismo

        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();
    }
}

