/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author El Pepe
 */
public class ListaDoblementeenlazada {

    private NodoLista cabeza;
    private NodoLista cola;

    public ListaDoblementeenlazada() {
        this.cabeza = null;
        this.cola = null;
    }

    public void insertarAlFinal(String dato) {
        NodoLista nuevoNodo = new NodoLista(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
    }

    public String mostrar() {
        StringBuilder resultado = new StringBuilder();
        NodoLista actual = cabeza;
        while (actual != null) {
            resultado.append(actual.getDato()).append("\n");
            actual = actual.siguiente;
        }
        return resultado.toString();
    }

}
