package Taller13;

public abstract class Figura {

    public abstract double calcularArea();

    //public abstract class Figura {
        //public default void dibujar() {
            //System.out.println("Dibujando figura");
        //}
    //}

    //Uso correcto
    public void dibujar() {
        System.out.println("Dibujando figura desde clase abstracta");
    }
}

