package Taller10;

public class Bicicleta extends Vehiculo{

    @Override
    public void moverse() {
        System.out.println("La bicicleta se mueve");
    }

    //public void moverse(String mensaje) {
        //System.out.println("La bicicleta se mueve");
    //} //Sin @Override no avisaria de un error como el cambio de firma

    // Parece sobrescritura, pero NO lo es (cambia la firma)
    //public void moverse(String mensaje) {
        //System.out.println("La bicicleta dice: " + mensaje);
    //}// Parece sobrescritura, pero NO lo es (cambia la firma)
    //public void moverse(String mensaje) {
        //System.out.println("La bicicleta dice: " + mensaje);
    //}
}
