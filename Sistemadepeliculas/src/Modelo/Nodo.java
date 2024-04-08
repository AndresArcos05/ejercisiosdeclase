/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author El Pepe
 */
public class Nodo {
     private Peliculas dato;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(Peliculas dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public Peliculas getDato() {
        return dato;
    }

    public void setDato(Peliculas dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
