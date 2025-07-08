package Taller12;

public class Pez implements Nadador, Respirador {

    @Override
    public void nadar() {
        System.out.println("El pez nada agilmente en el agua.");
    }

    @Override
    public void respirar() {
        System.out.println("El pez respira mediante branquias.");
    }
}
