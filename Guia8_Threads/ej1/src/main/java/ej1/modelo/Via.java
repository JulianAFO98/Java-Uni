package ej1.modelo;

public abstract class Via {
    protected boolean ocupada = false;

    public abstract void entrar(Tren tren) throws InterruptedException;
    public abstract void salir(Tren tren);
}
