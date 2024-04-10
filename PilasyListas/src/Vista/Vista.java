/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author El Pepe
 */
public class Vista {

    private JFrame frame;
    private JPanel panel;
    private JTextField nombreVariable;
    private JTextField tamañoVariable;
    private JButton btnDeclarar;
    private JButton btnEliminar;
    private JButton btnambito;
    public JTextArea areaRegistro;
    private controlador controlador;

    public Vista(controlador controlador) {
    this.controlador = controlador;

    frame = new JFrame("Gestión de Memoria");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);

    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    nombreVariable = new JTextField(20);
    tamañoVariable = new JTextField(20);
    btnDeclarar = new JButton("Declarar");
    btnEliminar = new JButton("Limpiar");
    btnambito = new JButton("entrar al ambito");
    areaRegistro = new JTextArea(10, 30);

    btnDeclarar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombre = nombreVariable.getText();
            int size = Integer.parseInt(tamañoVariable.getText());
            controlador.ingresarVariable(nombre, size);
        }
    });

    btnEliminar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = nombreVariable.getText();
        controlador.limpiarMemoria();
    }
    });
    btnambito.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = nombreVariable.getText();
        controlador.entrarAlAmbito();
    }
    });

    panel.add(new JLabel("Nombre de la Variable:"));
    panel.add(nombreVariable);
    panel.add(new JLabel("Tamaño de la Variable:"));
    panel.add(tamañoVariable);
    panel.add(btnDeclarar);
    panel.add(btnEliminar);
    panel.add(btnambito);
    panel.add(new JLabel("Registro de Variables:"));
    panel.add(areaRegistro);

    frame.add(panel);
    frame.setVisible(true);
    }
    public void actualizarRegistro(String registro) {
        areaRegistro.setText(registro);
    }
    public void mostrarMensaje() {
    String registro = controlador.mostrarListaVariables();
    areaRegistro.setText(registro);
}
}

