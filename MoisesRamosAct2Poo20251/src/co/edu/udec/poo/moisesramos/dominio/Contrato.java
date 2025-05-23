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
import java.util.Random;
public class Contrato {
    private int idContrato;
    private LocalDate fechaAlta;
    private LocalDate fechaBaja;
    private boolean activo;
    private Categoria categoria; 

    public Contrato(LocalDate fechaAlta, LocalDate fechaBaja, boolean activo) { //Falta colocar el constructor de Categoria
        Random random = new Random();
        int numero = 100 + random.nextInt(900);
        this.idContrato = numero;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.activo = activo;
        this.categoria = categoria;
    }

    
    public int getIdContrato() {
        return idContrato;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
    @Override
    public String toString() {
        return "ID:" + idContrato + "  "+
               "FechaAlta:" + fechaAlta + "  "+
               "FechaBaja:" + fechaBaja+ "  " +
               "Estado:" + activo + "  ";
//             "Direccion:" + categoria + " " +          
    }
    
    
    
    
 

     }

