/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listanodo;

import java.util.Scanner;

/**
 *
 * @author El Pepe
 */
public class ListaNodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();
        System.out.println("digitar la lista");
        String input = entrada.nextLine();
        String[] numeros = input.split(" ");
        
        for (String numero : numeros) {
            lista.agregarAlFinal(Integer.parseInt(numero));
        }
         System.out.println("Lista Original:");
        lista.imprimirLista();
        lista.removerDuplicados();
        System.out.println("Lista Removida:");
        lista.imprimirLista();
    }
}


