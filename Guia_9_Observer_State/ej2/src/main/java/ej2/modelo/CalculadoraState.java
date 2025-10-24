package ej2.modelo;

public abstract class CalculadoraState {
    protected Calculadora c;

    public CalculadoraState(Calculadora c) {
        this.c = c;
    }

    public abstract void esperandoOP1();

    public abstract void apretaOperando();

    public abstract void esperandoOP2();

    public abstract void calcular();

    public abstract void errorDiv0();

    public abstract void apretaCE();
}
