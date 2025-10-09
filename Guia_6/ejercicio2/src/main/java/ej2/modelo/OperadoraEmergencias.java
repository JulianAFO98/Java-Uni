package ej2.modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;

public class OperadoraEmergencias extends ListaConPrioridades<Llamado>{
    private ArrayList<Llamado> atendidos = new ArrayList<>();

    public int cantidadLlamados(Socio socio){
        int cantLlamados = 0;
        Iterator<Llamado> r = this.elementos.iterator();
        Llamado l;
        while(r.hasNext()){
           l = r.next();
           if (l.getSocio() == socio){
                cantLlamados++;
           }
        }
        return cantLlamados;

    }
    public Iterator<Llamado> getLlamadosAtendidos(){
        return atendidos.iterator();
    }

    public Socio getSocioMasEmergencias(){
        Iterator<Llamado> r = getLlamadosAtendidos();
        return null;
    }

    @Override
    public Llamado getElemento(){
        Llamado l = elementos.poll();
        l.setFechahoraAtendido(new GregorianCalendar());
        atendidos.add(l); // guardo el llamado atendido
        return l;
    }   
}
