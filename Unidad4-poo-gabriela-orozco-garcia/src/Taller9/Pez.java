package Taller9;

public class Pez extends Animal {

    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie();
        System.out.println("Tipo de Agua: " + tipoDeAgua);
    }

    //public void mostrarDetalles() {
        // No se puede acceder directamente a especie (es private)
        //System.out.println("Especie: " + super.especie);  // ← ERROR aquí
        //System.out.println("Tipo de Agua: " + tipoDeAgua);
    //}
}