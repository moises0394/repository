/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.moisesramos.dominio;

/**
 *
 * @author M. Alejandro
 */
import java.util.ArrayList;
import java.util.List;
public class PuestoDestino {
    private int idPuesto;
    private String nombre;
    private String descripcion;
    private List<Complemento> complementos;
    
    public PuestoDestino(int idPuesto, String nombre, String descripcion) {
        this.idPuesto = idPuesto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.complementos = new ArrayList<>();
    }    
    public int getIdPuesto() {
        return idPuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
       this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }    
}
