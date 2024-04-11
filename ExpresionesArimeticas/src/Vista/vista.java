/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author El Pepe
 */
public class vista {
     private Scanner scanner;
    
    public vista() {
        scanner = new Scanner(System.in);
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    public String leerExpresion() {
        System.out.print("Ingrese expresión RPN: ");
        return scanner.nextLine();
    }
    
    public void mostrarResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }
}
