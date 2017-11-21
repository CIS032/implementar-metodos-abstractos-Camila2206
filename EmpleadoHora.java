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
public class EmpleadoHora extends Empleado {

    private double salario;
    private double horas;

    public EmpleadoHora(double salario, double horas, String nombre, String apellido, String numeroSeguroSocial) {
        super(nombre, apellido, numeroSeguroSocial);
        
        if (salario < 0.0) {
            throw new IllegalArgumentException(
                    "El salario por hora debe ser >= 0.0");
        }
        if ((horas < 0.0 || (horas > 168.0))) {
            throw new IllegalArgumentException(
                    "las horas trabajadas deben ser >= 0.0 y <=168.0");
        }

        this.salario = salario;
        this.horas = horas;
    }
//SET PARA SALARIO

    public void setSalario(double salario) {
        if (salario < 0.0) {
            throw new IllegalArgumentException(
                    "El salario por hora debe ser >= 0.0");
        }

        this.salario = salario;
    }
//GET PARA SALARIO

    public double getSalario() {
        return salario;
    }

//SET PARA HORAS  
    public void setHoras(double horas) {
        if (horas < 0.0 || (horas > 168.0)) {
            throw new IllegalArgumentException(
                    "Las horas trabajadas debe ser >= 0.0 y <=168.0");
        }

        this.salario = salario;
    }

//GET PARA HORAS
    public double getHoras() {
        return horas;
    }

    @Override
    public double ganancias() {
        if (getHoras() <= 40) {
            return getSalario() * getHoras();
        } else {
            return 40 * getSalario() + (getHoras() - 40) * getSalario() * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("Empleado por hora: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(), "Salario por horas", getSalario(),
                "horas trabajadas", getHoras());
    }

}
