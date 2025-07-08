package Taller18.Mantenimiento;

public class PruebaMantenimiento {
    public static void main(String[] args) {

        Reparador tecnico = new TecnicoISP();
        Limpiador aseador = new PersonalLimpieza();

        tecnico.reparar();
        aseador.limpiar();
    }
}
