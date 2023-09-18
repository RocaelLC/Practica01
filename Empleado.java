import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int ID;
    private double salario;

    public Empleado(String nombre, int ID, double salario) {
        this.nombre = nombre;
        this.ID = ID;
        this.salario = salario;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID(double salario) {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public double calcularSalario() {
    return 0;
    }
    public  double calcularIncentivo(){

        return 0;
    }

}



