/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.moisesramos.dominio;

/**
 *
 * @author M. Alejandro
 */
import java.util.Date;
public class Trienio {
    private int idTrienio;
    private Date fechaInicio;
    private Date fechaFin;
    private double valor;

     public Trienio(int idTrienio, Date fechaInicio, Date fechaFin, Categoria categoria) {
        }   
     
    public int getIdTrienio() {
        return idTrienio;
    }

    public final void setIdTrienio(int idTrienio) {
        this.idTrienio = idTrienio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public final void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public final void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getValor() {
        return valor;
    }
    
}
