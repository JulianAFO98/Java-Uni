package ej3.modelo;

import java.util.ArrayList;
import java.util.Observable;

public class Juego extends Observable{
    private int sigTurno;
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Baraja b;
    private int jugadoresQueYaJugaron = 0;
    private boolean juegoTerminado = false;


    public Juego(int sigTurno, ArrayList<Jugador> jugadores,Baraja b) {
        this.sigTurno = sigTurno;
        this.jugadores = jugadores;
        this.b = b;
        for (Jugador jugador : jugadores) {
            jugador.setJ(this);
        }
        
    }


    public synchronized Carta sacarCartas(Jugador j) throws InterruptedException{
        while(sigTurno!=j.getJugadorId())
            wait();
        System.out.println(j.getJugadorId()+" saco una carta");
        return b.robarCarta();
    }

    public synchronized void terminoSacarCartas(Jugador j) {

        int cantJugadores = this.jugadores.size();
        this.sigTurno = (this.sigTurno % cantJugadores) + 1;
        System.out.println(j.getJugadorId()+ " termino de sacar cartas");
        
        this.jugadoresQueYaJugaron++;
        if(this.jugadoresQueYaJugaron == this.jugadores.size()){
            siguienteMano();
        }else {
            notifyAll();
        }

    }





    private void calcularGanadorMano(){
        int maxPuntos = 0;
        Jugador j = null;

        for (Jugador jugador : jugadores) {
            if(jugador.getPuntosMano()>maxPuntos){
                maxPuntos = jugador.getPuntosMano();
                j=jugador;
            }
           
        }
        j.setManosGanadas(j.getManosGanadas()+1);
        System.out.println(j.getJugadorId()+ " gano esta mano");
    }

    private void resetearPuntosJugadores(){
        for (Jugador jugador : jugadores) {
            jugador.resetPuntos();
        }
    }

    public boolean terminoElJuego(){
        return juegoTerminado;
    }


    public void empezarJuego() {
        for (Jugador jugador : jugadores) {
            jugador.start();
        }
    }




    public synchronized  void siguienteMano() {
        int cantJugadores = this.jugadores.size();
        calcularGanadorMano();
        resetearPuntosJugadores();
        this.jugadoresQueYaJugaron = 0;
        notifyAll();
        if(b.tieneSuficientesCartas(cantJugadores)){
            this.juegoTerminado = true;
        }
    }


    public synchronized void obtenerGanador() {
        Jugador j = null;
        int maxGanadas = 0;
        for (Jugador jugador : jugadores) {
            if(jugador.getManosGanadas()>maxGanadas){
                j = jugador;
                maxGanadas = jugador.getManosGanadas();
            }
        }
        System.out.println(j.getJugadorId()+" gano el juego!");
    }

}
