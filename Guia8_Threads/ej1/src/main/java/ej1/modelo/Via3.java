package ej1.modelo;

public class Via3 extends Via{
    private int currentDirection = 0; // 0 = libre, 1 o 2
    private int activeCount = 0;
    private int waitingDir1 = 0;
    private int waitingDir2 = 0;

     @Override
    public synchronized void entrar(Tren tren) throws InterruptedException {
        int dir = tren.getDireccion();
        // Si la vía está vacía, el tren puede tomarla y fijar la dirección actual.
        // Si no está vacía, sólo pueden entrar trenes de la misma dirección.
        if (activeCount == 0) {
            // fijar la dirección antes de entrar
            currentDirection = dir;
        }
        // Si la dirección actual no coincide con la del tren, espera
        if (dir == 1) waitingDir1++; else waitingDir2++;
        try {
            while (activeCount > 0 && currentDirection != dir) {
                wait();
            }
            // ahora puede entrar
            activeCount++;
            System.out.println("Tren " + tren.getName() + " está entrando a la vía (dir " + dir + "). Activos: " + activeCount);
        } finally {
            if (dir == 1) waitingDir1--; else waitingDir2--;
        }
    }

    @Override
    public synchronized void salir(Tren tren) {
        int dir = tren.getDireccion();
        activeCount--;
        System.out.println("Tren " + tren.getName() + " está saliendo de la vía (dir " + dir + "). Activos: " + activeCount);
        if (activeCount == 0) {
            // decidir la próxima dirección: si hay trenes esperando en la dirección opuesta, cambiar
            int opposite = (dir == 1) ? 2 : 1;
            if ((opposite == 1 && waitingDir1 > 0) || (opposite == 2 && waitingDir2 > 0)) {
                currentDirection = opposite;
            } else if ((dir == 1 && waitingDir1 > 0) || (dir == 2 && waitingDir2 > 0)) {
                currentDirection = dir;
            } else {
                currentDirection = 0; // libre
            }
            notifyAll();
        }
    }
}
