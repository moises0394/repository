/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.moisesramos.dominio.CRUD;

import co.edu.udec.poo.moisesramos.dominio.Empleado;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author M. Alejandro
 */
public class EmpleadoCRUD {
   private ArrayList<Empleado> listaEmpleados;

    public EmpleadoCRUD(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
   
   public void elminarEmpleado (int id){
       //P.Reservada<TipoDato> NombreIterador = ListaArecorrer.iterator()
       //.iterator() es un metodo que es necesario.
        Iterator<Empleado> iterator = listaEmpleados.iterator();
        
        //Mientras haya más elementos
        //.hasNext devuelve true si la iteración tiene más elementos.
        while (iterator.hasNext()) {
            // Se declara una variable de tipo Empleado y se iguala al elemento iterado en el momento
           Empleado empleado = iterator.next();
            if (empleado.getid() == id) {
                iterator.remove();
                System.out.println("Empleado eliminado" + empleado.getNombre());
                return;
            }
            System.out.println("Empleado no encontrado");
       }             
   }
   
     public void buscarEmpleado (int id){
       
        Iterator<Empleado> iterator = listaEmpleados.iterator();
        while (iterator.hasNext()) {
           Empleado empleado = iterator.next();
            if ( empleado.getid() == id) {
                System.out.println(empleado);
                return;
            }
            System.out.println("Empleado no encontrado");
       }             
   }
     
     public void listarEmpleado (){
         for (Empleado empleado : listaEmpleados){
             System.out.println("Empleado: "+ empleado);
         }
     }
     
     public void editarEmpleado (int id){
         Scanner teclado = new Scanner(System.in);
         System.out.println(" ");
         System.out.println("Editar datos del empleado");
         
         for (Empleado empleado : listaEmpleados) {
             if(id == empleado.getid()){
                 System.out.println("Desea editar el nombre? si/no");
                 String option = teclado.next();
                 if (option.equalsIgnoreCase("si")) {
                     System.out.println("Escriba el nombre del empledo");
                     String nombre = teclado.next();
                     empleado.setNombre(nombre);
                 }
                 
                 System.out.println("Desea editar los apellidos? si/no");
                 String option2 = teclado.next();
                 if (option2.equalsIgnoreCase("si")) {
                     System.out.println("Escriba los apellidos del empledo");
                     String apellidos = teclado.next();
                     empleado.setApellidos(apellidos);
                 }
                 
                 System.out.println("Desea editar el telefono? si/no");
                 String option3 = teclado.next();
                 if (option3.equalsIgnoreCase("si")) {
                     System.out.println("Escriba el telefono del empledo");
                     String telefono = teclado.next();
                     empleado.setTelefono(telefono);
                 }
                 
                 System.out.println("Desea editar el direccion? si/no");
                 String option4 = teclado.next();
                 if (option4.equalsIgnoreCase("si")) {
                     System.out.println("Escriba la direccion del empledo");
                     String direccion = teclado.next();
                     empleado.setDireccion(direccion);
                 }
                 
                 System.out.println("Desea editar la cuenta bancaria? si/no");
                 String option5 = teclado.next();
                 if (option5.equalsIgnoreCase("si")) {
                     System.out.println("Escriba la cuenta bancaria del empledo");
                     String cuenta = teclado.next();
                     empleado.setCuentaBancaria(cuenta);
                 } 
                 
                 System.out.println(empleado);
             }
                     
     
         }
         
         
     }
    
    
}
