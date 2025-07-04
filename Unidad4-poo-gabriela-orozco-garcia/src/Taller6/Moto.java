package Taller6;

public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarInformacion(){
        mostrarDetalles();
        System.out.println("Cilindrada: "+ cilindrada+ "cc");
    }
}
