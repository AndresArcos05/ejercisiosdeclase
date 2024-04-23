/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author El Pepe
 */
public class EncriptacionModel {
     private static final char[] claveEncriptacion = {
        'x', 'y', 'z', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 
        'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'
    };
    

    public String encriptarContraseña(String contraseña) {
        StringBuilder contraseñaEncriptada = new StringBuilder();
        Pilas<Character> pila = new Pilas<>();

        for (char caracter : contraseña.toCharArray()) {
            char caracterEncriptado = encriptarCaracter(caracter);
            pila.apilar(caracterEncriptado);
            contraseñaEncriptada.append(caracterEncriptado);
        }

        return contraseñaEncriptada.toString();
    }

    public String desencriptarContraseña(String contraseñaEncriptada) {
        StringBuilder contraseñaDesencriptada = new StringBuilder();
        Pilas<Character> pila = new Pilas<>();

        for (char caracter : contraseñaEncriptada.toCharArray()) {
            char caracterOriginal = desencriptarCaracter(caracter);
            pila.apilar(caracterOriginal);
            contraseñaDesencriptada.append(caracterOriginal);
        }

        return contraseñaDesencriptada.toString();
    }

    private char encriptarCaracter(char caracter) {
        if (Character.isLowerCase(caracter)) {
            int indice = caracter - 'a';
            return claveEncriptacion[indice];
        } else if (Character.isUpperCase(caracter)) {
            int indice = caracter - 'A';
            return Character.toUpperCase(claveEncriptacion[indice]);
        } else {
            return caracter;
        }
    }

    private char desencriptarCaracter(char caracter) {
        if (Character.isLowerCase(caracter)) {
            int indice = buscarIndice(claveEncriptacion, Character.toLowerCase(caracter));
            return (indice != -1) ? (char) ('a' + indice) : caracter;
        } else if (Character.isUpperCase(caracter)) {
            int indice = buscarIndice(claveEncriptacion, Character.toLowerCase(caracter));
            return (indice != -1) ? Character.toUpperCase((char) ('a' + indice)) : caracter;
        } else {
            return caracter;
        }
    }

    private int buscarIndice(char[] array, char valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}
