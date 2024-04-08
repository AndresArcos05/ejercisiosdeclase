/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ListaDePlanetas;
import Modelo.Planetas;
import Vista.vista;

public class controlador {
    private ListaDePlanetas listaplanetas;
    private vista vista;

    public controlador() {
        listaplanetas = new ListaDePlanetas();
        vista = new vista();
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    String nombre = vista.obtenerplaneta();
                    listaplanetas.agregarPlaneta(new Planetas(nombre));
                    break;
                case 2:
                    listaplanetas.eliminarPlanetaActual();
                    break;
                case 3:
                    listaplanetas.avanzar();
                    break;
                case 4:
                    listaplanetas.retroceder();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
            }

            Planetas planetaActual = listaplanetas.getPlanetaActual();
            vista.mostrarplanetaActual(planetaActual);
        } while (opcion != 5);
    }
}