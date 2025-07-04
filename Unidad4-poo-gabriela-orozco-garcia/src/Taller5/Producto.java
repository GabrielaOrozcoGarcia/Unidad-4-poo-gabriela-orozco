package Taller5;

class Producto {

    String nombre;
    Double precio;
    int stock;

    Producto(String nombre, Double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Precio: $" + precio + "Stock: " + stock);
    }


    class Prueba{
        public static void main(String[] args) {

            System.out.println("..::PRODUCTO::..");
            Producto producto = new Producto("Bolso", 145.000, 3);
            producto.mostrarInfo();

        }

    }
}
