/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.controlador;
import java.util.Scanner;

/**
 *
 * @author El Pepe
 */
public class vista {
     private final controlador controller;

    public vista(controlador controller) {
        this.controller = controller;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        String opción;

        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Encriptar contraseña");
            System.out.println("2. Desencriptar contraseña");
            System.out.println("3. Salir");
            opción = scanner.nextLine();

            switch (opción) {
                case "1":
                    System.out.println("Ingrese la contraseña original:");
                    String contraseñaOriginal = scanner.nextLine();
                    String contraseñaEncriptada = controller.encriptarContraseña(contraseñaOriginal);
                    System.out.println("Contraseña encriptada: " + contraseñaEncriptada);
                    break;
                case "2":
                    System.out.println("Ingrese la contraseña encriptada:");
                    String contraseñaEncriptada2 = scanner.nextLine();
                    String contraseñaDesencriptada = controller.desencriptarContraseña(contraseñaEncriptada2);
                    System.out.println("Contraseña desencriptada: " + contraseñaDesencriptada);
                    break;
                case "3":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

        } while (!opción.equals("3"));
    }
}
