/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ListaEnlazada;
import Modelo.Ventas;
import Vista.vista;

/**
 *
 * @author El Pepe
 */
public class controlador {

    private ListaEnlazada lista;
    private vista vista;
    private Ventas venta;

    public controlador() {
        vista = new vista();
        lista = new ListaEnlazada();
    }

    public void iniciarJuego() {
        int opcion;
        do {
            opcion = vista.menuInicial();

            switch (opcion) {
                case 1:
                    String nombre = vista.obtenerProducto();
                    int precio = vista.obtenerPrecio();
                    venta = new Ventas(nombre, precio);
                    lista.agregar(venta.toString()); 
                    System.out.println("Producto agregado: " + venta.toString()); 
                    break;
                case 2:
                    if (venta != null) {
                        String nombr = vista.obtenerProducto();
                        int preci = vista.obtenerPrecio();
                        venta = new Ventas(nombr, preci);
                        lista.agregar(venta.toString()); 
                        System.out.println("Producto ingresado: " + venta.toString());  
                    } else {
                        vista.mostrarMensaje("ingrese sus datos.");
                    }
                    break;

                case 3:
                    lista.imprimirLista(); 
                    break;
                case 4:
                    if (venta != null) {
                        lista.eliminar();
                        System.out.println("Producto eliminado.");  
                    } else {
                        vista.mostrarMensaje("ingrese sus datos.");
                    }
                    break;
                case 5:
                    vista.salir();
                    break;
                default:
                    vista.mostrarMensaje("Opcion no valida");
            }
        } while (opcion != 5);
    }
}
