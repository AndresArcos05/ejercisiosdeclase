/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Estudiante;
import Modelo.ListaEnlazada;
import Vista.vistaTren;

/**
 *
 * @author El Pepe
 */
public class contrladorTren {

    private ListaEnlazada lista;
    private vistaTren vista;
     private Estudiante estudiante;

    public contrladorTren() {
        vista = new vistaTren();
        lista = new ListaEnlazada();
    }

    public void iniciarJuego() {
        int opcion;
        do {
            opcion = vista.menuInicial();

            switch (opcion) {
                case 1:
                    String nombre = vista.obtenerNombre();
                    int edad = vista.obtenerEdad();
                    estudiante = new Estudiante(nombre, edad);
                    break;
                case 2:
                    if (estudiante != null) {
                        lista.agregarAInicio(vista.obtenerRespuesta());
                    } else {
                        vista.mostrarMensaje("ingrese sus datos.");
                    }
                    break;
                case 3:
                    if (estudiante != null) {
                        lista.agregarAlFinal(vista.obtenerRespuesta());
                    } else {
                        vista.mostrarMensaje("ingrese sus datos.");
                    }
                    break;
                case 4:
                    lista.imprimirLista();
                    break;
                case 5:
                    if (estudiante != null) {
                        lista.eliminarAlinicio();
                    } else {
                        vista.mostrarMensaje("ingrese sus datos.");
                    }
                    break;
                case 6:
                    if (estudiante != null) {
                        lista.eliminarAlfinal();
                    } else {
                        vista.mostrarMensaje(" ingrese sus datos.");
                    }
                case 7:
                    vista.salir();
                    break;
                default:
                    vista.mostrarMensaje("Opcion no valida");
            }
        } while (opcion != 7);
    }
}
