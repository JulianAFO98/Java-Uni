package ej3;

import java.util.ArrayList;

import ej3.modelo.Baraja;
import ej3.modelo.Juego;
import ej3.modelo.Jugador;

public class Main {
    public static void main(String[] args) {
        Jugador j1 = new Jugador(1);
        Jugador j2 = new Jugador(2);
        Jugador j3 = new Jugador(3);
        Jugador j4 = new Jugador(4);
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(j4);
        jugadores.add(j1);
        jugadores.add(j2);
        jugadores.add(j3);

        Baraja b = new Baraja();

        Juego j = new Juego(1, jugadores, b);

        j.empezarJuego();

        // espero que todos terminen 
        for (Jugador jugador : jugadores) {
        try {
            jugador.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

        j.obtenerGanador();
    }
      
}