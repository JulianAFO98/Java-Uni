package ej4.modelo;

public class FaltaCombustibleException extends Exception{
    private DatoCargaInvalida dato;
    public FaltaCombustibleException(String msg,DatoCargaInvalida d){
        super(msg);
        this.dato = d;
    }
    public DatoCargaInvalida getDato() {
        return dato;
    }

    
}
