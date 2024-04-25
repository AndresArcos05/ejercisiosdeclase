/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Colas;
import java.util.Scanner;

/**
 *
 * @author El Pepe
 */
public class Vista {
     Colas colaClientes;

    public Vista(Colas colaClientes) {
        this.colaClientes = colaClientes;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n---- Banco Sistema de Atencion al Cliente ----");
            System.out.println("1. Agregar nuevo cliente a la cola");
            System.out.println("2. Atender al siguiente cliente");
            System.out.println("3. Mostrar clientes en espera");
            System.out.println("4. Salir del programa");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Ingrese el nombre del cliente:");
                    String nombre = scanner.nextLine();
                    colaClientes.agregarCliente(nombre);
                    break;
                case "2":
                    colaClientes.atenderCliente();
                    break;
                case "3":
                    colaClientes.mostrarClientes();
                    break;
                case "4":
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opcion inválida, intente nuevamente.");
            }
        }
    }
}

