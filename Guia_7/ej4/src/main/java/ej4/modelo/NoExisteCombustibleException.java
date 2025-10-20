package ej4.modelo;

public class NoExisteCombustibleException extends Exception{
    private String nombreCombustible;

    public NoExisteCombustibleException(String message, String nombreCombustible) {
        super(message);
        this.nombreCombustible = nombreCombustible;
    }

    public String getNombreCombustible() {
        return nombreCombustible;
    }
    
}
