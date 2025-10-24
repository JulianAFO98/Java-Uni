package memotest.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import memotest.modelo.Memotest;
import memotest.modelo.Tablero;
import memotest.vista.ICasillaVista;
import memotest.vista.IVista;

public class MemoController implements ActionListener {

    private IVista vista;
    private Memotest memo;
    private ICasillaVista primeraSeleccion = null;
    private ICasillaVista segundaSeleccion = null;

    public MemoController(IVista vista) {
        this.vista = vista;
        this.vista.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.equalsIgnoreCase("empezar")) {
            try {
                Tablero t = new Tablero(this.vista.getAlto(), this.vista.getAncho());
                this.memo = new Memotest(t, this.vista.getJugadores());
                empezarJuego();
            } catch (Exception exception) {
                this.vista.mostrarMensaje("Ancho o alto negativos, o cantidad de casillas impar");
            }
        } else if (comando.equalsIgnoreCase("apretoCasilla")) {
            ICasillaVista cv = (ICasillaVista) e.getSource();
            if (!cv.getVisible()) {
                // Mostrar imagen
                cv.setVisibleIcono(true);
                if (primeraSeleccion == null) {
                    primeraSeleccion = cv;
                } else if (segundaSeleccion == null) {
                    segundaSeleccion = cv;
                    comprobarPareja();
                }

            }

        }
    }

    private void comprobarPareja() {
    if (primeraSeleccion.getNumeroConjunto() == segundaSeleccion.getNumeroConjunto()) {
        this.memo.getT().getMatriz()[primeraSeleccion.getI()][primeraSeleccion.getJ()].setPisado();
        this.memo.getT().getMatriz()[segundaSeleccion.getI()][segundaSeleccion.getJ()].setPisado();
        this.vista.redibujarConPuntuaciones(this.memo.getJugadores(), this.memo.getT(), this);
        primeraSeleccion = null;
        segundaSeleccion = null;
    } else {
        Timer timer = new Timer(800, e -> {
            primeraSeleccion.setVisibleIcono(false);
            segundaSeleccion.setVisibleIcono(false);
            primeraSeleccion = null;
            segundaSeleccion = null;
        });
        timer.setRepeats(false);
        timer.start();
    }
    }

    private void empezarJuego() {
        this.vista.empezarJuego(this.memo.getJugadores(), this.memo.getT(), this);
    }

}
