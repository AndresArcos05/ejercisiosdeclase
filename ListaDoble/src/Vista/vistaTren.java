/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.ListaEnlazada;
import java.util.Scanner;

/**
 *
 * @author El Pepe
 */
public class vistaTren {
    private Scanner Leer;
    public vistaTren() {
        this.Leer = new Scanner(System.in);
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String obtenerNombre() {
        System.out.print("Ingrese su nombre: ");
        return Leer.nextLine().trim();
    }
    public int obtenerEdad() {
        System.out.print("Ingrese su edad: ");
        return Leer.nextInt();
    }

    public int menuInicial() {
        System.out.println("1. Agregar estudiante y edad ");
        System.out.println("2. ingresar estudiante al inicio");
        System.out.println("3. ingresar estudiante al final");
        System.out.println("4. ver lista");
        System.out.println("5. eliminar al inicio");
        System.out.println("6. eliminar al final");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opcion: ");
        int opcion = Leer.nextInt();
        Leer.nextLine();
        return opcion;
    }
   
    public String obtenerRespuesta() {
        System.out.print("Escribe tu Tarea ");
        return Leer.nextLine().trim();
    }
     public String salir() {
        System.exit(0);
        return null;
    }
}
