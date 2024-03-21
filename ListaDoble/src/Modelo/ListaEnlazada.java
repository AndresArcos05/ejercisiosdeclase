/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.Nodo;

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

    public void agregarAlFinal(String dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cola);
            cola = nuevoNodo;
        }
    }

    public void agregarAInicio(String dato) {
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
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.getDato() + " ");
            temp = temp.getSiguiente();
        }
        System.out.println();

    }
    public void eliminarAlinicio() {
         if (!estavacia()) {
        cabeza = cabeza.getSiguiente();
        if (cabeza == null) {
            cola = null;
        } else {
            cabeza.setAnterior(null);
        }
    }
    }

    public void eliminarAlfinal() {
         if (!estavacia()) {
        if (cabeza == cola) {
            cabeza = null;
            cola = null;
        } else {
            Nodo temp = cabeza;
            while (temp.getSiguiente() != cola) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(null);
            cola = temp;
        }
    }
}
}
