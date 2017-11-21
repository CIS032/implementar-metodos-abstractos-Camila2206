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
public abstract  class  Empleado {
    private final String nombre;
    private final String apellido;
    private final String numeroSeguroSocial;

    public Empleado(String nombre, String apellido, String numeroSeguroSocial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    @Override
    public String toString() {
        return String.format("%s %s%nNumero de seguro social: %s",
                getNombre(),getApellido(),getNumeroSeguroSocial());
                
    }
    
    public abstract double ganancias(); 
    

    
    
    
    
    
}
