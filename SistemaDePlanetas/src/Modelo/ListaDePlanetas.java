/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author El Pepe
 */
public class ListaDePlanetas {
     private Nodo actual;

    public void agregaPlaneta(Planetas planet) {
        Nodo nuevoNodo = new Nodo(planet);
        if (actual == null) {
            actual = nuevoNodo;
            actual.setSiguiente(actual);
        } else {
            nuevoNodo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nuevoNodo);
        }
    }

    public void eliminarPlanetaActual() {
        if (actual == null) return;

        Nodo temp = actual.getSiguiente();
        if (temp == actual) {
            actual = null;
        } else {
            actual.setSiguiente(temp.getSiguiente());
            temp = null;
        }
    }

    public void avanzar() {
        if (actual != null) {
            actual = actual.getSiguiente();
        }
    }

    public void retroceder() {
        if (actual == null) return;

        Nodo temp = actual;
        while (temp.getSiguiente() != actual) {
            temp = temp.getSiguiente();
        }
        actual = temp;
    }

    public Planetas getCancionActual() {
        if (actual != null) {
            return actual.getPlaneta();
        }
        return null;
    }
}
