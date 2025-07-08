package Taller16.Descuento;

public class PruebaDescuento {
    public static void main(String[] args) {

        double precioProducto = 100000;

        // Aplicando 15% de descuento
        Descuento descuentoPorcentaje = new DescuentoPorcentajeOCP(0.15);

        // Aplicando descuento fijo de $20,000
        Descuento descuentoFijo = new DescuentoFijo(20000);

        double totalConPorcentaje = precioProducto - descuentoPorcentaje.aplicarDescuento(precioProducto);
        double totalConFijo = precioProducto - descuentoFijo.aplicarDescuento(precioProducto);

        System.out.printf("Precio original: $%.2f%n", precioProducto);
        System.out.printf("Precio con 15%% de descuento: $%.2f%n", totalConPorcentaje);
        System.out.printf("Precio con descuento fijo de $20,000: $%.2f%n", totalConFijo);
    }
}
