package Ej7;

public class Diamante extends Gema {

    @Override
    public void combinar(Gema g) {
        g.conDiamante();
    }

    @Override
    public void conZafiro() {
        System.out.println("Granizo Asesino");
    }

    @Override
    public void conDiamante() {
        System.out.println("Congelamiento");
    }

    @Override
    public void conRubi() {
        System.out.println("Tormenta de Rayos");
    }

    @Override
    public void conEsmeralda() {
        System.out.println("Vientos venenosos");
    }
}
