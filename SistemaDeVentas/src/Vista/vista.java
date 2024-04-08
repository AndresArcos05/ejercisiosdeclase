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
    private Scanner Leer;
    public vista() {
        this.Leer = new Scanner(System.in);
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String obtenerProducto() {
        System.out.print("Ingrese su nombre del producto: ");
        return Leer.nextLine().trim();
    }
    public int obtenerPrecio() {
        System.out.print("Ingrese su precio: ");
        return Leer.nextInt();
    }

    public int menuInicial() {
        System.out.println("1. Agregar producto y precio ");
        System.out.println("2. ingresar producto ");
        System.out.println("3. ver lista");
        System.out.println("4. eliminar producto");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opcion: ");
        int opcion = Leer.nextInt();
        Leer.nextLine();
        return opcion;
    }
   
    public String obtenerRespuesta() {
        System.out.print("Escribe tu producto ");
        return Leer.nextLine().trim();
    }
     public String salir() {
        System.exit(0);
        return null;
    }
}
