public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        //intancia de los empleados
        Empleado empleado1= new EmpleadoTiempoCompleto("Rocael", 1000,4500,150);
        Empleado empleado2= new EmpleadoTiempoParcial("Zapata", 2000,25,22);

        //calling :)
        System.out.println("salario de: " + empleado1.getNombre() + ": $" + empleado1.calcularSalario());
        System.out.println("el incentivo es: " + empleado1.calcularIncentivo());
        System.out.println("salario de: " + empleado2.getNombre() + ": $" + empleado2.calcularSalario());
        System.out.println("el incentivo es: "+ empleado2.calcularIncentivo());




        }
    }
