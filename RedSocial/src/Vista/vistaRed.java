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
public class vistaRed {
    private Scanner Leer;
    public vistaRed() {
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
        System.out.print("Ingrese su ID: ");
        return Leer.nextInt();
    }
    public String obtenerComentario() {
        System.out.print("Ingrese su Comentario: ");
        return Leer.nextLine();
    }
    public String obtenerREaccion() {
        System.out.print("Ingrese su reaccion: ");
        return Leer.nextLine();
    }
    public String obtenerPublicacion() {
        System.out.print("Ingrese su publicacion: ");
        return Leer.nextLine();
    }
    public int obtenerFecha() {
        System.out.print("Ingrese su fecha: ");
        return Leer.nextInt();
    }
    public int obtenerHora() {
        System.out.print("Ingrese su hora: ");
        return Leer.nextInt();
    }

    public int menuInicial() {
        System.out.println("------RED EL PEPE-------");
        System.out.println("1. ingresar usuario y id");
        System.out.println("2. agregar evento");
        System.out.println("3. agregar  al inicio");
        System.out.println("4. agregar  al final");
        System.out.println("5. ver lista");
        System.out.println("6. eliminar al inicio");
        System.out.println("7. eliminar al final");
        System.out.println("8. Buscar Evento");
        System.out.println("9. salir");
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


