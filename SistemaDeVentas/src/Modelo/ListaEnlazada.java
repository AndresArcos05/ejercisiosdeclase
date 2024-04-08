/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author El Pepe
 */
public class ListaEnlazada {

    private Nodo cabeza;
    private Nodo cola;

    public ListaEnlazada() {
        this.cabeza = null;
        this.cola = null;
    }

    public boolean estavacia() {
        return cabeza == null;
    }

    public void agregar(String dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (estavacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevoNodo);
            cabeza = nuevoNodo;
        }
    }

    public void imprimirLista() {
        if (estavacia()) {
            System.out.println("La lista esta vacia.");
            return;
        }

        System.out.println("Contenido de la lista:");
        Nodo temp = cabeza;
        for (Nodo actual = cabeza; actual != null; actual = actual.getSiguiente()) {
            System.out.println(actual.getDato());
        }
    }

    public void eliminar() {
        if (!estavacia()) {
            cabeza = cabeza.getSiguiente();
            if (cabeza == null) {
                cola = null;
            } else {
                cabeza.setAnterior(null);
            }
        }
    }

}
