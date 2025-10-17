package ej1.modelo;

import java.awt.event.ActionListener;
import java.util.ArrayList;

public interface IVista {
    void addActionListener(ActionListener controlador);
    void actualizarLog(String log);
    Personaje getPrimerPersonaje();
    Personaje getSegundoPersonaje();
    String getNombrePersonaje();
    double getCantidadX();
    double getCantidadY();
    void actualizarListas(ArrayList<Personaje> personajes);
    void generarDialog(String msg);
}
