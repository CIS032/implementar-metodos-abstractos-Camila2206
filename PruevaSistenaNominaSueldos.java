/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author USER
 */
public class PruevaSistenaNominaSueldos {

    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        EmpleadoHora empledoHora = new EmpleadoHora(16.75, 40, "Karen", "Price", "222-22-2222");
        EmpleadoComision empleadoComision = new EmpleadoComision(10000, .06, "Sue", "Jones", "333-33-3333");
        BaseExtraComisionEmpleado baseExtraComisionEmpleado = new BaseExtraComisionEmpleado(5000, 0.04, 300, "Bob", "Lewis", "444-44-4444");

        System.out.println("Empleados procesados individualmente:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n", empleadoAsalariado, "ganado", empleadoAsalariado.ganancias());
        System.out.printf("%s%n%s: $%,.2f%n%n", empledoHora, "ganado", empledoHora.ganancias());
        System.out.printf("%s%n%s: $%,.2f%n%n", empleadoComision, "ganado", empleadoComision.ganancias());
        System.out.printf("%s%n%s: $%,.2f%n%n", baseExtraComisionEmpleado, "ganado", baseExtraComisionEmpleado.ganancias());

        Empleado[] empleados = new Empleado[4];
// inicializar array con empleado
        empleados[0] = empleadoAsalariado;
        empleados[1] = empledoHora;
        empleados[2] = empleadoComision;
        empleados[3] = baseExtraComisionEmpleado;

        System.out.printf("Empleado procesado polimorficamente:%n%n");
        for (Empleado empleadoactual : empleados) {
            System.out.println(empleadoactual);
            if (empleadoactual instanceof BaseExtraComisionEmpleado) {
                BaseExtraComisionEmpleado empleado = (BaseExtraComisionEmpleado) empleadoactual;
                empleado.setSalarioBase(1.10 * empleado.getSalarioBase());
                System.out.printf("Nuevo salario base con un aumento del 10%% es:$%,.2f%n\"", empleado.getSalarioBase());

            }
            System.out.printf("ganado $%,.2f%n%n", empleadoactual.ganancias());

        }
        for (int j = 0; j < empleados.length; j++) {
            System.out.printf("Empleados %d es un %s%n", j,
                    empleados[j].getClass().getName());
        }

    }
}
