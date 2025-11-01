package ej4.modelo;

import java.util.HashMap;

public class Biblioteca {
    private HashMap<Integer,Libro> libros = new HashMap<>();

    public synchronized Libro retirarLibro(int i,Socio s) throws InterruptedException {
        while(!libros.containsKey(i))
            wait();
        Libro lib = libros.remove(i);
        System.out.println(s.getName()+" retiro el libro: "+i);
        return lib;
    }

    public synchronized void devolverLibro(Libro lib,Socio s) {
        libros.put(lib.getIdLibro(), lib);
        System.out.println(s.getName()+" devolvio el libro: "+lib.getIdLibro());
        notifyAll();
    }

    public void agregarLibro(Libro l){
        libros.put(l.getIdLibro(), l);
    }


}
