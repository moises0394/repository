/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.moisesramos.dominio;

/**
 *
 * @author M. Alejandro
 */
import co.edu.udec.poo.moisesramos.dominio.Contrato;
import java.util.ArrayList;
import java.util.Random;
public class Empleado {
    private int id;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String cuentaBancaria;
    private ArrayList<Contrato> contratos;
    private ArrayList<Cargo> cargos;

    public Empleado(String nombre, String apellidos, 
            String telefono, String direccion, String cuentaBancaria,
            ArrayList<Contrato> contratos, ArrayList<Cargo> cargos) {
        Random random = new Random();
        int numero = 100 + random.nextInt(900);
        this.id = numero;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cuentaBancaria = cuentaBancaria;
        this.contratos = contratos;
        this.cargos = cargos;
    }
 



    public int getid() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
    
    public ArrayList<Contrato> getContratos() {
        return new ArrayList<>(this.contratos);
    }
    
    public ArrayList<Cargo> getCargos() {
        return new ArrayList<>(this.cargos);
    }    
    
    public void setContratos(ArrayList<Contrato> contratos) {
        this.contratos = new ArrayList<>(contratos);
    }

    public void setCargos(ArrayList<Cargo> cargos) {
        this.cargos = new ArrayList<>(cargos);
    }
    
    @Override
    public String toString() {
        return "ID:" + id + " "+
               "Nombre:" + nombre + " "+
               "Apellido:" + apellidos+ " " +
               "Telefono:" + telefono + " " +
               "Direccion:" + direccion + " " +
               "C.Bancaria:" + cuentaBancaria; 
               //12:01AM 21-05-2025 Falta toString de contratos y cargos 
    }
    
    
    
}       


/*        public Empleado(String nombre, String apellidos, String telefono, 
//                String direccion, String cuentaBancaria) {
            
        Random random = new Random();
        int numero = 100 + random.nextInt(900);
        this.id = numero;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.cuentaBancaria = cuentaBancaria;
        this.contratos = new ArrayList<>(contratos);
      }











*/