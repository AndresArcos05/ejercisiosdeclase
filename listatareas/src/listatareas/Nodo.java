/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listatareas;

/**
 *
 * @author El Pepe
 */
public class Nodo {
    private String  tarea;
    private Nodo siguiente;

    public Nodo(String tarea) {
        this.tarea = tarea;
        this.siguiente = null;
    }

    public String getTarea() {
        return tarea;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}

