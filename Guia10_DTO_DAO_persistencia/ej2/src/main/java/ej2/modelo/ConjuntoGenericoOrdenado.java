package ej2.modelo;

import java.io.Serializable;
import java.util.Iterator;
import java.util.TreeSet;


public class ConjuntoGenericoOrdenado<T extends Comparable & Serializable> implements IConjunto<T> {
    private TreeSet<T> elementos = new TreeSet<>();
    private static final long serialVersionUID = 1L;

    @Override
    public int getCardinal() {
        return elementos.size();
    }

    @Override
    public Iterator<T> getIterator() {
        return elementos.iterator();
    }

    public T getMayor() {
        return elementos.getLast();
    }

    public T getMenor() {
        return elementos.getFirst();
    }

    @Override
    public void agrega(T elemento) throws OperacionConjuntosException {
        if (elementos.contains(elemento))
            throw new OperacionConjuntosException("No se puede agregar valores repetidos", elemento);
        elementos.add(elemento);
    }

    @Override
    public void elimina(T elemento) throws OperacionConjuntosException {
        if (!elementos.contains(elemento))
            throw new OperacionConjuntosException("No se puede quitar un valor inexistente", elemento);
        elementos.remove(elemento);
    }

    public void mostrarTodos(){
        for (T t : elementos) {
            System.out.println(t);
        }
    }
}
