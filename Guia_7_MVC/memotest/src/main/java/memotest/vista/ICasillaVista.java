package memotest.vista;

import javax.swing.ImageIcon;

import memotest.modelo.interfaces.ICasilla;

public interface ICasillaVista extends ICasilla{
    ImageIcon getImagen();
    void setVisibleIcono(boolean visible);
    boolean getVisible();
}
