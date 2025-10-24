package buscaminas.modelo.interfaces;

import buscaminas.modelo.ParametrosInvalidosException;

public interface ITablero {
    public void activarCasillas(int i,int j);

    public int getAncho();

    public int getMinasCercanas(int i, int j);

    public boolean isMina(int i, int j);

    public void setAncho(int ancho) throws ParametrosInvalidosException;

    public int getAlto();

    public void setAlto(int alto) throws ParametrosInvalidosException;

    public int getCantidadMinas();

    public void setCantidadMinas(int cantidadMinas) throws ParametrosInvalidosException;
    public void acomodarTablero();
    public void buscarPosLibreSecuencial();
}
