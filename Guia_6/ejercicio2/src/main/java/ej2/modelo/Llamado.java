package ej2.modelo;

import java.util.GregorianCalendar;

public class Llamado implements Comparable{
    private GregorianCalendar fechahoraAtendido;
    private GregorianCalendar fechaHoraPedido;
    private int prioridad;
    private Socio socio;
    public Llamado( int prioridad, Socio socio) {
        this.fechahoraAtendido = null;
        this.fechaHoraPedido = new GregorianCalendar();
        this.prioridad = prioridad;
        this.socio = socio;
    }

    
    public GregorianCalendar getFechahoraAtendido() {
        return fechahoraAtendido;
    }
   
    public GregorianCalendar getFechaHoraPedido() {
        return fechaHoraPedido;
    }
    
    public int getPrioridad() {
        return prioridad;
    }
    
    public Socio getSocio() {
        return socio;
    }
    
    void setFechahoraAtendido(GregorianCalendar fechahoraAtendido){
        this.fechahoraAtendido=fechahoraAtendido;
    }


    @Override
    public int compareTo(Object otro) {
        Llamado l = (Llamado) otro;
        int res = 0;
        if(this.prioridad>l.prioridad){
            res = -1;
        }else if(this.prioridad<l.prioridad) {
            res = 1;
        }
        if(res == 0){
            res = this.fechaHoraPedido.compareTo(l.fechaHoraPedido);
        }
        return res;

    }


    @Override
    public String toString() {
        return "Llamado [prioridad=" + prioridad + ", socio=" + socio + "]";
    }
    
    
}
