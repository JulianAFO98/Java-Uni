package ej1;

import java.util.ArrayList;
import java.util.Observer;
import ej1.modelo.ObservadorConsola;
import ej1.modelo.ObservadorVentana;
import ej1.modelo.Tamagochi;
import ej1.vista.Ventana;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Tamagochi tama1 = new Tamagochi("Pepe");
        Tamagochi tama2 = new Tamagochi("Pipi");
        Tamagochi tama3 = new Tamagochi("Papa");
        Tamagochi tama4 = new Tamagochi("Pipa");

        ArrayList<Tamagochi> tamas = new ArrayList<>();
        tamas.add(tama1);
        tamas.add(tama2);
        tamas.add(tama3);
        tamas.add(tama4);

        Observer observadorConsola = new ObservadorConsola(tamas);

        EventQueue.invokeLater(() -> {
            Ventana v = new Ventana();
            new ObservadorVentana(tamas, v);
        });
        
        Thread t1 = new Thread(tama1);
        Thread t2 = new Thread(tama2);
        Thread t3 = new Thread(tama3);
        Thread t4 = new Thread(tama4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}