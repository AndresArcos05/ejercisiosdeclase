/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class HistorialDeNabegacion {

    private NodoPilas top;
    private NodoPilas current;

    public void visitarPagina(Pagina pagina) {
        NodoPilas nuevoNodo = new NodoPilas(pagina);
        if (current != null) {
            current.siguiente = nuevoNodo;
        }
        current = nuevoNodo;
        if (top == null) {
            top = current;
        }
    }

    public Pagina retroceder() {
        if (current != null && current != top) {
            NodoPilas temp = top;
            while (temp.siguiente != current) {
                temp = temp.siguiente;
            }
            current = temp;
            return current.dato;
        }
        return null;
    }

    public Pagina avanzar() {
        if (current != null && current.siguiente != null) {
            current = current.siguiente;
            return current.dato;
        }
        return null;
    }

    public Pagina getPaginaActual() {
        if (current != null) {
            return current.dato;
        }
        return null;
    }
}

  


