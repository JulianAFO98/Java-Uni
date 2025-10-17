package buscaminas.vista;

import javax.swing.JButton;

import buscaminas.modelo.interfaces.ICasilla;

public class JButtonCasilla extends JButton implements ICasilla {
    private int i;
    private int j;
    private String texto;

    public JButtonCasilla(int i, int j, String texto) {
        super(texto);
        this.i = i;
        this.j = j;
        this.texto = texto; // sincronizar campo interno con el texto inicial
    }

    @Override
    public void setTexto(String text) {
        this.texto = text;
        setText(text); // delegar y mantener ambos sincronizados
    }

    @Override
    public void setText(String text) {
        super.setText(text);
        this.texto = text;
    }

    @Override
    public String getText() {
        return super.getText(); 
    }

    @Override
    public int getI() {
        return i;
    }

    @Override
    public int getJ() {
       return j;
    }

    

}
