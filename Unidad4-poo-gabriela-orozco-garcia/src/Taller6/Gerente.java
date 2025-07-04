package Taller6;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, int salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    public void mostrarInformacion(){
        mostrarDetalles();
        System.out.println("Departamento: "+ departamento);
    }
}
