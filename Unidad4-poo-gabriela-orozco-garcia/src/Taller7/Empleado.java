package Taller7;

public class Empleado {

    public String nombre;
    private int salario;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario no puede ser negativo");
            this.salario = 0;
        }
    }

    public void MostrarDetalles(){
        System.out.println("Nombre: "+ nombre );
        System.out.println("Salario: $"+ salario);
    }
}
