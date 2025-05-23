/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.moisesramos.dominio.CRUD;

import co.edu.udec.poo.moisesramos.dominio.Contrato;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author M. Alejandro
 * 
 * CRUD para la clase Contrato: 
 *                              Buscar
 *                              Listar
 *                              Editar
 */
public class ContratoCRUD {
    private ArrayList<Contrato>listaContratos;

    public ContratoCRUD(ArrayList<Contrato> listaContratos) {
        this.listaContratos = listaContratos;
    }
    
    public void buscarContrato (int id){
        Iterator<Contrato> iterator = listaContratos.iterator();
        while(iterator.hasNext()){
            Contrato contrato = iterator.next();
            if (contrato.getIdContrato() == id){
                System.out.println(contrato);
                return;
            }
            System.out.println("Contrato no encontrado");
        }
        
    }
   
     public void listarContrato (){
         for (Contrato contrato : listaContratos){
             System.out.println("Contrato: "+ contrato);
         }
     }
    
     public void editarContrato (int id){
         Scanner teclado = new Scanner(System.in);
         System.out.println(" ");
         System.out.println("  <<<EDITAR DATOS DEL CONTRATO>>>");
         
          for (Contrato contrato : listaContratos) {
               if(id == contrato.getIdContrato()){
                 System.out.println("Desea editar la fecha de alta? si/no");
                 String option = teclado.nextLine();
                    if (option.equalsIgnoreCase("si")) {
                     System.out.println("Escriba la fecha de alta(AAAA-MM-DD)");
                     String fechaStr = teclado.nextLine();
                        try{
                         LocalDate fechaAlta = LocalDate.parse(fechaStr);
                          contrato.setFechaAlta(fechaAlta);
                        }
                        catch (java.time.format.DateTimeParseException e){
                         System.err.println("Error: Formato de fecha invalido. "
                         + "Por favor, use el formato YYYY-MM-DD.");    
                        }
                    }
                 
                 System.out.println(" ");
                 System.out.println("Desea editar la fecha de baja? si/no");
                 String option2 = teclado.nextLine();
                 if (option2.equalsIgnoreCase("si")) {
                     System.out.println("Escriba la fecha de baja(AAAA-MM-DD)");
                    String fechaStr = teclado.nextLine();
                     try{
                       LocalDate fechaBaja = LocalDate.parse(fechaStr);
                       contrato.setFechaBaja(fechaBaja);
                        }
                     catch (java.time.format.DateTimeParseException e){
                     System.err.println("Error: Formato de fecha invalido. "
                             + "Por favor, use el formato YYYY-MM-DD.");    
                    }
                 }
                 
                 System.out.println(" ");
                 System.out.println("Desea editar el estado del contrato? si/no");
                 String option3 = teclado.next();
                 if (option3.equalsIgnoreCase("si")) {
                     if(contrato.isActivo()==true){
                         contrato.setActivo(false);
                     }   
                         else 
                                 contrato.setActivo(true);
                                 
                     }
                 System.out.println(" ");
                }

                 System.out.println(contrato);
            }
                     
     
         }
         
         
     }    
    
//20-05-2025 SE DEJAN LISTOS LOS METODOS CRUD DE LA CLASE CONTRATOCRUD
