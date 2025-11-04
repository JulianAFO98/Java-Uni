package ej7;

import ej7.modelo.Bote;
import ej7.modelo.Pasajero;
import ej7.modelo.Operario;


public class Main {
    public static void main(String[] args) {
        Bote b = new Bote(0, 3,2,6);
        Operario o = new Operario(b);
        Pasajero p1 = new Pasajero("Juan", 0, b);
        Pasajero p2 = new Pasajero("Marcos", 0, b);
        //Pasajero p3 = new Pasajero("Ramiro", 0, b);
        //Pasajero p7 = new Pasajero("Luna", 0, b);

        Pasajero p4 = new Pasajero("Ana", 1, b);
        Pasajero p5 = new Pasajero("Camilo", 1, b);
        Pasajero p6 = new Pasajero("Fernando", 1, b);
        Pasajero p8 = new Pasajero("Claudio", 1, b);
        Pasajero p9 = new Pasajero("Sofia", 1, b);
        Pasajero pa = new Pasajero("Nuria", 1, b);

        o.start();
        p1.start();
        p2.start();
        //p3.start();
        p4.start();
        p5.start();
        p6.start();
        //p7.start();
        p8.start();
        p9.start();
        pa.start();
        

    }
}