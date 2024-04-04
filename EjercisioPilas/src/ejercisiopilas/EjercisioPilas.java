/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercisiopilas;

import Controlador.Controlador;
import Modelo.HistorialDeNabegacion;
import Vista.VistaHistorial;

public class EjercisioPilas {

    public static void main(String[] args) {
        // Inicialización del modelo
         HistorialDeNabegacion historial = new HistorialDeNabegacion();

        // Crear la vista
        VistaHistorial vista = new VistaHistorial(null);  // El controlador se asignará más tarde

        // Crear el controlador y asignarle el modelo y la vista
        Controlador controlador = new Controlador(historial, vista);

        // Asignar el controlador a la vista
        vista.setControlador(controlador);

        // Mostrar la vista
        vista.mostrar();
    }
    }

