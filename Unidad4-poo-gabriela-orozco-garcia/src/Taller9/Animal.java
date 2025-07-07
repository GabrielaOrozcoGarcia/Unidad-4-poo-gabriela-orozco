package Taller9;

public class Animal {

    //private String especie;
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }
    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }

    //public void malUsoDeSuper() {
       // super.mostrarEspecie();  // Animal no hereda de ninguna clase con ese metodo
    //}
}

