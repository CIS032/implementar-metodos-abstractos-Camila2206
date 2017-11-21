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
public class EmpleadoComision extends Empleado {

    private double ventasEnBruto;
    private double porcetajeComision;

    public EmpleadoComision(double ventasEnBruto, double porcetajeComision, String nombre, String apellido, String numeroSeguroSocial) {
        super(nombre, apellido, numeroSeguroSocial);

        if (porcetajeComision <= 0.0 || porcetajeComision >= 1.0) {
            throw new IllegalArgumentException(
                    "El porcentaje de comision debe ser > 0.0 y <1.0");
        }
        if (ventasEnBruto < 0.0) {
            throw new IllegalArgumentException(
                    "El porcentaje de ventas en bruto debe ser >= 0.0");
        }

        this.ventasEnBruto = ventasEnBruto;
        this.porcetajeComision = porcetajeComision;
    }

    public void setVentasEnBruto(double ventasEnBruto) {
        if (ventasEnBruto < 0.0) {
            throw new IllegalArgumentException("El porcentaje de ventas en bruto debe ser >= 0.0");
        }
        this.ventasEnBruto = ventasEnBruto;

    }

    public double getVentasEnBruto() {
        return ventasEnBruto;
    }

    public void setPorcetajeComision(double porcetajeComision) {

        if (porcetajeComision <= 0.0 || porcetajeComision >= 1.0) {
            throw new IllegalArgumentException(
                    "El porcentaje de comision debe ser > 0.0 y <1.0");
        }

        this.porcetajeComision = porcetajeComision;
    }

    public double getPorcetajeComision() {
        return porcetajeComision;
    }
    
    @Override
    public double ganancias(){
        return getPorcetajeComision()* getVentasEnBruto(); 
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", "comision del empleado", super.toString(),"Ventas en bruto", getVentasEnBruto(),"Porcentaje de comision", getPorcetajeComision());
    }

}
