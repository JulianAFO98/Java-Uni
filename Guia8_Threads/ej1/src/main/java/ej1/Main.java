package ej1;

import ej1.modelo.Tren;
import ej1.modelo.Via;
import ej1.modelo.Via1;
import ej1.modelo.Via2;

public class Main {
    public static void main(String[] args) {
        Via via = new Via2();
        Tren tren1 = new Tren("Tren-1", 1, 1, via);
        Tren tren2 = new Tren("Tren-2", 2, 2, via);
        Tren tren3 = new Tren("Tren-3", 1, 3, via);
        Tren tren4 = new Tren("Tren-4", 2, 4, via);

        tren1.start();
        tren2.start();
        tren3.start();
        tren4.start();
      
    }
}