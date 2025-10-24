package buscaminas.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import buscaminas.modelo.Buscaminas;
import buscaminas.modelo.interfaces.ICasilla;
import buscaminas.vista.IVista;

public class Controller implements IControlador,ActionListener{
    private Buscaminas bm;
    private IVista v;

    

    public Controller( IVista v) {
        this.v = v;
        this.v.addActionListener(this);
    }



    @Override
    public void empezarJuego() {
        int altura = this.v.getCampoI();
        int ancho = this.v.getCampoJ();
        int cantMinas = this.v.getCantMinas();
        try {
            this.bm = new Buscaminas(altura, ancho, cantMinas);
        } catch (Exception e) {
            this.v.mostrarDialog(e.getMessage());
            return;
        }
        this.v.generarTablero(bm.getT(), this);
        this.v.cambiarAPanelJuego();
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        if(comando.equalsIgnoreCase("empezar")){
            empezarJuego();
        }else if(comando.equalsIgnoreCase("apretoCasillero")){
            ICasilla casilla =(ICasilla) e.getSource();
            boolean isMina = this.bm.getT().isMina(casilla.getI(), casilla.getJ());
            if(isMina){
                this.v.mostrarDialog("Perdiste!");
                this.v.resetearJuego();
            }else {
                this.bm.getT().activarCasillas(casilla.getI(), casilla.getJ());
                this.v.recargarVistaNuevamente(bm.getT(), this);
            }
        }
        
    }

}
