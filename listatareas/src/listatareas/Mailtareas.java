/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listatareas;

import java.util.Scanner;


/**
 *
 * @author El Pepe
 */
public class Mailtareas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        boolean Salir = false;
        while (!Salir) {
            System.out.println("|------------------Menu------------------|");
            System.out.println("Que desea realizar hoy?");
            System.out.println("1. Agregar Tarea:");
            System.out.println("2. Completar Tarea:");
            System.out.println("3. Listar Tareas:");
            System.out.println("4. Eliminar Tareas:");
            System.out.println("5. Contar Tareas:");
            System.out.println("6. Salir:");
            System.out.print("Digite el numero:");
            int Opcion = leer.nextInt();
            leer.nextLine();

            switch (Opcion) {
                case 1:
                    System.out.println("Agregar Tarea:");
                    String Tarea = leer.nextLine();
                    Lista lista = new Lista();
                    lista.agregarTarea(Tarea);
                    break;
                case 2:

                    break;
                case 3:

                    break;
            }
        }
    }
}
