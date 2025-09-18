package Ej7;

public abstract class Infusion {
    // Template Method
    public  void prepararInfusion() {
        calentarAgua();
        agregarTipoInfusion(); // hook
        endulzar(); // hook
        tomarBebida();
    }

    private void calentarAgua() {
        System.out.println("Calentando el agua");
    }

    protected abstract void agregarTipoInfusion();   
    

    protected abstract void endulzar();

    private void tomarBebida() {
        System.out.println("Tomando bebida");
    }
}
