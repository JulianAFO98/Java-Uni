package Ej7;

public class Rubi extends Gema {

    @Override
    public void combinar(Gema g) {
        g.conRubi();
    }

    @Override
    public void conZafiro() {
        System.out.println("Erupción Volcánica");
    }

    @Override
    public void conDiamante() {
        System.out.println("Tormenta de rayos");
    }

    @Override
    public void conRubi() {
        System.out.println("Lluvia de fuego");
    }

    @Override
    public void conEsmeralda() {
        System.out.println("Terremoto");
    }
}

