/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas;

import Controlador.Controlador;
import Vista.Vista;
import java.util.Scanner;

/**
 *
 * @author El Pepe
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Controlador cont = new Controlador();
        Vista vista =new Vista();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el primero");
        String cadena1=leer.nextLine();
        
        System.out.println("ingrese el segundo");
        String cadena2=leer.nextLine();
        
        boolean balanceado = cont.verificarBalance(cadena1);
        boolean balanceado1 = cont.verificarBalance(cadena2);
        
        vista.mostrarResultado(cadena1, balanceado);
        vista.mostrarResultado(cadena2, balanceado1);
    
    }
    
}