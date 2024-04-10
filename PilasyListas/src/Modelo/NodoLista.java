/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author El Pepe
 */
public class NodoLista {
    String dato;
    NodoLista siguiente;
    NodoLista anterior;

    public NodoLista(String dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
}

