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

    public void agregarAlFinal(Evento dato) {
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

    public void agregarAInicio(Evento dato) {
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
        System.out.println("La lista está vacía.");
        return;
    }
    Nodo temp = cabeza;
    int contador = 1;
    while (temp != null) {
        System.out.println("Evento " + contador + ":");
        System.out.println("Publicacion: " + temp.getDato().getPublicacion());
        System.out.println("Reaccion: " + temp.getDato().getComentario());
        System.out.println("Comentario: " + temp.getDato().getComentario());
        System.out.println("ID del Evento: " + temp.getDato().getIdEvento());
        System.out.println("Fecha del Evento: " + temp.getDato().getFecha());
        System.out.println("-------------------------");
        temp = temp.getSiguiente();
        contador++;
    }
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
     public Evento buscarPorId(int id) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.getDato().getIdEvento() == id) {
                return temp.getDato();
            }
            temp = temp.getSiguiente();
        }
        return null;
    }
    
}


