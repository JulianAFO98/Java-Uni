package ej7.modelo;

public class Pasajero extends Thread{
    private int orillaPasajero;
    private Bote b;

    public Pasajero(String name, int orillaPasajero, Bote b) {
        super(name);
        this.orillaPasajero = orillaPasajero;
        this.b = b;
    }

    public int getOrillaPasajero() {
        return orillaPasajero;
    }

    @Override
    public void run() {
        try {
            b.subirPasajeroAlBote(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    
    
}
