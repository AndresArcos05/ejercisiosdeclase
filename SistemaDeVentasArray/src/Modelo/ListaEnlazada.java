/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author El Pepe
 */
public class ListaEnlazada {

    private ArrayList<String> lista;

    public ListaEnlazada() {
        this.lista = new ArrayList<>();
    }

    public boolean estaVacia() {
        return lista.isEmpty();
    }

    public void agregarAInicio(String dato) {
        lista.add(0, dato);
    }

    public void eliminarAlInicio() {
        if (!estaVacia()) {
            lista.remove(0);
        }
    }

    public void imprimirLista() {
        if (estaVacia()) {
            System.out.println("La lista está vacía.");
        } else {
            for (String dato : lista) {
                System.out.println(dato);
            }
        }
    }
}