/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package co.edu.udec.poo.moisesramos.dominio;

/**
 *
 * @author M. Alejandro
 */
public enum Categoria {
            A(1000000, 0.05),   
	    B(2000000, 0.07),   
	    C(3000000, 0.10); 

	    private final double sueldoBase;
	    private final double porcentajeTrienio;

		Categoria(double sueldoBase, double porcentajeTrienio) {
	        this.sueldoBase = sueldoBase;
	        this.porcentajeTrienio = porcentajeTrienio;
	    }

	    public double getSueldoBase() {
	        return sueldoBase;
	    }

	    public double getPorcentajeTrienio() {
	        return porcentajeTrienio;
	    }

}
