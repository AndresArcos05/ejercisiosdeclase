/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author El Pepe
 */
public class Pilas<T> {
      private NodoPilas top;

        public boolean estaVacia() {
            return top == null;
        }

        public void apilar(T item) {
            NodoPilas nuevoNodo = new NodoPilas((char) item);
            nuevoNodo.siguiente = top;
            top = nuevoNodo;
        }

        public T desapilar() {
            if (estaVacia()) {
                return null;
            }
            char dato = (char) top.dato;
            top = top.siguiente;
            return (T) Character.valueOf(dato);
        }

        public T verTope() {
            return estaVacia() ? null : (T) Character.valueOf((char) top.dato);
        }
    }



