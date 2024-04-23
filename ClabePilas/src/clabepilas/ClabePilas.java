/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clabepilas;

import Controlador.controlador;
import Modelo.EncriptacionModel;
import Vista.vista;

/**
 *
 * @author El Pepe
 */
public class ClabePilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         EncriptacionModel model = new EncriptacionModel();
        controlador controller = new controlador(model);
        vista view = new vista(controller);
        view.mostrarMenu();
    }
    
}
