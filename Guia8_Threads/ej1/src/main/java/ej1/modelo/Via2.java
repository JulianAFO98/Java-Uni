package ej1.modelo;

public class Via2 extends Via{
    protected int direccionAnterior = 0;

    @Override
    public synchronized void entrar(Tren tren) throws InterruptedException {
        while (this.ocupada  || tren.getDireccion() == this.direccionAnterior) {
            wait(); // El tren espera si la via esta ocupada
        }
        this.ocupada = true;
        System.out.println("Tren " + tren.getName() + " esta entrando a la via");
    }

    @Override
    public synchronized void salir(Tren tren) {
        this.ocupada = false;
        this.direccionAnterior = tren.getDireccion();
        System.out.println("Tren " + tren.getName() + " esta saliendo de la via");
        notifyAll(); // Notifica a los trenes que estan esperando
    }


}
