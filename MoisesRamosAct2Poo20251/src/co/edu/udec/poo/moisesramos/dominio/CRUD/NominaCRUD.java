/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.moisesramos.dominio.CRUD;

import co.edu.udec.poo.moisesramos.dominio.Nomina;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author M. Alejandro
 */
public class NominaCRUD {
  private ArrayList<Nomina> listaNominas;

    public NominaCRUD(ArrayList<Nomina> listaNominas) {
        this.listaNominas = listaNominas;
    }
    public void elminarNomina (int id){
        Iterator<Nomina> iterator = listaNominas.iterator();
        while (iterator.hasNext()) {
            Nomina nomina = iterator.next();
            if (nomina.getIdNomina() == id) {
                iterator.remove();
                System.out.println("Nomina eliminada" + nomina.getIdNomina());
                return;
            }
            System.out.println("Nomina no encontrada");
        }
    }
    public void buscarNomina (int id){
       
        Iterator<Nomina> iterator = listaNominas.iterator();
        while (iterator.hasNext()) {
           Nomina nomina = iterator.next();
            if ( nomina.getIdNomina() == id) {
                System.out.println(nomina);
                return;
            }
            System.out.println("Nomina no encontrado");
       }             
    }
    public void listarNomina (){
        for (Nomina nomina : listaNominas){
             System.out.println("Nomina: "+ nomina);//12:26am 22/05/2025 Se hacen metodos CRUD elimnar,buscar y listar, No depueden modificar las nominas
         }
     }
}
