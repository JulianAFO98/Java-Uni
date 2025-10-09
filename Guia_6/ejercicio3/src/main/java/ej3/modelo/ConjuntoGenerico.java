package ej3.modelo;

import java.util.Iterator;
import java.util.LinkedHashSet;

import ej3.modelo.excepciones.OperacionConjuntosException;
import ej3.modelo.interfaces.IConjunto;

public class ConjuntoGenerico <T> implements IConjunto<T>{
    private LinkedHashSet<T> elementos = new LinkedHashSet<>();
    
    
    public int getCardinal(){
        return elementos.size();
    }
    public Iterator<T> getIterator(){
        return  elementos.iterator();
    }
    @Override
    public void agrega(T elemento) throws OperacionConjuntosException {
        if(elementos.contains(elemento))
            throw new OperacionConjuntosException("No se puede agregar valores repetidos",elemento);
        elementos.add(elemento);
    }
    @Override
    public void elimina(T elemento) throws OperacionConjuntosException{
        if(!elementos.contains(elemento))
            throw new OperacionConjuntosException("No se puede quitar un valor inexistente",elemento);
         elementos.remove(elemento);
    }

    public void mostrarTodos(){
        for (T t : elementos) {
            System.out.println(t);
        }
    }
}
