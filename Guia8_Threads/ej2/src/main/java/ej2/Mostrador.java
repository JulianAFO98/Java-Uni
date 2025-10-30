package ej2;


public class Mostrador {
    private int cantClientesTotal; // Cantidad total de clientes
    private int proximoNumeroAtender = 1; // El turno siempre empieza en 1
    private boolean atendiendo = false; // Indica si hay alguien siendo atendido

    public Mostrador(int cantClientesTotal) {
        this.cantClientesTotal = cantClientesTotal;
    }

    public synchronized void atenderCliente(Cliente cliente) throws InterruptedException {
        int numCliente = cliente.getNumeroCliente();

        while (atendiendo || numCliente != this.proximoNumeroAtender) {
            wait();
        }

        this.atendiendo = true;
        System.out.println(cliente.getName() + " (Turno " + numCliente + ") está siendo atendido.");
    }

    public synchronized void despacharCliente(Cliente cliente) {
        System.out.println(cliente.getName() + " fue atendido y vuelve a la cola de espera.");

        this.proximoNumeroAtender = (cliente.getNumeroCliente() % this.cantClientesTotal) + 1;
        this.atendiendo = false; 

        notifyAll(); 
    }
}
