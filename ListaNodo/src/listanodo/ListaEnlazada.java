/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listanodo;

import java.util.Scanner;

/**
 *
 * @author El Pepe
 */
public class ListaEnlazada {

    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public void agregarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
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

    public void removerDuplicados() {
        Nodo acutal = cabeza;
        while(acutal != null && acutal.siguiente != null){                
            if (acutal.dato == acutal.siguiente.dato) {
                acutal.siguiente = acutal.siguiente.siguiente;
            } else {
                acutal = acutal.siguiente;
            }
        }
    }
}

 