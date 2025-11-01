package ej4;

import ej4.modelo.Biblioteca;
import ej4.modelo.Libro;
import ej4.modelo.Socio;

public class Main {
    public static void main(String[] args) {

        Libro l1 = new Libro(1, "La bella y la bestia");
        Libro l2 = new Libro(2, "Cenicienta");
        Libro l3 = new Libro(3, "Guerra de los mundos");
        Libro l4 = new Libro(4, "El lenguaje C");
        Libro l5 = new Libro(5, "Clean Arquitecture");

        Biblioteca b = new Biblioteca();
        b.agregarLibro(l5);
        b.agregarLibro(l1);
        b.agregarLibro(l2);
        b.agregarLibro(l3);
        b.agregarLibro(l4);

        Socio s1 = new Socio("Juan", b);
        Socio s2 = new Socio("Ramiro", b);
        Socio s3 = new Socio("Laura", b);
        Socio s4 = new Socio("Franco", b);
        Socio s5 = new Socio("Agustin", b);
        Socio s6 = new Socio("Marcelo", b);
        Socio s7 = new Socio("Ana", b);
        Socio s8 = new Socio("Anticitera", b);
        Socio s9 = new Socio("Julian", b);
        Socio sA = new Socio("Pedro", b);

        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();
        s6.start();
        s7.start();
        s8.start();
        s9.start();
        sA.start();


    }
}