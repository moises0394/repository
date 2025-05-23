/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.moisesramos.dominio;

/**
 *
 * @author M. Alejandro
 */

//Hola


import java.util.Date;
public class Nomina {
    private int idNomina;
    private Date fechaEmision;
    private String periodo;
    private double salarioBruto;
    private double salarioNeto;
       
    public Nomina(int idNomina, Date fechaEmision, String periodo, Empleado empleado) {
        this.idNomina = idNomina;
        this.fechaEmision = fechaEmision;
        this.periodo = periodo;
        this.salarioBruto = 0.0;
        this.salarioNeto = 0.0;
    }

    public int getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(int idNomina) {
        this.idNomina = idNomina;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioNeto() {
        return salarioNeto;
    }

    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }

   
}
