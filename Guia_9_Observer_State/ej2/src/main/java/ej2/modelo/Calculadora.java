package ej2.modelo;

public class Calculadora {
    private CalculadoraState estado;
    private int val1;
    private int val2;
    
    public Calculadora(CalculadoraState estado) {
        this.estado = estado;
    }

    public void setEstado(CalculadoraState estado) {
        this.estado = estado;
    }

    public int getVal1() {
        return val1;
    }

    public int getVal2() {
        return val2;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }
    
    public CalculadoraState getEstado() {
        return estado;
    }
    
    

}
