/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udec.poo.moisesramos;

import co.edu.udec.poo.moisesramos.dominio.CRUD.ContratoCRUD;
import co.edu.udec.poo.moisesramos.dominio.CRUD.EmpleadoCRUD;
import co.edu.udec.poo.moisesramos.dominio.Cargo;
import co.edu.udec.poo.moisesramos.dominio.Categoria;
import co.edu.udec.poo.moisesramos.dominio.Contrato;
import co.edu.udec.poo.moisesramos.dominio.Empleado;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author M. Alejandro
 * hola hola
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //SE CREA EL ARRAYLIST EMPLEADO
        ArrayList<Empleado> listaEmpleados = new ArrayList();
       
        //Se crea instancia de tipo EmpleadoCRUD se le pasa como parametro la listaEmpleados,
        //La varieble es necesaria para usar los metodos CRUD Buscar, Listar y Editar 
        EmpleadoCRUD crudEmpleado = new EmpleadoCRUD(listaEmpleados);
        
        //INSTANCIAS DE EMPLEADOS
        
        ArrayList<Contrato>contratos = new ArrayList();
        ArrayList<Cargo>cargos = new ArrayList();
        Empleado emple1 = new Empleado("Moises", "Ramos", "304593245", "1era calle", "66666", contratos, cargos);
        Empleado emple2 = new Empleado("Jose", "Diaz", "304593246", "2da calle", "77777", contratos, cargos);
                
       
        //SE CREA VARIABLE idEmpleado que se usará como referencia para ejecutar los CRUD
        int idEmpleado1 = emple1.getid();
        int idEmpleado2 = emple2.getid();  
        
        //AGREGAR EMPLEADO
        listaEmpleados.add(emple1);
        listaEmpleados.add(emple2);
        System.out.println(listaEmpleados);
        
        //BUSCAR
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite el ID a consultar: ");
//        int id = teclado.nextInt();
        crudEmpleado.buscarEmpleado(idEmpleado1);//¡¡NO pide por consola el ID a buscar!! :(
//        
//        //LISTAR
        crudEmpleado.listarEmpleado(); //Le quité el parametro idEmpleado porque cualquiera que puesiera iba a listrar toda la listaEmpleados
//        
//        //EDITAR
        crudEmpleado.editarEmpleado(idEmpleado1);//¡¡NO pide por consola el ID a editar!! :(
        
//-----------------------------------------------------------------------------
//    
//    //SE CREA EL ARRAYLIST Contrato
    ArrayList<Contrato> listaContratos = new ArrayList();
//    
    //Se crea instancia de tipo ContratoCRUD se le pasa como parametro la listaContratos,
    //La varieble es necesaria para usar los metodos CRUD Buscar, Listar y Editar 
    ContratoCRUD crudContrato = new ContratoCRUD(listaContratos);
//
//    //Instancias de Contrato
    Contrato contrato1 = new Contrato(
        LocalDate.of(2025, 05, 19),
        LocalDate.of(2025, 06, 19),
        false
    );
    Contrato contrato2 = new Contrato(
        LocalDate.of(2025, 04, 19),
        LocalDate.of(2025, 05, 30),
        true
    );
        int idContrato1 = contrato1.getIdContrato();
        int idContrato2 = contrato2.getIdContrato();  
    
        //AGREGAR EMPLEADO
        listaContratos.add(contrato1);
        listaContratos.add(contrato2);
        System.out.println(listaContratos);  
    
      //BUSCAR CONTRATO
        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el ID a consultar: ");
        int id = teclado.nextInt();*/
        
     /*prueba   crudContrato.buscarContrato(idContrato1);//¡¡NO pide por consola el ID a buscar!! :(        

        //LISTAR CONTRATO
        crudContrato.listarContrato(); prueba*/
        
        //EDITAR CONTRATO
       crudContrato.editarContrato(idContrato1);//¡¡NO pide por consola el ID a editar!! :(









    }
    
}
