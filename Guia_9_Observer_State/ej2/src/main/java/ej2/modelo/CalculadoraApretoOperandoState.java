package ej2.modelo;

public class CalculadoraApretoOperandoState extends CalculadoraState{
    public CalculadoraApretoOperandoState(Calculadora c) {
        super(c);
    }
    
    
    @Override
    public void esperandoOP1() {

    }

    @Override
    public void apretaOperando() {
       c.setVal1(600);// harcodeado para el ejemplo
       CalculadoraEsperandoOP2State nuevoEstado = new CalculadoraEsperandoOP2State(c);
       c.setEstado(nuevoEstado);
    }

    @Override
    public void esperandoOP2() {
       
    }

    @Override
    public void calcular() {
       
    }

    @Override
    public void errorDiv0() {
        
    }

    @Override
    public void apretaCE() {
        CalculadoraEsperandoOP1State nuevoEstado = new CalculadoraEsperandoOP1State(c);
       c.setEstado(nuevoEstado);
    }


    @Override
    public String toString() {
        return "Calculadora apreto un operador";
    }

}
