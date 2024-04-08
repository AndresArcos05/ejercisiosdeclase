/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ListaDoblementeEnlazada;
import Modelo.Peliculas;
import Vista.vista;

/**
 *
 * @author El Pepe
 */
public class Controlador {

    private ListaDoblementeEnlazada lista;
    private vista vista;
    private Peliculas peli;

    public Controlador() {
        lista = new ListaDoblementeEnlazada();
        vista = new vista();
    }

    public void iniciarGestion() {
        int opcion;
        do {
            opcion = vista.menuPrincipal();

            switch (opcion) {
                case 1:
                    String titulo = vista.obtenerTitulo();
                    String director = vista.obtenerPelicula();
                    String genero = vista.obtenerGenero();
                    int numeroDeCopias = vista.obtenerNumeroDeCopias();
                    Peliculas pelicula = new Peliculas(titulo, director, genero, numeroDeCopias);
                    lista.agregarAlInicio(pelicula);
                    vista.mostrarMensaje("Pelicula agregada con exito.");
                    break;
                case 2:
                    String titulo2 = vista.obtenerTitulo();
                    String director2 = vista.obtenerPelicula();
                    String genero2 = vista.obtenerGenero();
                    int numeroDeCopias2 = vista.obtenerNumeroDeCopias();

                    Peliculas pelicula2 = new Peliculas(titulo2, director2, genero2, numeroDeCopias2);

                    lista.agregarAlFinal(pelicula2);
                    vista.mostrarMensaje("Pelicula agregada al final con exito.");
                    break;
                case 3:
                    String tituloEliminar = vista.obtenerTitulo();
                    lista.eliminarPorTitulo(tituloEliminar);
                    vista.mostrarMensaje("Pelicula eliminada con exito.");
                    break;
                case 4:
                    String tituloBuscar = vista.obtenerTitulo();
                    Peliculas peliculaEncontrada = lista.buscarPorTitulo(tituloBuscar);
                    if (peliculaEncontrada != null) {
                        vista.mostrarMensaje("Pelicula encontrada: " + peliculaEncontrada.toString());
                    } else {
                        vista.mostrarMensaje("Pelicula no encontrada.");
                    }
                    break;
                case 5:
                    lista.mostrarInventario();
                    break;
                case 6:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    break;
                default:
                    vista.mostrarMensaje("Opcion no válida. Intentelo de nuevo.");
            }

        } while (opcion != 6);
    }
}
