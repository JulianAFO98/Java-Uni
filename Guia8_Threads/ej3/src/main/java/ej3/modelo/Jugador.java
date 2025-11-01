package ej3.modelo;

public class Jugador extends Thread {
    private final int id; // Identificador del 0 a N-1
    private int puntosMano;
    private int manosGanadas;
    private Juego j;


    public Jugador(int id) {
        this.id = id;
        this.puntosMano = 0;
        this.manosGanadas = 0;
        this.setName("Jugador-" + id);
    }

    

    public void setJ(Juego j) {
        this.j = j;
    }



    public int getJugadorId() {
        return id;
    }

    public int getPuntosMano() {
        return puntosMano;
    }
    
    public int getManosGanadas() {
        return manosGanadas;
    }

    public void incrementarManosGanadas() {
        this.manosGanadas++;
    }

    public void resetPuntos() {
        this.puntosMano = 0;
    }

    


    public void setPuntosMano(int puntosMano) {
        this.puntosMano = puntosMano;
    }



    @Override
    public void run() {
        int puntos = 0;
        while(!j.terminoElJuego()){
            while(puntos<15){
                try {
                    puntos += j.sacarCartas(this).getValor();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(puntos);
            this.puntosMano = puntos;
            puntos = 0;
            j.terminoSacarCartas(this);
        }
    }



    public void setManosGanadas(int manosGanadas) {
        this.manosGanadas = manosGanadas;
    }

    
}