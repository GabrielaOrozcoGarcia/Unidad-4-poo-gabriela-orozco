package Taller8;

public class PerroUsoCorrecto extends Animal implements Cuadrupedo{

    @Override
    public void caminarEnCuatroPatas() {
        System.out.println("El perro camina en cuatro patas.");
    }

    public void ladrar() {
        System.out.println("El perro ladra.");
    }
}
