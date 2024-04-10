/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ListaDoblementeenlazada;
import Modelo.NodoPilas;
import Vista.Vista;

/**
 *
 * @author El Pepe
 */
public class controlador {

    private ListaDoblementeenlazada listaVariables;
    private NodoPilas pilaMemoria;
    private Vista vista;

    public controlador(int capacidadMemoria) {
        this.listaVariables = new ListaDoblementeenlazada();
        this.pilaMemoria = new NodoPilas();
        this.vista = new Vista(this);

    }
    public String mostrarListaVariables() {
    return listaVariables.mostrar();
}

    public void ingresarVariable(String nombreVariable, int tamaño) {
        String mensaje = " Variable Ingresada: " + nombreVariable + " (Con tamaño " + tamaño + ")\n";
        pilaMemoria.push(mensaje);
        listaVariables.insertarAlFinal(mensaje);
        vista.mostrarMensaje();  
    }

    public void entrarAlAmbito() {
        String mensaje = "Entrando al ambito\n";
        pilaMemoria.push(mensaje);
        listaVariables.insertarAlFinal(mensaje);
        vista.mostrarMensaje();  
    }

    public void limpiarMemoria() {
        String mensaje = "Limpiando memoria\n";
        pilaMemoria.push(mensaje);
        listaVariables.insertarAlFinal(mensaje);
        vista.mostrarMensaje();  
    }

}
