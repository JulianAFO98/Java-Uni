package ej3.modelo.interfaces;

import java.util.Iterator;

import ej3.modelo.excepciones.OperacionConjuntosException;

public interface IConjunto<T> {
    public void agrega(T elemento) throws OperacionConjuntosException;
    public void elimina(T elemento) throws OperacionConjuntosException;
    public int getCardinal();
    public Iterator<T> getIterator();
}
