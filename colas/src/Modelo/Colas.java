/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author El Pepe
 */
public class Colas {
        Nodo frente;
    Nodo fin;
    int contadorTicket;

    public Colas() {
        this.frente = null;
        this.fin = null;
        this.contadorTicket = 0;
    }

    public void agregarCliente(String nombre) {
        this.contadorTicket++;
        Cliente cliente = new Cliente(nombre, this.contadorTicket);
        Nodo nuevoNodo = new Nodo(cliente);

        if (this.frente == null) {
            this.frente = nuevoNodo;
            this.fin = nuevoNodo;
        } else {
            this.fin.siguiente = nuevoNodo;
            this.fin = nuevoNodo;
        }

        System.out.println("Cliente " + cliente.nombre + " agregado con ticket " + cliente.numeroTicket);
    }

    public void atenderCliente() {
        if (this.frente != null) {
            Cliente cliente = this.frente.cliente;
            this.frente = this.frente.siguiente;
            System.out.println("Atendiendo al cliente " + cliente.nombre + " con ticket " + cliente.numeroTicket);
        } else {
            System.out.println("No hay clientes en espera");
        }
    }

    public boolean hayClientes() {
        return this.frente != null;
    }

    public void mostrarClientes() {
        Nodo actual = this.frente;
        if (actual == null) {
            System.out.println("No hay clientes en espera");
            return;
        }

        System.out.println("Clientes en espera:");
        while (actual != null) {
            System.out.println("Cliente: " + actual.cliente.nombre + " - Ticket: " + actual.cliente.numeroTicket);
            actual = actual.siguiente;
        }
    }
}

