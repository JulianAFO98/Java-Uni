package ej1.modelo;


public class Esmeralda extends Gema {

    @Override
    public void combinar(Gema g) {
        g.conEsmeralda();
    }

    @Override
    public void conZafiro() {
        System.out.println("Huracán");
    }

    @Override
    public void conDiamante() {
        System.out.println("Vientos venenosos");
    }

    @Override
    public void conRubi() {
        System.out.println("Terremoto");
    }

    @Override
    public void conEsmeralda() {
        System.out.println("Niebla desoladora");
    }
}

