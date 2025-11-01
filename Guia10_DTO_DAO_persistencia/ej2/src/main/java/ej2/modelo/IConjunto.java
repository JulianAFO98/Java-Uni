package ej2.modelo;

import java.util.Iterator;

import ej2.modelo.OperacionConjuntosException;

public interface IConjunto<T> {
    public void agrega(T elemento) throws OperacionConjuntosException;
    public void elimina(T elemento) throws OperacionConjuntosException;
    public int getCardinal();
    public Iterator<T> getIterator();
}
