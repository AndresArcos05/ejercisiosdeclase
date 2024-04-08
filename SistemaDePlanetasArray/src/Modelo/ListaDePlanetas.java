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
public class ListaDePlanetas {
    private ArrayList<Planetas> lista;
    private int indiceActual;

    public ListaDePlanetas() {
        lista = new ArrayList<>();
        indiceActual = -1;
    }

    public void agregarPlaneta(Planetas planeta) {
        lista.add(planeta);
        indiceActual = lista.size() - 1;
    }

    public void eliminarPlanetaActual() {
        if (!lista.isEmpty()) {
            lista.remove(indiceActual);
            if (indiceActual >= lista.size()) {
                indiceActual = 0;
            }
        }
    }

    public void avanzar() {
        if (!lista.isEmpty()) {
            indiceActual = (indiceActual + 1) % lista.size();
        }
    }

    public void retroceder() {
        if (!lista.isEmpty()) {
            indiceActual = (indiceActual - 1 + lista.size()) % lista.size();
        }
    }

    public Planetas getPlanetaActual() {
        if (!lista.isEmpty()) {
            return lista.get(indiceActual);
        }
        return null;
    }
}
