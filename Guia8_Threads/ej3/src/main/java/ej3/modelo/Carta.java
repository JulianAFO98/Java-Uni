package ej3.modelo;

public class Carta {
    private final int valor;

    public Carta(int valor) {
        if (valor < 1 || valor > 10) {
            throw new IllegalArgumentException("El valor de la carta debe estar entre 1 y 10.");
        }
        this.valor = valor;
    }

    
    public int getValor() {
        return valor;
    }

    
    @Override
    public String toString() {
        return "Carta de " + valor + " puntos";
    }
}
