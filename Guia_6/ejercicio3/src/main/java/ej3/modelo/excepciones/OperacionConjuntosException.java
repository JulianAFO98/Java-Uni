package ej3.modelo.excepciones;

public class OperacionConjuntosException extends Exception{
    private Object elemento;

    public OperacionConjuntosException(String msg,Object elemento) {
        super(msg);
        this.elemento = elemento;
    }

    public Object getElemento() {
        return elemento;
    }

    
}
