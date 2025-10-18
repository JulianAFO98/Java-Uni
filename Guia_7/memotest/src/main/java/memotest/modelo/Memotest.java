package memotest.modelo;

import java.util.ArrayList;

import memotest.modelo.interfaces.IJugador;

public class Memotest {
    private Tablero t;
    private ArrayList<IJugador> jugadores = new ArrayList<>();
    public Memotest(Tablero t, ArrayList<String> jugadores) {
        this.t = t;
        for(int i=0;i<jugadores.size();i++){
            this.jugadores.add(new Jugador(jugadores.get(i),0,false));
        }
    }
    public Tablero getT() {
        return t;
    }
    public ArrayList<IJugador> getJugadores() {
        return jugadores;
    }

    

    
}
