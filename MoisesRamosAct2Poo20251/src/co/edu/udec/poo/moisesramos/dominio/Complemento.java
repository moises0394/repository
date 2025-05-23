/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.moisesramos.dominio;

/**
 *
 * @author M. Alejandro
 */
import java.time.LocalDate;

public class Complemento {
    private int idComplemento;
    private String tipo;
    private String descripcion;
    private double valor;
    private boolean temporal;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Complemento(String tipo, String descripcion, double valor,
        boolean temporal, LocalDate fechaInicio, LocalDate fechaFin) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.valor = valor;
        this.temporal = temporal;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }


    public int getIdComplemento() {
        return idComplemento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
       this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
       this.valor = valor;
    }

    public boolean isTemporal() {
        return temporal;
    }

    public void setTemporal(boolean temporal) {
        this.temporal = temporal;
   }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
   }
    
}
