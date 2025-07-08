package Taller16.Descuento;

public class DescuentoPorcentaje {

    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double aplicarDescuento(double precio) {
        return precio * porcentaje;
    }
}

