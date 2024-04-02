/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author El Pepe
 */
public class ListaPilas {

    NodoPilas top;
    int size;

    public ListaPilas() {
        top = null;
        size = 0;
    }

    public boolean estavacia() {
        return top == null;
    }

    public int obtenerTamaño() {
        return size;
    }

    public void agregar(int  dato) {
        NodoPilas nodoNuevo = new NodoPilas(dato);
        if (top == null) {
            top = nodoNuevo;
        } else {
            nodoNuevo.siguiente = top;
            top = nodoNuevo;
        }

    }

    public int imprimir() {
        if (estavacia()) {
            throw new RuntimeException("la pila esta vacia");
            
        }
        int dato = top.dato;
        top = top.siguiente;
        size--;
        return dato;
    }

    public int ultimodato() {
        if (estavacia()) {
            throw new RuntimeException("la pila esta vacia");
        }

        return top.dato;
    }
}
