/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.moisesramos.dominio.CRUD;

import co.edu.udec.poo.moisesramos.dominio.NominaTotal;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author IBIS CARTAGENA IT
 */
public class NominaTotalCRUD {
    private ArrayList<NominaTotal> listaNominaTotales;

    public NominaTotalCRUD(ArrayList<NominaTotal> listaNominaTotales) {
        this.listaNominaTotales = listaNominaTotales;
    }

    public void buscarNominaTotal (int id){
       
        Iterator<NominaTotal> iterator = listaNominaTotales.iterator();
        while (iterator.hasNext()) {
           NominaTotal nominaTotal = iterator.next();
            if ( nominaTotal.getIdNominaTotal() == id) {
                System.out.println(nominaTotal);
                return;
            }
            System.out.println("Nomina Total  no encontrada");
       }             
    }

    public void listarNominaTotal (){
        for (NominaTotal nominaTotal : listaNominaTotales){
            System.out.println("Nomina Total: "+ nominaTotal);
        }
    }    
    
}
