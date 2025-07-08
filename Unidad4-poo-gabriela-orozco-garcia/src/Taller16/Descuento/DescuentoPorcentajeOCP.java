package Taller16.Descuento;

public class DescuentoPorcentajeOCP extends Descuento {

    private double porcentaje;

    public DescuentoPorcentajeOCP(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio * porcentaje;
    }
}

