package ej2.modelo;

public class CalculadoraEsperandoOP2State extends CalculadoraState{
      
    public CalculadoraEsperandoOP2State(Calculadora c){
        super(c);
    }
    
    
    @Override
    public void esperandoOP1() {

    }

    @Override
    public void apretaOperando() {
      
    }

    @Override
    public void esperandoOP2() {
       
    }

    @Override
    public void calcular() {
        c.setVal2(100);//harcodeado para el ejemplo
       if(c.getVal2() == 0){
           CalculadoraErrorDiv0State nuevoEstado = new CalculadoraErrorDiv0State(c);
           c.setEstado(nuevoEstado);
       }else {
           CalculadoraCalculandoState nuevoEstado = new CalculadoraCalculandoState(c);
           c.setEstado(nuevoEstado);
       }
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
        return "Calculadora esperando operando 2";
    }

}
