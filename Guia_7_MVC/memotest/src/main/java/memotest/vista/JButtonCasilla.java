package memotest.vista;

import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JButtonCasilla extends JButton implements ICasillaVista{
    private int i;
    private int j;
    private int numeroConjunto;
    private boolean visible;
    private boolean pisado;
    private ImageIcon img;
    
    public JButtonCasilla(int i, int j,int numeroConjunto, String rutaImagen,int tamanioImg,boolean visible) {
        this.i = i;
        this.j = j;
        this.numeroConjunto = numeroConjunto;
        this.pisado = false;
        this.visible = visible;
        setFocusPainted(false);
        setMargin(new Insets(0, 0, 0, 0));

        if (rutaImagen != null && !rutaImagen.isEmpty()) {
            setImagen(rutaImagen, tamanioImg);
        }
    }

    public void setImagen(String ruta, int tamano) {
        ImageIcon icon = new ImageIcon(ruta);
        Image i = icon.getImage().getScaledInstance(tamano, tamano, Image.SCALE_SMOOTH);
        this.img = new ImageIcon(i);
        if(this.visible)
            this.setIcon(this.img); 
        else 
            this.setIcon(null);
    }

    public ImageIcon getImagen() {
        return this.img;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    @Override
    public int getNumeroConjunto() {
      return this.numeroConjunto;
    }

    public void setVisibleIcono(boolean visible) {
        this.visible = visible;
        this.setIcon(visible ? this.img : null);
    }

    @Override
    public boolean getVisible() {
        return this.visible;
    }

    @Override
    public void setPisado() {
        this.pisado=!this.pisado;
    }

    @Override
    public boolean isPisado() {
        return this.pisado;
    }

    
}
