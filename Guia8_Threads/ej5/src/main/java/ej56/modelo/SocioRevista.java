package ej56.modelo;

import java.util.Random;

public class SocioRevista extends Thread{

    Biblioteca b;

    

    public SocioRevista(String name, Biblioteca b) {
        super(name);
        this.b = b;
    }



    @Override
    public void run() {
        Random r = new Random();
        //cada alumno quiere retirar 2 libros
        for (int i = 0; i < 2; i++) {
            try {
                Revista rev = b.retirarRevista(r.nextInt(5) + 1,this);
                Thread.sleep(r.nextInt(3) * 2000);
                b.devolverRevista(rev,this);
                Thread.sleep(r.nextInt(3)*2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    
}
