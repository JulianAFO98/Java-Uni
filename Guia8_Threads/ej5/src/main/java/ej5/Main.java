package ej5;

import ej5.modelo.Biblioteca;
import ej5.modelo.Donador;
import ej5.modelo.Libro;
import ej5.modelo.Socio;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro(1, "La bella y la bestia");
        Libro l2 = new Libro(2, "Cenicienta");
        Libro l3 = new Libro(3, "Guerra de los mundos");
        Libro l4 = new Libro(4, "El lenguaje C");
        Libro lf = new Libro(5, "C++ for everyone");
        Libro l5 = new Libro(6, "Clean Arquitecture");
        Libro l6 = new Libro(7, "Tarzan");
        Libro l7 = new Libro(8, "El libro de la jungla");
        Libro l8 = new Libro(9, "Software arquitecture");
        Libro l9 = new Libro(10, "Java for beginners");
        Libro la = new Libro(11, "Python for IA");
        Libro lb = new Libro(12, "Neural networks");
        Libro lc = new Libro(13, "Clean code");
        Libro ld = new Libro(0xe, "Javascript 101");
        Libro le = new Libro(0xf, "C# Guide");

        Biblioteca b = new Biblioteca();
        b.agregarLibro(l5);
        b.agregarLibro(l1);
        b.agregarLibro(l2);
        b.agregarLibro(l3);
        b.agregarLibro(l4);
        b.agregarLibro(lb);
        b.agregarLibro(lc);
        b.agregarLibro(ld);
        b.agregarLibro(le);
        b.agregarLibro(lf);
        
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

        Donador d1 = new Donador("Marcos", l6, b);
        Donador d2 = new Donador("Felipe", l7, b);
        Donador d3 = new Donador("Federico", l8, b);
        Donador d4 = new Donador("Alejo", l9, b);
        Donador d5 = new Donador("Maylen", la, b);
        


        d1.start();
        d2.start();
        d3.start();
        d4.start();
        d5.start();

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