package Taller15.Producto;

public class ProductoSRP {

    private String nombre;
    private double precioBase;
    private double impuesto;

    public ProductoSRP(String nombre, double precioBase, double impuesto) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.impuesto = impuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getImpuesto() {
        return impuesto;
    }
}
