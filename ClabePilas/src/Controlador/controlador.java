/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.EncriptacionModel;

/**
 *
 * @author El Pepe
 */
public class controlador {
     private final EncriptacionModel model;

    public controlador(EncriptacionModel model) {
        this.model = model;
    }

    public String encriptarContraseña(String contraseña) {
        return model.encriptarContraseña(contraseña);
    }

    public String desencriptarContraseña(String contraseñaEncriptada) {
        return model.desencriptarContraseña(contraseñaEncriptada);
    }
}

