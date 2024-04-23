/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listatareas;

/**
 *
 * @author El Pepe
 */
class Lista {

    private Nodo cabeza;

    public Lista() {
        cabeza = null;
    }

    public void agregarTarea(String Tarea) {

        Nodo nuevoNodo = new Nodo(Tarea);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public void completarTarea(String tarea) {

    }

    public void listaTarea(String tarea) {

    }

    public void contarTarea(String tarea) {

    }

}
