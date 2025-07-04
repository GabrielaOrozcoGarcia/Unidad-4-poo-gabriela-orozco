package Taller3;

public class Coche {

    String marca;
    String modelo;
    static int contadorCoches = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public static void mostrarContador(){
        System.out.println("Coches creados: " + contadorCoches);
    }

    //Metodo estatico intentando acceder a un atributo no estatico
    //public static void mostrarMarca(){
       // System.out.println("Marca: "+ marca); //Error de compilacion
   // }

    //Metodo corregido
    public void mostrarMarca(){
        System.out.println("Marca: "+ marca);
    }
}
