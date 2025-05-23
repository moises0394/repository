/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.moisesramos.dominio;

import java.time.LocalDate;

/**
 *
 * @author IBIS CARTAGENA IT
 */
public class NominaTotal {
    private int idNominaTotal;
    private LocalDate fecha;
    private String periodo;
    private double totalNomina;

    public NominaTotal(LocalDate fecha, String periodo, double totalNomina) {
        this.fecha = fecha;
        this.periodo = periodo;
        this.totalNomina = totalNomina;
    }

    public int getIdNominaTotal() {
        return idNominaTotal;
    }

    public void setIdNominaTotal(int idNominaTotal) {
        this.idNominaTotal = idNominaTotal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public double getTotalNomina() {
        return totalNomina;
    }

    public void setTotalNomina(double totalNomina) {
        this.totalNomina = totalNomina;
    }
    
    
}
