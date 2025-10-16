package ej1.controller;

import ej1.modelo.Arquero;
import ej1.modelo.AtaqueImposibleException;
import ej1.modelo.Caballero;
import ej1.modelo.Dragon;
import ej1.modelo.IVista;
import ej1.modelo.Mago;
import ej1.modelo.Mapa;
import ej1.modelo.Paladin;
import ej1.modelo.Personaje;
import ej1.modelo.Posicion;
import ej1.vista.Ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ControladorJuego implements ActionListener {
    private Mapa mapa;
    private IVista ventana;

    public ControladorJuego(Mapa mapa, Ventana ventana) {
        this.mapa = mapa;
        this.ventana = ventana;
        this.ventana.setControlador(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton btn = (JButton) e.getSource();

        if (btn.getActionCommand().equalsIgnoreCase("arquero"))
            this.crearArquero();
        if (btn.getActionCommand().equalsIgnoreCase("mago"))
            this.crearMago();
        if (btn.getActionCommand().equalsIgnoreCase("caballero"))
            this.crearCaballero();
        if (btn.getActionCommand().equalsIgnoreCase("paladin"))
            this.crearPaladin();
        if (btn.getActionCommand().equalsIgnoreCase("dragon"))
            this.crearDragon();
        if (btn.getActionCommand().equalsIgnoreCase("mover"))
            this.mover();
        if (btn.getActionCommand().equalsIgnoreCase("atacar"))
            this.atacar();
        if (btn.getActionCommand().equalsIgnoreCase("maldito"))
            this.maldecir();
        if (btn.getActionCommand().equalsIgnoreCase("bendito"))
            this.bendecir();

        this.actualizarListas();

    }

    

}