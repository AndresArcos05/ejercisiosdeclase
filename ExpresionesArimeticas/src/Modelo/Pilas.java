/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author El Pepe
 */
public class Pilas {
     private NodoPilas cima;
    
    public Pilas() {
        cima = null;
    }
    
    public void push(double dato) {
        NodoPilas nuevoNodo = new NodoPilas(dato);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }
    
    public double pop() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila esta vacia");
        }
        
        double dato = cima.dato;
        cima = cima.siguiente;
        return dato;
    }
    
    public double peek() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila esta vacia");
        }
        
        return cima.dato;
    }
    
    public boolean estaVacia() {
        return cima == null;
    }
    
    public double evaluar(String expresion) {
        String[] tokens = expresion.split(" ");
        
        for (String token : tokens) {
            if (esNumero(token)) {
                push(Double.parseDouble(token));
            } else if (esOperador(token)) {
                double operando2 = pop();
                double operando1 = pop();
                
                switch (token) {
                    case "+":
                        push(operando1 + operando2);
                        break;
                    case "-":
                        push(operando1 - operando2);
                        break;
                    case "*":
                        push(operando1 * operando2);
                        break;
                    case "/":
                        push(operando1 / operando2);
                        break;
                }
            }
        }
        
        return pop();
    }
    
    private boolean esNumero(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private boolean esOperador(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
}

