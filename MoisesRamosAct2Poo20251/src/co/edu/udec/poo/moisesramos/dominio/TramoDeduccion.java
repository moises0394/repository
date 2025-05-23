/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.moisesramos.dominio;

/**
 *
 * @author M. Alejandro
 */
public class TramoDeduccion {
    private int idTramo;
    private double limiteInferior;
    private double limiteSuperior;
    private double porcentaje;

public TramoDeduccion(int idTramo, double limiteInferior, 
                         double limiteSuperior, double porcentaje){
}
    public int getIdTramo() {
        return idTramo;
    }

    public final void setIdTramo(int idTramo) {
        this.idTramo = idTramo;
    }

    public double getLimiteInferior() {
        return limiteInferior;
    }

    public final void setLimiteInferior(double limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public double getLimiteSuperior() {
        return limiteSuperior;
    }

    public final void setLimiteSuperior(double limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public final void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

}

