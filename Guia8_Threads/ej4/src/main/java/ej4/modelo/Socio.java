package ej4.modelo;

import java.util.Random;

public class Socio extends Thread{

    Biblioteca b;

    

    public Socio(String name, Biblioteca b) {
        super(name);
        this.b = b;
    }



    @Override
    public void run() {
        Random r = new Random();
        //cada alumno quiere retirar 2 libros
        for (int i = 0; i < 2; i++) {
            try {
                Libro lib = b.retirarLibro(r.nextInt(5) + 1,this);
                Thread.sleep(r.nextInt(3) * 2000);
                b.devolverLibro(lib,this);
                Thread.sleep(r.nextInt(3)*2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    
}
