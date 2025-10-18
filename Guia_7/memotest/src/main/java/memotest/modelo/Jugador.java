package memotest.modelo;

import memotest.modelo.interfaces.IJugador;

public class Jugador implements IJugador{
    private String nombre;
    private int aciertos;
    private boolean suTurno;

    


    public Jugador(String nombre, int aciertos, boolean suTurno) {
        this.nombre = nombre;
        this.aciertos = aciertos;
        this.suTurno = suTurno;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public int getAciertos() {
       return this.aciertos;
    }

    @Override
    public void setTurnoActual() {
       this.suTurno=!this.suTurno;
    }

    @Override
    public boolean getTurno() {
       return this.suTurno;
    }

    
}
