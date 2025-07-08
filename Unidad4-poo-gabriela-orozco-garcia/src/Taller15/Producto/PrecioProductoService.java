package Taller15.Producto;

public class PrecioProductoService {
    public double calcularPrecioFinal(ProductoSRP producto) {
        return producto.getPrecioBase() + (producto.getPrecioBase() * producto.getImpuesto());
    }
}

