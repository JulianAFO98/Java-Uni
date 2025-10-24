package ej1.modelo;

import java.util.Observable;
import java.util.Random;

public class Tamagochi extends Observable implements Runnable {
    private String nombre;

    public Tamagochi(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        Random r = new Random();
        int cont = 0;
        while (cont < 3) {
            int tiempoMuerto = 3000 + r.nextInt(7000);
            int atencion = r.nextInt(5);

            try {
                Thread.sleep(tiempoMuerto);
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido: " + Thread.currentThread().getName());
            }

            EstadoTamagochi estado = null;
            if (atencion == 0) {
                estado = EstadoTamagochi.SUENIO;
            } else if (atencion == 1)
                estado = EstadoTamagochi.ABURRIDO;
            else if (atencion == 2)
                estado = EstadoTamagochi.ENOJADO;
            else if (atencion == 3)
                estado = EstadoTamagochi.JUGAR;
            else if (atencion == 4)
                estado = EstadoTamagochi.HAMBRE;
            setChanged();
            notifyObservers(estado);
            cont++;
        }
    }

    @Override
    public String toString() {
        return "Tamagochi: "+ this.nombre;
    }

    


}
