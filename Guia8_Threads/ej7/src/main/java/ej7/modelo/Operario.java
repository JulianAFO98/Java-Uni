package ej7.modelo;

public class Operario extends Thread {
    private Bote bote;

    public Operario(Bote bote) {
        this.bote = bote;
    }

    @Override
    public void run() {
        try {
            while (bote.seguirOperando()) {
                Thread.sleep(5000); // cada 5 segundos
                bote.verificarYZarpar();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}