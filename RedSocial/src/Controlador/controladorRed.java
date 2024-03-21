/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Evento;
import Modelo.ListaEnlazada;
import Modelo.Usuario;
import Vista.vistaRed;
import java.time.LocalDateTime;

/**
 *
 * @author El Pepe
 */
public class controladorRed {

    private Evento evento;
    private Usuario persona;
    private ListaEnlazada lista;
    private vistaRed vista;

    public controladorRed() { 
        vista = new vistaRed();
        lista = new ListaEnlazada(); 
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.menuInicial();
            switch (opcion) {
                case 1:
                    String nombre = vista.obtenerNombre();
                    int id = vista.obtenerEdad();
                    persona = new Usuario(nombre, id);
                    break;
                case 2:
                    String Publicacion = vista.obtenerPublicacion();
                    String Reaccion = vista.obtenerREaccion();
                    String Comentario = vista.obtenerComentario();
                    int ID = vista.obtenerEdad();
                    evento = new Evento(Publicacion, Reaccion, Comentario, ID, LocalDateTime.now());
                    break;
                case 3:
                    if (persona != null) {
                        lista.agregarAInicio(evento);
                    } else {
                        vista.mostrarMensaje("Primero ingrese sus datos.");
                    }
                    break;
                case 4:
                    if (persona != null) {
                        lista.agregarAlFinal(evento);
                    } else {
                        vista.mostrarMensaje("Primero ingrese sus datos.");
                    }
                    break;
                case 5:
                    lista.imprimirLista();
                    break;
                case 6:
                    if (persona != null) {
                    lista.eliminarAlinicio();
                    } else {
                        vista.mostrarMensaje("Primero ingrese sus datos.");
                    }
                    break;
                case 7:
                    if (persona != null) {
                    lista.eliminarAlfinal();
                    } else {
                        vista.mostrarMensaje("Primero ingrese sus datos.");
                    }
                    break;
                case 8:
                    int idBuscar = vista.obtenerEdad(); 
                    Evento eventoEncontrado = lista.buscarPorId(idBuscar);
                    if (eventoEncontrado != null) {
                        System.out.println("Evento encontrado:");
                        System.out.println("Publicacion: " + eventoEncontrado.getPublicacion());
                        System.out.println("Reaccion: " + eventoEncontrado.getReaccion());
                        System.out.println("Comentario: " + eventoEncontrado.getComentario());
                        System.out.println("ID del Evento: " + eventoEncontrado.getIdEvento());
                        System.out.println("Fecha del Evento: " + eventoEncontrado.getFecha());
                    } else {
                        System.out.println("No se encontro ningun evento con el ID especificado.");
                    }
                    break;
                case 9:
                    vista.mostrarMensaje("Que te vaya bien " + persona.getNombre() + "!");
                    break;
                default:
                    vista.mostrarMensaje("Opcion no valida. Por favor, seleccione una opcion valida.");
            }
        } while (opcion != 9);
    }
}
