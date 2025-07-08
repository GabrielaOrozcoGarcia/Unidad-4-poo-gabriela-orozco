package Taller18.Mantenimiento;

public class TecnicoISP implements Reparador {

    @Override
    public void reparar() {
        System.out.println("El tecnico esta realizando reparaciones.");
    }
}
