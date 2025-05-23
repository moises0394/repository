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
import java.util.ArrayList;

public class Cargo {
    private int idCargo;
    private String nombre;
    private String descripcion;
    private ArrayList<Complemento> complemento;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Cargo(String nombre, String descripcion, ArrayList<Complemento> complemento,
        LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.complemento = complemento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    

        
    public int getIdCargo() {
        return idCargo;
    }

    public final void setIdCargo(int idCargo) {
     this.idCargo = idCargo;
    }

    public String getNombre() {
        return nombre;
    }

    public final void setNombre(String nombre) {
        this.nombre = nombre.trim();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }



    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public final void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
        }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public final void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
        }

    public ArrayList<Complemento> getComplemento() {
        return complemento;
    }

    public void setComplemento(ArrayList<Complemento> complemento) {
        this.complemento = complemento;
    }
    
    

    
}
