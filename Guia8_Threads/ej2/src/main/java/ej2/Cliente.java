package ej2;

import java.util.Random;

public class Cliente extends Thread{

    protected int numeroCliente;
    protected int cantRep;
    protected Mostrador m;
    public Cliente(String name, int numeroCliente, int cantRep,Mostrador m) {
        super(name);
        this.numeroCliente = numeroCliente;
        this.cantRep = cantRep;
        this.m = m;
    }

    @Override
    public void run() {
        Random r = new Random();
        try {
            System.out.println(this.getName()+" se acerca al mostrador");
            for (int i = 0; i < this.cantRep; i++) {
                this.m.atenderCliente(this);
                Thread.sleep(r.nextInt(3) * 1000);
                this.m.despacharCliente(this);
            }
            System.out.println(this.getName()+" se va del local");
        } catch (Exception e) {
        }
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public int getCantRep() {
        return cantRep;
    }

    public void setCantRep(int cantRep) {
        this.cantRep = cantRep;
    }
    

    
    
}
