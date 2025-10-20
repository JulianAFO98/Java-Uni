package ej4.modelo;

public class DatoCargaInvalida {
    private String nombreCombustible;
    private double intentoCarga;
    public DatoCargaInvalida(String nombreCombustible, double intentoCarga) {
        this.nombreCombustible = nombreCombustible;
        this.intentoCarga = intentoCarga;
    }
    public String getNombreCombustible() {
        return nombreCombustible;
    }
    public double getIntentoCarga() {
        return intentoCarga;
    }
    
}
