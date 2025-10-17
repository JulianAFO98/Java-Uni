package ej1;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import ej1.controller.ControladorJuego;
import ej1.modelo.Mapa;
import ej1.vista.Ventana;

public class Main {
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
                    Mapa m = new Mapa("Bosque Oscuro");
					Ventana frame = new Ventana();
                    ActionListener al = new ControladorJuego(m, frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}