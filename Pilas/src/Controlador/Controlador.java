/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ListaPilas;

/**
 *
 * @author El Pepe
 */
public class Controlador {
    private final ListaPilas pila;
    public Controlador(){
        pila = new ListaPilas();
    }

    public boolean verificarBalance(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == '(') {
                pila.agregar(1); 
            } else if (caracter == ')') {
                if(pila.estavacia()){
                    return false;                   
                }
                try {
                    pila.imprimir();
                } catch (Exception e) {
                    return false;
                }
            }
        }
       
        return pila.estavacia();
    }
}
