/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author El Pepe
 */
public class ListaDoblementeEnlazada {

    private ArrayList<Peliculas> lista;

    public ListaDoblementeEnlazada() {
        this.lista = new ArrayList<>();
    }

    public boolean estaVacia() {
        return lista.isEmpty();
    }

    public void agregarAlFinal(Peliculas pelicula) {
        lista.add(pelicula);
    }

    public void agregarAlInicio(Peliculas pelicula) {
        lista.add(0, pelicula);
    }

    public void eliminarPorTitulo(String titulo) {
        Peliculas peliculaAEliminar = null;
        for (Peliculas pelicula : lista) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                peliculaAEliminar = pelicula;
                break;
            }
        }
        if (peliculaAEliminar != null) {
            lista.remove(peliculaAEliminar);
        }
    }

    public Peliculas buscarPorTitulo(String titulo) {
        for (Peliculas pelicula : lista) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                return pelicula;
            }
        }
        return null;
    }

    public void mostrarInventario() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
        } else {
            for (Peliculas pelicula : lista) {
                System.out.println(pelicula.toString());
            }
        }
    }
}