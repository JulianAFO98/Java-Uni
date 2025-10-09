package ej2.modelo;

import java.util.PriorityQueue;

public class ListaConPrioridades <T extends Comparable>{
    protected PriorityQueue<T> elementos = new PriorityQueue<T>();

    public void agrega(T elemento){
        this.elementos.add(elemento);
    }
    public T consultaElemento(){
        return elementos.peek();
    }

    public int getCantidad(){
        return elementos.size();
    }

    public T getElemento(){
        return elementos.poll();
    }   

    

}
