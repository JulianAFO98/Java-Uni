package ej1.modelo;

public class Tren extends Thread {
    private int direccion;
    private int numeroTren;
    private Via via;
    
    public Tren(String name, int direccion, int numeroTren, Via via) {
        super(name);
        this.direccion = direccion;
        this.numeroTren = numeroTren;
        this.via = via;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public int getNumeroTren() {
        return numeroTren;
    }

    public void setNumeroTren(int numeroTren) {
        this.numeroTren = numeroTren;
    }

    @Override
    public void run() {
        try {
            // Simulamos que el tren se aproxima a la via
            System.out.println("Tren " + getName() + " se aproxima a la via");
            Thread.sleep((long)(Math.random() * 1000));
            
            // El tren intenta entrar a la via
            via.entrar(this);
            
            // El tren está usando la via
            System.out.println("Tren " + getName() + " está usando la via");
            Thread.sleep((long)(Math.random() * 2000));
            
            // El tren sale de la via
            via.salir(this);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
