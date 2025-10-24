package ej2.modelo;

public class CalculadoraCalculandoState extends CalculadoraState{
     public CalculadoraCalculandoState(Calculadora c){
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
       System.out.println(c.getVal1()+c.getVal2());// harcodeado para el ejemplo
       CalculadoraCalculandoState nuevoEstado = new CalculadoraCalculandoState(c);
       c.setEstado(nuevoEstado);
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
        return "Calculadora haciendo calculos";
    }

}
