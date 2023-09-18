import java.util.Scanner;

public class EmpleadoTiempoCompleto extends Empleado implements  IEmpleado{
    private int horasTrabajadas;

    public EmpleadoTiempoCompleto(String nombre, int ID, double salario, int horasTrabajadas) {
        super(nombre, ID, salario);
        this.horasTrabajadas = horasTrabajadas;
    }



    //Metodo para calcular el salario Mensual
    public double calcularSalario(){

        return getSalario() * horasTrabajadas;


    }
    //Metodo para calcular el Incentivo de tiempo completo
    @Override
    public double calcularIncentivo() {


        return calcularSalario() * 0.05;

    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
