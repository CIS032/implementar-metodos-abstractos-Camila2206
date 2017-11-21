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
public class BaseExtraComisionEmpleado extends EmpleadoComision {

    private double salarioBase;

    public BaseExtraComisionEmpleado(double ventasEnBruto, double porcetajeComision,double salarioBase, String nombre, String apellido, String numeroSeguroSocial) {
        super(ventasEnBruto, porcetajeComision, nombre, apellido, numeroSeguroSocial);
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException(
                    "Elsalario base debe ser >= 0.0");
        }
        this.salarioBase = salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException(
                    "Elsalario base debe ser >= 0.0");
        }

        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
    @Override
    public double ganancias(){
        return getSalarioBase()+ super.ganancias();
    }
    
    @Override
    public String toString(){
        return String.format("%s %s; %s: $%,.2f","salario base", super.toString(),"salario base", getSalarioBase());
    }
    
    

}
