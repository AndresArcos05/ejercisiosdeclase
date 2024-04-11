/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Pilas;
import Vista.vista;

/**
 *
 * @author El Pepe
 */
public class controlador {
    private vista vista;
    private Pilas calculadora;
    
    public controlador() {
        this.vista = new vista();
        this.calculadora = new Pilas();
    }
    
    public void iniciar() {
        vista.mostrarMensaje("Calculadora RPN");
        
        String expresion = vista.leerExpresion();
        double resultado = calculadora.evaluar(expresion);
        
        vista.mostrarResultado(resultado);
    }
}
