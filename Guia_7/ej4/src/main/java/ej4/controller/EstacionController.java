package ej4.controller;

import ej4.modelo.Combustible;
import ej4.modelo.Estacion;
import ej4.modelo.Gasoil;
import ej4.modelo.IDespachador;
import ej4.modelo.NaftaPremium;
import ej4.modelo.NaftaSuper;
import ej4.modelo.Surtidor;
import ej4.vista.IVista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EstacionController implements IController,ActionListener {

    private Estacion estacion;
    private IVista v;


    public EstacionController(Estacion e, IVista v) {
        this.estacion = e;
        this.v = v;
        this.v.addActionListener(this);
    }


    @Override
    public void actualizarSurtidor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarSurtidor'");
    }


    @Override
    public void crearSurtidor() {
        this.estacion.agregarSurtidor(new Surtidor());
    }


    @Override
    public void eliminarSurtidor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarSurtidor'");
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        if(comando.equalsIgnoreCase("crearSurtidor")){
            crearSurtidor();
        }else if(comando.equalsIgnoreCase("agregarNaftaPremium")){
            Combustible c = new NaftaPremium(150,"Nafta Premium");
            agregarCombustibleASurtidor(c);
        }else if(comando.equalsIgnoreCase("agregarGasoil")){
            Combustible c = new Gasoil(75,"Gasoil");
            agregarCombustibleASurtidor(c);
        }else if(comando.equalsIgnoreCase("agregarNaftaSuper")){
            Combustible c = new NaftaSuper(100,"Nafta Super");
            agregarCombustibleASurtidor(c);
        }
        this.v.actualizarVista(this.estacion);
    }


    @Override
    public void agregarCombustibleASurtidor(Combustible c) {
        IDespachador d = this.v.getValorSeleccionado();
        if (d == null){
            this.v.mostrarMensaje("Seleccione un surtidor");
        }else {
            d.agregarCombustible(c,20000);
        }
        
            
    }




    
}
