package buscaminas;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import buscaminas.controller.Controller;
import buscaminas.vista.Ventana;

public class Main {
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
                    ActionListener al = new Controller(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}