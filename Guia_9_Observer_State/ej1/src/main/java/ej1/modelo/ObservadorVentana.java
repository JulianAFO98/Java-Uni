package ej1.modelo;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import ej1.vista.Ventana;

public class ObservadorVentana implements Observer{
    private ArrayList<Tamagochi> tamagochis = new ArrayList<>();
    private Ventana v;

    public ObservadorVentana(ArrayList<Tamagochi> tamas,Ventana v){
        this.tamagochis = tamas;
        this.v=v;
        for (Tamagochi t : tamagochis) {
            t.addObserver(this);
        }
    }

    @Override
    public void update(Observable tamagochi, Object arg) {
        EstadoTamagochi estado = (EstadoTamagochi) arg;
        this.v.agregarMensaje(tamagochi.toString()+" "+estado.getMensaje());
    }
}
