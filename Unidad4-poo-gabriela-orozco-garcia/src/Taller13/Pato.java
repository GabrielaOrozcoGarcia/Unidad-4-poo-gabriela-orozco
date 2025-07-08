package Taller13;

public class Pato implements Volador, Nadador {

    private String nombre;

    public Pato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando sobre el lago.");
    }

    @Override
    public void nadar() {
        System.out.println(nombre + " está nadando en el agua.");
    }
}