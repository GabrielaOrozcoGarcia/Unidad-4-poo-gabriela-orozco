package Taller9;

public class Empleado extends Persona{

    private String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.print("Departamento: "+ departamento);
    }
}
