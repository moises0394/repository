/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.moisesramos.dominio.CRUD;

import co.edu.udec.poo.moisesramos.dominio.Deduccion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author IBIS CARTAGENA IT
 */
public class DeduccionCRUD {
    private ArrayList<Deduccion> listaDeducciones;

    public DeduccionCRUD(ArrayList<Deduccion> listaDeducciones) {
        this.listaDeducciones = listaDeducciones;
    }
    
    public void elminarDeduccion (int id){
     Iterator<Deduccion> iterator = listaDeducciones.iterator();
        while (iterator.hasNext()) {
            Deduccion deduccion = iterator.next();
            if (deduccion.getIdDeduccion() == id) {
                iterator.remove();
                System.out.println("Deduccion eliminada" + deduccion.getIdDeduccion());
                return;
            }
            System.out.println("Deduccion no encontrada");
        }
    }
    
    public void buscarDeduccion (int id){

        Iterator<Deduccion> iterator = listaDeducciones.iterator();
        while (iterator.hasNext()) {
           Deduccion deduccion = iterator.next();
            if ( deduccion.getIdDeduccion() == id) {
                System.out.println(deduccion);
                return;
            }
            System.out.println("Deduccion no encontrada");
       }             
    }

    public void listarDeduccion (){
         for (Deduccion deduccion : listaDeducciones){
             System.out.println("Deduccion: "+ deduccion);
        }
    }
 
    public void editarDeduccion (int id){
     Scanner teclado = new Scanner(System.in);
     System.out.println(" ");
     System.out.println("Editar datos de deduccion");
     
      for (Deduccion deduccion : listaDeducciones) {
            if(id == deduccion.getIdDeduccion()){         
               System.out.println("Desea editar el valor? si/no");
               String option = teclado.next();
               if (option.equalsIgnoreCase("si")) {
                 System.out.println("Escriba el nuevo valor");
                 double valor = teclado.nextDouble();
                 deduccion.setValor(valor);
                }
               
               System.out.println("Desea editar la descripcion? si/no");
               String option2 = teclado.next();
               if (option2.equalsIgnoreCase("si")) {
                 System.out.println("Escriba la descripcion");
                 String descripcion = teclado.next();
                 deduccion.setDescripcion(descripcion);
                }
               
            }
        }
    }
    
    
}
