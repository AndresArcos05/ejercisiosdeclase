/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Colas;
import Vista.Vista;

/**
 *
 * @author El Pepe
 */
public class controlador {
    Colas colaClientes;
    Vista vista;

    public controlador() {
        this.colaClientes = new Colas();
        this.vista = new Vista(colaClientes);
    }

    public void iniciar() {
        vista.mostrarMenu();
    }
}
