package ej4;
import java.awt.EventQueue;


import ej4.controller.EstacionController;
import ej4.modelo.Estacion;
import ej4.vista.IVista;
import ej4.vista.Ventana;
public class Main {
   public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IVista v = new Ventana();
					Estacion e = new Estacion("YPF");
					EstacionController ec = new EstacionController(e, v);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}