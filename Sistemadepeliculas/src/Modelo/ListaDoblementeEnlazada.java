/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author El Pepe
 */
public class ListaDoblementeEnlazada {

    private Nodo cabeza;
    private Nodo cola;

    public ListaDoblementeEnlazada() {
        this.cabeza = null;
        this.cola = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void agregarAlFinal(Peliculas dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(cola);
            cola = nuevoNodo;
        }
    }

    public void agregarAlInicio(Peliculas dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevoNodo);
            cabeza = nuevoNodo;
        }
    }

    public void eliminarPorTitulo(String titulo) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.getDato().getTitulo().equalsIgnoreCase(titulo)) {
                if (temp == cabeza) {
                    cabeza = temp.getSiguiente();
                    if (cabeza != null) {
                        cabeza.setAnterior(null);
                    } else {
                        cola = null;
                    }
                } else if (temp == cola) {
                    cola = temp.getAnterior();
                    cola.setSiguiente(null);
                } else {
                    temp.getAnterior().setSiguiente(temp.getSiguiente());
                    temp.getSiguiente().setAnterior(temp.getAnterior());
                }
                break;
            }
            temp = temp.getSiguiente();
        }
    }

    public Peliculas buscarPorTitulo(String titulo) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.getDato().getTitulo().equalsIgnoreCase(titulo)) {
                return temp.getDato();
            }
            temp = temp.getSiguiente();
        }
        return null;
    }

    public void mostrarInventario() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.println(temp.getDato().toString());
            temp = temp.getSiguiente();
        }
        System.out.println();
    }
}
