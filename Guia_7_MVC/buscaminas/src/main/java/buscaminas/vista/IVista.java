package buscaminas.vista;

import java.awt.event.ActionListener;

import buscaminas.modelo.Tablero;

public interface IVista {
    int getCampoI();
    int getCampoJ();
    int getCantMinas();
    void cambiarAPanelJuego();
    void generarTablero(Tablero t,ActionListener al);
    void addActionListener(ActionListener al);
    void mostrarDialog(String msg);
    void resetearJuego();
    void recargarVistaNuevamente(Tablero t,ActionListener al);
}
