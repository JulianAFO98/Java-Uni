package memotest.vista;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import memotest.modelo.Tablero;
import memotest.modelo.interfaces.IJugador;

public interface IVista {
    void cambiarAPanelJuego();
    int getAlto();
    int getAncho();
    void empezarJuego(ArrayList<IJugador> j,Tablero t,ActionListener al);
    void resetearJuego();
    ArrayList<String> getJugadores();
    void addActionListener(ActionListener al);
    void mostrarMensaje(String msg);
    void redibujarConPuntuaciones(ArrayList<IJugador> j,Tablero t,ActionListener al);
}
