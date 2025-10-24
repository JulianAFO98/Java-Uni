package memotest.modelo;

import java.util.Random;

public class Tablero {
    private int alto;
    private int ancho;
    private Casilla[][] matriz;

    public Tablero(int alto, int ancho) throws ParametroInvalidoException {
        setAlto(alto);
        setAncho(ancho);
        if (alto * ancho % 2 != 0)
            throw new ParametroInvalidoException("La cantidad de casilleros no puede ser impar!");
        this.matriz = new Casilla[alto][ancho];
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                this.matriz[i][j] = new Casilla(i, j, 0);
            }
        }
        llenarMatriz();
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) throws ParametroInvalidoException {
        if (alto < 0)
            throw new ParametroInvalidoException("El valor de altura no puede ser negativo o cero");
        this.alto = alto;
    }

    public int getAncho() {

        return ancho;
    }

    public void setAncho(int ancho) throws ParametroInvalidoException {
        if (ancho < 0)
            throw new ParametroInvalidoException("El valor de ancho no puede ser negativo o cero");
        this.ancho = ancho;
    }

    public Casilla[][] getMatriz() {
        return matriz;
    }

    private void llenarMatriz() {
        int cantidadElementos = ancho * alto;
        int[] elementos = new int[cantidadElementos];
        int valor = 0;
        for (int i = 0; i < cantidadElementos; i += 2) {
            elementos[i] = valor;
            elementos[i + 1] = valor;
            valor++;
        }
        fisherYatesShuffle(elementos);

        int k = 0;
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                matriz[i][j].setNumeroConjunto(elementos[k]);
                k++;
            }
        }

    }

    private void fisherYatesShuffle(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

}
