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

    public int menuPrincipal() {
        System.out.println("---- GESTION DE VIDEOTECA ----");
        System.out.println("1. Agregar pelicula");
        System.out.println("2. Agregar al final");
        System.out.println("3. Eliminar pelicula por titulo");
        System.out.println("4. Buscar peliculas por nombre");
        System.out.println("5. Mostrar inventario");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opcion: ");
        return scanner.nextInt();
    }

    public String obtenerTitulo() {
        System.out.print("Ingrese el titulo de la pelicula: ");
        scanner.nextLine(); 
        return scanner.nextLine();
    }

    public String obtenerPelicula() {
        System.out.print("Ingrese el nombre de la pelicula: ");
        return scanner.nextLine();
    }

    public String obtenerGenero() {
        System.out.print("Ingrese el genero de la pelicula: ");
        return scanner.nextLine();
    }

    public int obtenerNumeroDeCopias() {
        System.out.print("Ingrese el numero de copias disponibles: ");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
