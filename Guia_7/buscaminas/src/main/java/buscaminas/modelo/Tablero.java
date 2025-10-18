package buscaminas.modelo;

import java.util.Random;

import buscaminas.modelo.interfaces.ITablero;

public class Tablero implements ITablero {
    private Casilla[][] tablero;
    private int alto;
    private int ancho;
    private int cantidadMinas;

    public Tablero(int ancho, int alto, int cantidadMinas) throws ParametrosInvalidosException {
        setAlto(alto);
        setAncho(ancho);
        setCantidadMinas(cantidadMinas);
        this.tablero = new Casilla[this.alto][this.ancho];
        for (int i = 0; i < this.alto; i++) {
            for (int j = 0; j < this.ancho; j++) {
                this.tablero[i][j] = new Casilla(i, j, false, "");
            }
        }
        acomodarTablero();
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) throws ParametrosInvalidosException {
        if (ancho <= 0)
            throw new ParametrosInvalidosException("Se ingreso un ancho negativo");
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) throws ParametrosInvalidosException {
        if (alto <= 0)
            throw new ParametrosInvalidosException("Se ingreso un alto negativo");
        this.alto = alto;
    }

    public int getCantidadMinas() {
        return cantidadMinas;
    }

    public void setCantidadMinas(int cantidadMinas) throws ParametrosInvalidosException {
        if (cantidadMinas <= 0)
            throw new ParametrosInvalidosException("Se ingreso una cantidad de minas negativa");
        if (cantidadMinas >= this.alto * this.ancho)
            throw new ParametrosInvalidosException("No puede haber mas o igual cantidad de minas que casilleros!");
        this.cantidadMinas = cantidadMinas;
    }

    @Override
    public boolean isMina(int i, int j) {
        return tablero[i][j].isMina();
    }

    @Override
    public void activarCasillas(int i, int j) {
        int valorInicialI = Math.max(0, i - 1);
        int valorFinalI = Math.min(this.alto - 1, i + 1);
        int valorInicialJ = Math.max(0, j - 1);
        int valorFinalJ = Math.min(this.ancho - 1, j + 1);
        int cantMinas = 0;
        Casilla actual = tablero[i][j];
        if (!actual.isPisada() && !actual.isMina()) {
            cantMinas = getMinasCercanas(i, j);
            actual.setTexto(String.valueOf(cantMinas));
            actual.setPisada(true);
            if (cantMinas==0)
                for (int k = valorInicialI; k <= valorFinalI; k++) {
                    for (int k2 = valorInicialJ; k2 <= valorFinalJ; k2++) {
                        if (k != i || k2 != j)
                            activarCasillas(k, k2);
                    }
                }

        }
    }

    @Override
    public void buscarPosLibreSecuencial() {
        int i = 0;
        int j = 0;
        while (i < this.alto && tablero[i][j].isMina()) {
            while (j < this.ancho && tablero[i][j].isMina()) {
                j++;
            }
            j = 0;
            i++;
        }
        tablero[i][j].setMina();
    }

    @Override
    public void acomodarTablero() {
        Random random = new Random();
        int minasColocadas = this.cantidadMinas;
        int posCasillaI, posCasillaJ;
        while (minasColocadas > 0) {
            posCasillaI = random.nextInt(this.alto);
            posCasillaJ = random.nextInt(this.ancho);
            if (tablero[posCasillaI][posCasillaJ].isMina()) {
                buscarPosLibreSecuencial();
            } else {
                tablero[posCasillaI][posCasillaJ].setMina();
            }
            minasColocadas--;
        }
    }

    @Override
    public int getMinasCercanas(int i, int j) {
        int valorInicialI = Math.max(0, i - 1);
        int valorFinalI = Math.min(this.alto - 1, i + 1);
        int valorInicialJ = Math.max(0, j - 1);
        int valorFinalJ = Math.min(this.ancho - 1, j + 1);
        int sumaMinas = 0;
        for (int k = valorInicialI; k <= valorFinalI; k++) {
            for (int k2 = valorInicialJ; k2 <= valorFinalJ; k2++) {
                if (k != i  ||  k2 != j) {
                    if(tablero[k][k2].isMina())
                        sumaMinas++;
                }
            }
        }
        return sumaMinas;

    }

    public Casilla[][] getMatriz() {
        return tablero;
    }

}
