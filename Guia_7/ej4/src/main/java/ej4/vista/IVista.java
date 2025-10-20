package ej4.vista;

import java.awt.event.ActionListener;

import ej4.modelo.Estacion;
import ej4.modelo.IDespachador;

public interface IVista {
    IDespachador getValorSeleccionado();
    void mostrarMensaje(String msg);
    void actualizarVista(Estacion e);
    void addActionListener(ActionListener al);
}
