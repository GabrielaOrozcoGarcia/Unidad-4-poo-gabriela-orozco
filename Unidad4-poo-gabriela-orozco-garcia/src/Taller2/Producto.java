package Taller2;

public class Producto {

    String nombre;
    int precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $ " + precio);
    }

    //public static void mostrarMensaje() {
        //System.out.println("El nombre del producto es: " + this.nombre); //
    //}


    //Metodo no static para poder utilizar this
    public void mostrarMensaje() {
        System.out.println("El nombre del producto es: " + this.nombre);
    }
}
