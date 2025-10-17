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
public class ControladorJuego implements ActionListener {
    private Mapa mapa;
    private IVista ventana;

    public ControladorJuego(Mapa mapa, Ventana ventana) {
        this.mapa = mapa;
        this.ventana = ventana;
        this.ventana.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String comando = e.getActionCommand();

        if (comando.equalsIgnoreCase("arquero"))
            this.crearPersonaje("arquero");
        if (comando.equalsIgnoreCase("mago"))
            this.crearPersonaje("mago");
        if (comando.equalsIgnoreCase("caballero"))
            this.crearPersonaje("caballero");
        if (comando.equalsIgnoreCase("paladin"))
            this.crearPersonaje("paladin");
        if (comando.equalsIgnoreCase("dragon"))
            this.crearPersonaje("dragon");
        if (comando.equalsIgnoreCase("mover"))
            this.mover();
        if (comando.equalsIgnoreCase("atacar"))
            this.atacar();
        if (comando.equalsIgnoreCase("maldito"))
            this.maldecir();
        if (comando.equalsIgnoreCase("bendito"))
            this.bendecir();

        this.actualizarListas();

    }

    private void maldecir() {
        Personaje p = (Personaje) this.ventana.getPrimerPersonaje();
        if(p != null){
            p.serMaldecido();
            this.ventana.actualizarLog(p.getNombre() + " fue maldecido!\n");
        }else{
            this.ventana.generarDialog("Elija un personaje de la lista para maldecir!");
        }

    }

    private void bendecir() {
        Personaje p = (Personaje) this.ventana.getPrimerPersonaje();
        if(p != null){
            p.serBendecido();
            this.ventana.actualizarLog(p.getNombre() + " fue bendecido!\n");
        }else{
            this.ventana.generarDialog("Elija un personaje de la lista para bendecir!");
        }

    }

    private void atacar() {
        Personaje p1 = this.ventana.getPrimerPersonaje();
        Personaje p2 = this.ventana.getSegundoPersonaje();
        if (p1 != null && p2 != null) {
            if (p1 == p2) {
                this.ventana.generarDialog("El personaje no se puede atacar a si mismo!");
            } else {
                try {
                    mapa.ataca(p1, p2);
                    this.ventana.actualizarLog(p1.getNombre() + " ataco a " + p2.getNombre() + "\n");
                } catch (AtaqueImposibleException e) {
                    double distDeAtaque = e.getAtacante().getDistanciaMaximaDeDesplazamiento();
                    this.ventana.generarDialog(p1.getNombre() + " quizo atacar a " + p2.getNombre()+ " pero estaba fuera de rango(Distancia Max: " + distDeAtaque + ")\n");
                }
            }
        } else {
           this.ventana.generarDialog("Falto seleccionar algun personaje");
        }

    }

    private void actualizarListas() {
        this.ventana.actualizarListas(this.mapa.getPersonajes());
    }

    private void mover() {
        Personaje p = this.ventana.getPrimerPersonaje();
        double x = this.ventana.getCantidadX();
        double y = this.ventana.getCantidadY();
        if(p!=null){
            mapa.mueve(p, x, y);
            this.ventana.actualizarLog(p.getNombre() + " se movio a " + "(" + p.getPosx() + "," + p.getPosy() + ")\n");
        }else {
            this.ventana.generarDialog("Falto seleccionar algun personaje");
        }

    }

    private void crearPersonaje(String clasePersonaje) {
        String nombre = this.ventana.getNombrePersonaje();
        if (nombre.isEmpty() || nombre == null){
            this.ventana.generarDialog("No se crear un personaje sin nombre");
        }else {
            if (clasePersonaje.equalsIgnoreCase("arquero"))
                mapa.agregarPersonaje(new Arquero(nombre, new Posicion(0, 0)));
            else if (clasePersonaje.equalsIgnoreCase("dragon"))
                mapa.agregarPersonaje(new Dragon(nombre, 1000, 30, new Posicion(0, 0), 100));
            else if (clasePersonaje.equalsIgnoreCase("paladin"))
                mapa.agregarPersonaje(new Paladin(nombre, new Posicion(0, 0)));
            else if (clasePersonaje.equalsIgnoreCase("caballero"))
                mapa.agregarPersonaje(new Caballero(nombre, new Posicion(0, 0)));
            else if (clasePersonaje.equalsIgnoreCase("mago"))
                mapa.agregarPersonaje(new Mago(nombre, new Posicion(0, 0)));
            this.ventana.actualizarLog("Se creo un personaje con nombre : "+nombre+"\n");
        }
    }

}