package ej2.modelo;

import java.util.ArrayList;
import java.util.GregorianCalendar;
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
        ArrayList<Socio> socios = new ArrayList<>();
        ArrayList<Integer> cantLlamados = new ArrayList<>();
        Iterator<Llamado> r = getLlamadosAtendidos();
        Llamado l;
        int pos;
        while(r.hasNext()){
            l = r.next();
            if (!socios.contains(l.getSocio())){
                socios.add(l.getSocio());
                cantLlamados.add(1);
            } else {
                pos = socios.indexOf(l.getSocio());
                cantLlamados.set(pos, cantLlamados.get(pos) + 1);
            }
        }
        int max = -1;
        int posMax = -1;
        for (int i = 0; i < cantLlamados.size(); i++) {
            if (cantLlamados.get(i) > max){
                max = cantLlamados.get(i);
                posMax = i;
            }
        }
        return socios.get(posMax);
    }

    @Override
    public Llamado getElemento(){
        Llamado l = elementos.poll();
        l.setFechahoraAtendido(new GregorianCalendar());
        atendidos.add(l); // guardo el llamado atendido
        return l;
    }   
}
