package ej1.vista;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Ventana extends JFrame{
    private JPanel panel;
    private JScrollPane panelLista;
    private DefaultListModel<String> modelo;
    private JList<String> log;

    public Ventana() {
        setTitle("Log de Tamagotchis");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null); // centra la ventana

        panel = new JPanel(new BorderLayout());

        // Modelo de datos para JList
        modelo = new DefaultListModel<>();
        log = new JList<>(modelo);

        // JScrollPane correcto para JList
        panelLista = new JScrollPane(log);

        panel.add(panelLista, BorderLayout.CENTER);

        add(panel);
        setVisible(true);
    }

    public void agregarMensaje(String mensaje) {
        modelo.addElement(mensaje);
        log.ensureIndexIsVisible(modelo.getSize() - 1); 
    }
}





