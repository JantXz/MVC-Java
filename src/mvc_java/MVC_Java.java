/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_java;

import Controlador.ControladorMDB;
import Modelo.MDB;
import Vista.FrmVista;
//hola jan ya lo pude clonar
//hola

//Hola equipo
//Hola jsjs
//Sut
//agregue 10 cajas de texto-Sut
/**
 *
 * @author Stevia
 */
public class MVC_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MDB objModelo=new MDB();
        FrmVista objVista=new FrmVista();
        ControladorMDB objController;
        
      
        objController = new ControladorMDB(objVista,objModelo);
        objController.iniciar();
        objVista.setVisible(true);
        
        
        
    }
    
}
