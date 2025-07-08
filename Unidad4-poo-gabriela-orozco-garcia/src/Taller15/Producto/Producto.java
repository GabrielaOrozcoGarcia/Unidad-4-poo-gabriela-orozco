package Taller15.Producto;

public class Producto {

    private String nombre;
    private double precioBase;
    private double impuesto;

    public Producto(String nombre, double precioBase, double impuesto) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.impuesto = impuesto;
    }

    public void generarEtiqueta() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio Final: $" + (precioBase + (precioBase * impuesto)));
    }

    public double calcularPrecioFinal() {
        return precioBase + (precioBase * impuesto);
    }

    public void guardarProducto() {
        System.out.println("Guardando producto en la base de datos: " + nombre);
    }
}

