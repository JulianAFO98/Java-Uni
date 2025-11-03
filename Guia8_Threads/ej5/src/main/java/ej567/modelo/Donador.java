package ej567.modelo;

public class Donador extends Thread {
    private Libro libADonar;
    private Biblioteca b;

    public Donador(String name, Libro libADonar, Biblioteca b) {
        super(name);
        this.libADonar = libADonar;
        this.b = b;
    }

    @Override
    public void run() {
        try {
            b.donarLibro(libADonar,this);
        } catch (Exception e) {
        }
    }

    public Libro getLibADonar() {
        return libADonar;
    }

    public void setLibADonar(Libro libADonar) {
        this.libADonar = libADonar;
    }

    public Biblioteca getB() {
        return b;
    }

    public void setB(Biblioteca b) {
        this.b = b;
    }

}
