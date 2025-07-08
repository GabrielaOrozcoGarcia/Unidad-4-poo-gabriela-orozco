package Taller16.Descuento;

public class DescuentoFijo extends Descuento {

    private double valorFijo;

    public DescuentoFijo(double valorFijo) {
        this.valorFijo = valorFijo;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return valorFijo;
    }
}

