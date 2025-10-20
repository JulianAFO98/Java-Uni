package ej4.modelo;

public interface IDespachador {
    void llenarCombustible(Combustible c) throws NoExisteCombustibleException;
    void extraerCombustible(Combustible c,double cantidad) throws FaltaCombustibleException,NoExisteCombustibleException;
    void agregarCombustible(Combustible c,double cantidad);
}
