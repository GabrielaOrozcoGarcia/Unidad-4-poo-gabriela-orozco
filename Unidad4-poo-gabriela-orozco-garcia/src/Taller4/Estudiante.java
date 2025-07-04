package Taller4;

public class Estudiante {

    private String nombre;
    private int edad;
    private double notaPromedio;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNombre(String nombre){
        if (nombre != null && !nombre.isEmpty()){
            this.nombre = nombre;
        }
    }

    public void setEdad(int edad){
        if (edad >= 0 & edad <= 100){
            this.edad = edad;
        }
    }

    public void setNotaPromedio(double notaPromedio){
        if (notaPromedio >= 0.0 && notaPromedio <= 5.0){
            this.notaPromedio = notaPromedio;
        }
    }
}
