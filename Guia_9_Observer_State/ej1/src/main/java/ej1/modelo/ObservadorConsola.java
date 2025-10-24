package ej1.modelo;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class ObservadorConsola implements Observer{

    private ArrayList<Tamagochi> tamagochis = new ArrayList<>();

    public ObservadorConsola(ArrayList<Tamagochi> tamas){
        this.tamagochis = tamas;
        for (Tamagochi t : tamagochis) {
            t.addObserver(this);
        }
    }

    @Override
    public void update(Observable tamagochi, Object arg) {
        EstadoTamagochi estado = (EstadoTamagochi) arg;
        System.out.println(tamagochi.toString()+" "+estado.getMensaje());
    }

}
