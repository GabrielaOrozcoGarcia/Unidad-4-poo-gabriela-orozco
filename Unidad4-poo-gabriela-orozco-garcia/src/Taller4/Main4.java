package Taller4;

public class Main4 {
    public static void main(String[] args) {

        //Estudiante
        System.out.println("..::ESTUDIANTE::..");
        Estudiante estudiante= new Estudiante();

        estudiante.setNombre("Gabriela");
        estudiante.setEdad(21);
        estudiante.setNotaPromedio(5.0);

        System.out.println("Nombre: "+ estudiante.getNombre());
        System.out.println("Edad: "+ estudiante.getEdad());
        System.out.println("Nota Promedio: "+ estudiante.getNotaPromedio());

        //Coche
        System.out.println("..::COCHE::..");

        Coche coche = new Coche("Mercedes Benz", "CLA 200", 850);

        //Se accede directamente a los metodos privados
        //coche.velocidadMaxima = 23.8;//Error de compilacion
        //System.out.println(coche.marca);//Error

        //Uso correcto mediante el metodo
        coche.acelerar(45);
        System.out.println("Marca; "+ coche.getMarca());
        System.out.println("Modelo: "+ coche.getModelo());
        System.out.println("Velocidad Maxima: "+ coche.getVelocidadMaxima());

    }
}
