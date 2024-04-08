/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Planetas;
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

    public int mostrarMenu() {
        System.out.println("-------------Simulador Reproductor De Musica-----------");
        System.out.println("1. Agregar Plneta");
        System.out.println("2. Eliminar plateta actual");
        System.out.println("3. Avanzar");
        System.out.println("4. Retroceder");
        System.out.println("5. Salir");
        System.out.print("Elija una opcion: ");
        return scanner.nextInt();
    }

    public String obtenerplaneta() {
        System.out.print("Ingrese el planeta: ");
        scanner.nextLine(); 
        return scanner.nextLine();
    }

    public void mostrarplanetaActual(Planetas planet) {
        if (planet != null) {
            System.out.println("planeta actual: " + planet.getNombre());
        } else {
            System.out.println("No hay planetas en la lista.");
        }
    }
}
