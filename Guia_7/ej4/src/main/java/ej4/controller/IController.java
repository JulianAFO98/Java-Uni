package ej4.controller;

import ej4.modelo.Combustible;

public interface IController {
    void actualizarSurtidor();
    void crearSurtidor();
    void eliminarSurtidor();
    void agregarCombustibleASurtidor(Combustible c);
}
