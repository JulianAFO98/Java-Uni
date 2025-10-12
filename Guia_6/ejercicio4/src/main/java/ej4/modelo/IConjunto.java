package ej4.modelo;

import java.util.Iterator;

import ej4.modelo.OperacionConjuntosException;

public interface IConjunto<T> {
    public void agrega(T elemento) throws OperacionConjuntosException;
    public void elimina(T elemento) throws OperacionConjuntosException;
    public int getCardinal();
    public Iterator<T> getIterator();
}
