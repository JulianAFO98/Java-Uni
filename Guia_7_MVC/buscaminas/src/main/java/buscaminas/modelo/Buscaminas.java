package buscaminas.modelo;

import buscaminas.modelo.interfaces.IBuscaminas;

public class Buscaminas implements IBuscaminas{
        Tablero t;

        public Buscaminas(int alto,int ancho,int cantidadMinas)throws ParametrosInvalidosException{
                this.t = new Tablero(ancho, alto, cantidadMinas);
        }

        public Tablero getT() {
                return t;
        }

        public void setT(Tablero t) {
                this.t = t;
        }
        
        
    
}



