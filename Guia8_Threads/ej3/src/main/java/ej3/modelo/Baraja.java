
package ej3.modelo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
    private final List<Carta> cartas;

    public Baraja() {
        this.cartas = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < 4; j++) {
                cartas.add(new Carta(i));
            }
        }
        for (int i = 0; i < 16; i++) {
            cartas.add(new Carta(10));
        }
        Collections.shuffle(cartas);
    }

  
    public synchronized Carta robarCarta() {
        if (cartas.isEmpty()) {
            return null;
        }
        return cartas.remove(0);
    }

    public synchronized boolean estaVacia() {
        return cartas.isEmpty();
    }
    
    public synchronized boolean tieneSuficientesCartas(int numMinimo) {
        return cartas.size() >= numMinimo;
    }
}