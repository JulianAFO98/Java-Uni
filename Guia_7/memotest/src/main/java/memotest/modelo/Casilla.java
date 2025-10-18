package memotest.modelo;

import memotest.modelo.interfaces.ICasilla;

public class Casilla implements ICasilla{
    private int i;
    private int j;
    private int numeroConjunto;
    private boolean pisado;

    
    public Casilla(int i, int j, int numeroConjunto) {
        this.i = i;
        this.j = j;
        this.numeroConjunto = numeroConjunto;
        this.pisado = false;
    }


    public int getI() {
        return i;
    }


    public void setI(int i) {
        this.i = i;
    }


    public int getJ() {
        return j;
    }


    public void setJ(int j) {
        this.j = j;
    }


    public int getNumeroConjunto() {
        return numeroConjunto;
    }


    public void setNumeroConjunto(int numeroConjunto) {
        this.numeroConjunto = numeroConjunto;
    }


    @Override
    public void setPisado() {
        this.pisado = !this.pisado;
    }


    @Override
    public boolean isPisado() {
        return this.pisado;
    }

    
}
