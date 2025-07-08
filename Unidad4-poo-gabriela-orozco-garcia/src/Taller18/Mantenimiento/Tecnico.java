package Taller18.Mantenimiento;

public class Tecnico implements Mantenimiento {

    @Override
    public void reparar() {
        System.out.println("Reparando el sistema...");
    }

    @Override
    public void limpiar() {
        // No tiene sentido, pero está obligado a implementarlo
    }
}

