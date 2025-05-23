/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.moisesramos.dominio;

import java.util.ArrayList;

/**
 *
 * @author M. Alejandro
 */
public class Deduccion {
    private int idDeduccion;
    private double valor;
    private String descripcion;
    private ArrayList<PorTramo> listaPorTramos;
    private ArrayList<Fijo> listaFijos;

    public Deduccion(double valor, String descripcion, 
        ArrayList<PorTramo> listaPorTramos, ArrayList<Fijo> listaFijos) {
        this.valor = valor;
        this.descripcion = descripcion;
        this.listaPorTramos = listaPorTramos;
        this.listaFijos = listaFijos;
    }

    public int getIdDeduccion() {
        return idDeduccion;
    }

    public void setIdDeduccion(int idDeduccion) {
        this.idDeduccion = idDeduccion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<PorTramo> getListaPorTramos() {
        return listaPorTramos;
    }

    public void setListaPorTramos(ArrayList<PorTramo> listaPorTramos) {
        this.listaPorTramos = listaPorTramos;
    }

    public ArrayList<Fijo> getListaFijos() {
        return listaFijos;
    }

    public void setListaFijos(ArrayList<Fijo> listaFijos) {
        this.listaFijos = listaFijos;
    }

    
    
    


}
