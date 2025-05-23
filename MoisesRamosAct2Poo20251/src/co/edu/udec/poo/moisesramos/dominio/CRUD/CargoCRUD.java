/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.moisesramos.dominio.CRUD;

import co.edu.udec.poo.moisesramos.dominio.Cargo;
import co.edu.udec.poo.moisesramos.dominio.Complemento;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author M. Alejandro
 */
public class CargoCRUD {
    private ArrayList<Cargo> listaCargos;

    public CargoCRUD(ArrayList<Cargo> listaCargos) {
        this.listaCargos = listaCargos;
    }
    
    public void elminarCargo (int id){
        Iterator<Cargo> iterator = listaCargos.iterator();
                while (iterator.hasNext()) {
            // Se declara una variable de tipo Empleado y se iguala al elemento iterado en el momento
           Cargo cargo = iterator.next();
            if (cargo.getIdCargo() == id) {
                iterator.remove();
                System.out.println("Cargo eliminado" + cargo.getNombre());
                return;
            }
            System.out.println("Cargo no encontrado");
       }
    }
    
    public void buscarCargo (int id){

        Iterator<Cargo> iterator = listaCargos.iterator();
        while (iterator.hasNext()) {
           Cargo cargo = iterator.next();
            if ( cargo.getIdCargo() == id) {
                System.out.println(cargo);
                return;
            }
       }
        System.out.println("Cargo no encontrado");
   }

    public void listarCargo (){
       for (Cargo cargo : listaCargos){
            System.out.println("Cargo: "+ cargo);
        }
    }    
 
         public void editarCargo (int id){
         Scanner teclado = new Scanner(System.in);
         System.out.println(" ");
         System.out.println("Editar datos del cargo");
         
       for (Cargo cargo : listaCargos) {
             if(id == cargo.getIdCargo()){
                 System.out.println("Desea editar el nombre? si/no");
                 String option = teclado.next();
                 if (option.equalsIgnoreCase("si")) {
                     System.out.println("Escriba el nombre del cargo");
                     String nombre = teclado.next();
                     cargo.setNombre(nombre);
                 }
                 
                 System.out.println("Desea editar la descripcion? si/no");
                 String option2 = teclado.next();
                 if (option2.equalsIgnoreCase("si")) {
                     System.out.println("Escriba la descripcion");
                     String descripcion = teclado.next();
                     cargo.setDescripcion(descripcion);
                 }
                 
             System.out.println("Desea editar un complemento? si/no");
             String option3 = teclado.next();
               if (option3.equalsIgnoreCase("si")) {
                 //ArrayList<Complemento> listaComplementos = cargo.getComplemento();
                   for (Complemento complemento: cargo.getComplemento()){
                     System.out.println("Desea editar el tipo? si/no");
                     String select = teclado.next();
                       if (select.equalsIgnoreCase("si")) {
                         System.out.println("Escriba el tipo");
                         String tipo = teclado.next();
                         complemento.setTipo(tipo);
                        } 
                       
                     System.out.println("Desea editar la descripcion? si/no");
                     String select2 = teclado.next();
                       if (select2.equalsIgnoreCase("si")) {
                         System.out.println("Escriba la descripcion");
                         String descripcion = teclado.next();
                         complemento.setDescripcion(descripcion);
                        } 
                       
                     System.out.println("Desea editar el valor? si/no");
                     String select3 = teclado.next();
                       if (select3.equalsIgnoreCase("si")) {
                         System.out.println("Escriba el valor");
                         double valor = teclado.nextDouble();
                         complemento.setValor(valor);
                        } 
                       
                     System.out.println("Desea editar Temporal? si/no");
                     String select4 = teclado.next();
                       if (select4.equalsIgnoreCase("si")) {
                         System.out.println("True = Temporal / False = NO temporal");
                         boolean temporal = teclado.nextBoolean();
                         complemento.setTemporal(temporal);
                        }      
                       
                     System.out.println("Desea editar la fecha de inicio? si/no");
                     String select5 = teclado.next();
                       if (select5.equalsIgnoreCase("si")) {
                         System.out.println("Escriba la fecha de inicio(AAAA-MM-DD)");
                         String fechaStr = teclado.nextLine();
                            try{
                             LocalDate fechaInicio = LocalDate.parse(fechaStr);
                              complemento.setFechaInicio(fechaInicio);
                            }
                            catch (java.time.format.DateTimeParseException e){
                             System.err.println("Error: Formato de fecha invalido. "
                             + "Por favor, use el formato YYYY-MM-DD.");    
                            }
                        }  
                    
                     System.out.println("Desea editar la fecha fin? si/no");
                     String select6 = teclado.next();
                       if (select6.equalsIgnoreCase("si")) {
                         System.out.println("Escriba la fecha fin(AAAA-MM-DD)");
                         String fechaStr = teclado.nextLine();
                            try{
                             LocalDate fechaFin = LocalDate.parse(fechaStr);
                              complemento.setFechaFin(fechaFin);
                            }
                            catch (java.time.format.DateTimeParseException e){
                             System.err.println("Error: Formato de fecha invalido. "
                             + "Por favor, use el formato YYYY-MM-DD.");    
                            }
                        }
                      System.out.println(complemento);  
                    }
                }//Se cierra if de editar complemento
               
             System.out.println("Desea editar la de inicio? si/no");
             String option4 = teclado.next();
                if (option4.equalsIgnoreCase("si")) {
                    System.out.println("Escriba la fecha de inicio(AAAA-MM-DD)");
                    String fechaStr = teclado.nextLine();
                     try{
                       LocalDate fechaInicio = LocalDate.parse(fechaStr);
                       cargo.setFechaInicio(fechaInicio);
                        }
                     catch (java.time.format.DateTimeParseException e){
                     System.err.println("Error: Formato de fecha invalido. "
                             + "Por favor, use el formato YYYY-MM-DD.");    
                    }
                }
                
             System.out.println("Desea editar la de fin? si/no");
             String option5 = teclado.next();
                if (option5.equalsIgnoreCase("si")) {
                    System.out.println("Escriba la fecha de fin(AAAA-MM-DD)");
                    String fechaStr = teclado.nextLine();
                     try{
                       LocalDate fechaFin = LocalDate.parse(fechaStr);
                       cargo.setFechaFin(fechaFin);
                        }
                     catch (java.time.format.DateTimeParseException e){
                     System.err.println("Error: Formato de fecha invalido. "
                             + "Por favor, use el formato YYYY-MM-DD.");    
                    }
                }
                System.out.println(cargo);
            }
        }
         
         
     }
    
    
    
    
}
