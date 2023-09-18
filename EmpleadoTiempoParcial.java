import java.util.Scanner;

public class EmpleadoTiempoParcial extends Empleado implements IEmpleado{
    private int horasPorSemana;

    public EmpleadoTiempoParcial(String nombre, int ID, double salario, int horasPorSemana) {
        super(nombre, ID, salario);
        this.horasPorSemana = horasPorSemana;
    }

    //Metodo para calcular el salario semanal
    @Override
    public double calcularSalario(){

        return getSalario() * horasPorSemana;


    }
    //Metodo para calcular el Incentivo semanal

    @Override
    public double calcularIncentivo() {
        //System.out.println("el incentivo es: ");

        return calcularSalario() * 0.03;
    }
    public int getHorasPorSemana() {
        return horasPorSemana;
    }


    public void setHorasPorSemana(int horasPorSemana) {
        this.horasPorSemana = horasPorSemana;
    }
}
