/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author El Pepe
 */
public class Vista {
   public void mostrarResultado(String cadena, boolean balanceado) {
        if (balanceado) {
            System.out.println("La cadena \"" + cadena + "\" esta correctamente balanceados.");
        } else {
            System.out.println("La cadena \"" + cadena + "\" no esta correctamente balanceados.");
        }
    }
    
}
