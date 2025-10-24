package ej2.modelo;

public class CalculadoraEsperandoOP1State extends CalculadoraState {

    
    public CalculadoraEsperandoOP1State(Calculadora c){
        super(c);
    }
    
    
    @Override
    public void esperandoOP1() {

    }

    @Override
    public void apretaOperando() {
       c.setVal1(300);//harcodeado para el ejemplo
       CalculadoraApretoOperandoState nuevoEstado = new CalculadoraApretoOperandoState(c);
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
        return "Calculadora esperando operando 1";
    }

    

}
