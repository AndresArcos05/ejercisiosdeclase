/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author El Pepe
 */
public class NodoPilas {

    private NodoLista top;

    public NodoPilas() {
        this.top = null;
    }

    public void push(String dato) {
        NodoLista nuevoNodo = new NodoLista(dato);
        if (top == null) {
            top = nuevoNodo;
        } else {
            nuevoNodo.siguiente = top;
            top = nuevoNodo;
        }
    }

    public NodoLista pop() {
        if (top == null) {
            return null;
        }
        NodoLista nodoEliminado = top;
        top = top.siguiente;
        nodoEliminado.siguiente = null;
        return nodoEliminado;
    }
}


