/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author El Pepe
 */
public class NodoPilas {
    Pagina dato;
    NodoPilas siguiente;

    public NodoPilas(Pagina dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
