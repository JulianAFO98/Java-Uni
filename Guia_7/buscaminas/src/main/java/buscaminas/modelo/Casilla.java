package buscaminas.modelo;

import buscaminas.modelo.interfaces.ICasilla;

public class Casilla implements ICasilla{
    private int i;
    private int j;
    private boolean isMina;
    private boolean isPisada;
    private String texto;
    
    public Casilla(int i, int j, boolean isMina,String texto) {
        this.i = i;
        this.j = j;
        this.isMina = isMina;
        this.texto=texto;
        this.isPisada=false;
    }


    public boolean isMina() {
        return isMina;
    }

    public void setMina(){
        this.isMina=true;
    }

    

    public boolean isPisada() {
        return isPisada;
    }


    public void setPisada(boolean isPisada) {
        this.isPisada = isPisada;
    }


    @Override
    public int getI() {
       return i;
    }


    @Override
    public int getJ() {
        return j;
    }


    @Override
    public void setTexto(String text) {
       this.texto = text;
    }


    @Override
    public String getText() {
       return texto;
    }
    
    
    
    
}
