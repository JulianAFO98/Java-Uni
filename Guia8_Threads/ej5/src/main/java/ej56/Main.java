package ej56;

import ej56.modelo.Biblioteca;
import ej56.modelo.Donador;
import ej56.modelo.Libro;
import ej56.modelo.Revista;
import ej56.modelo.SocioLibro;
import ej56.modelo.SocioRevista;

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
        Revista r1 = new Revista(1,"Billiken");
        Revista r2 = new Revista(2,"MAD");
        Revista r3 = new Revista(3,"Papparazzi");
        Revista r4 = new Revista(4,"Articulos cientificos 1");
        Revista r5 = new Revista(5,"Articulos cientificos 2");



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
        
        b.agregarRevista(r5);
        b.agregarRevista(r1);
        b.agregarRevista(r2);
        b.agregarRevista(r3);
        b.agregarRevista(r4);


        SocioLibro s1 = new SocioLibro("Juan", b);
        SocioLibro s2 = new SocioLibro("Ramiro", b);
        SocioLibro s3 = new SocioLibro("Laura", b);
        SocioLibro s4 = new SocioLibro("Franco", b);
        SocioLibro s5 = new SocioLibro("Agustin", b);
        SocioLibro s6 = new SocioLibro("Marcelo", b);
        SocioLibro s7 = new SocioLibro("Ana", b);
        SocioLibro s8 = new SocioLibro("Anticitera", b);
        SocioLibro s9 = new SocioLibro("Julian", b);
        SocioLibro sA = new SocioLibro("Pedro", b);

        Donador d1 = new Donador("Marcos", l6, b);
        Donador d2 = new Donador("Felipe", l7, b);
        Donador d3 = new Donador("Federico", l8, b);
        Donador d4 = new Donador("Alejo", l9, b);
        Donador d5 = new Donador("Maylen", la, b);
        
        SocioRevista sr1 = new SocioRevista("Marcos", b);
        SocioRevista sr2 = new SocioRevista("Antonio", b);
        SocioRevista sr3 = new SocioRevista("Maria", b);
        SocioRevista sr4 = new SocioRevista("Ciri", b);
        SocioRevista sr5 = new SocioRevista("Pablo", b);

        d1.start();
        d2.start();
        d3.start();
        d4.start();
        d5.start();

        sr1.start();
        sr2.start();
        sr3.start();
        sr4.start();
        sr5.start();

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