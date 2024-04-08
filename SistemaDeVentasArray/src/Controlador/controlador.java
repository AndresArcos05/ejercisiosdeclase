package Controlador;

import Modelo.ListaEnlazada;
import Modelo.Ventas;
import Vista.vista;

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
                    lista.agregarAInicio(venta.toString()); // Agregar venta a la ListaEnlazada
                    System.out.println("Producto agregado: " + venta.toString());  // Depuración
                    break;
                case 2:
                    if (venta != null) {
                        String nombr = vista.obtenerProducto();
                        int preci = vista.obtenerPrecio();
                        venta = new Ventas(nombr, preci);
                        lista.agregarAInicio(venta.toString()); // Agregar venta a la ListaEnlazada
                        System.out.println("Producto ingresado: " + venta.toString());  // Depuración
                    } else {
                        vista.mostrarMensaje("Ingrese sus datos.");
                    }
                    break;
                case 3:
                    lista.imprimirLista();  // Imprimir la lista
                    break;
                case 4:
                    if (venta != null && !lista.estaVacia()) {
                        lista.eliminarAlInicio();
                        System.out.println("Producto eliminado.");  // Depuración
                    } else {
                        vista.mostrarMensaje("Ingrese sus datos o la lista está vacía.");
                    }
                    break;
                case 5:
                    vista.salir();
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida");
            }
        } while (opcion != 5);
    }
}