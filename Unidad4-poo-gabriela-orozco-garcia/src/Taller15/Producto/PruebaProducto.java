package Taller15.Producto;

public class PruebaProducto {
    public static void main(String[] args) {

        // Crear producto
        ProductoSRP producto = new ProductoSRP("Carne molida", 24000.0, 0.21);

        // Calcular precio final
        PrecioProductoService calculador = new PrecioProductoService();
        double precioFinal = calculador.calcularPrecioFinal(producto);

        // Generar etiqueta
        EtiquetaProductoService etiqueta = new EtiquetaProductoService();
        etiqueta.generarEtiqueta(producto, precioFinal);

        // Guardar producto
        PersistenciaProductoService persistencia = new PersistenciaProductoService();
        persistencia.guardarProducto(producto);
    }
}
