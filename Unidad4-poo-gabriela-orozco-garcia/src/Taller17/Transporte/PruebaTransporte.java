package Taller17.Transporte;

public class PruebaTransporte {
    public static void main(String[] args) {

        Transporte transporte1 = new Bicicleta();
        Transporte transporte2 = new Coche();

        // Las clases derivadas sustituyen sin alterar el comportamiento esperado
        transporte1.moverse();
        transporte2.moverse();
    }
}
