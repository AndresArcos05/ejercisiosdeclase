/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ListaDePlanetas;
import Modelo.Planetas;
import Vista.vista;

/**
 *
 * @author El Pepe
 */
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
                    String titulo = vista.obtenerplaneta();
                    listaplanetas.agregaPlaneta(new Planetas(titulo));
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

            Planetas Actual = listaplanetas.getCancionActual();
            vista.mostrarplanetaActual(Actual);
        } while (opcion != 5);
    }
}
