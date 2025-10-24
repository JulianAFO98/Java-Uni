package memotest.vista;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import memotest.modelo.Tablero;
import memotest.modelo.interfaces.IJugador;

public class Ventana extends JFrame implements IVista, KeyListener {

    private JPanel panelPrincipal;
    private JPanel panelEntradas;
    private JPanel panelJugadores;
    private JPanel envoltorioTextoCampoI;
    private JLabel textoCampoI;
    private JPanel envoltorioTextoCampoJ;
    private JLabel textoCampoJ;
    private JPanel envoltorioInputCampoI;
    private JTextField inputCampoI;
    private JPanel envoltorioInputCampoJ;
    private JTextField inputCampoJ;
    private JPanel envoltorioBtnEmpezar;
    private JButton btnEmpezar;
    private JButtonCasilla btnCasilla;
    private JPanel panelTablero;
    private JLabel textoJugador1;
    private JTextField inputJugador1;
    private JPanel envoltorioTextoJugador1;
    private JPanel envoltorioInputJugador1;
    private JLabel textoJugador2;
    private JTextField inputJugador2;
    private JPanel envoltorioTextoJugador2;
    private JPanel envoltorioInputJugador2;
    private JLabel textoJugador3;
    private JTextField inputJugador3;
    private JPanel envoltorioTextoJugador3;
    private JPanel envoltorioInputJugador3;

    public Ventana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(700, 300, 200, 400);
        this.panelPrincipal = new JPanel();
        this.panelPrincipal.setPreferredSize(new Dimension(200, 400));
        this.panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panelPrincipal);
        this.panelPrincipal.setLayout(new CardLayout());

        this.panelEntradas = new JPanel();
        this.panelEntradas.setPreferredSize(new Dimension(200, 400));
        this.panelPrincipal.add(this.panelEntradas, "entradas");
        this.panelEntradas.setLayout(new GridLayout(0, 1, 0, 0));

        this.inputCampoI = new JTextField();
        this.inputCampoI.setColumns(10);
        this.inputCampoJ = new JTextField();
        this.inputCampoJ.setColumns(10);
        this.inputJugador1 = new JTextField();
        this.inputJugador1.setColumns(10);
        this.inputJugador2 = new JTextField();
        this.inputJugador2.setColumns(10);
        this.inputJugador3 = new JTextField();
        this.inputJugador3.setColumns(10);

        this.inputCampoI.addKeyListener(this);
        this.inputCampoJ.addKeyListener(this);
        this.inputJugador1.addKeyListener(this);
        this.inputJugador2.addKeyListener(this);
        this.inputJugador3.addKeyListener(this);

        this.textoCampoI = new JLabel("Ingrese alto");
        this.textoCampoJ = new JLabel("Ingrese ancho");
        this.textoJugador1 = new JLabel("Nombre jugador 1:");
        this.textoJugador2 = new JLabel("Nombre jugador 2:");
        this.textoJugador3 = new JLabel("Nombre jugador 3:");

        this.envoltorioInputCampoI = new JPanel();
        this.envoltorioInputCampoI.add(this.inputCampoI);
        this.envoltorioInputCampoJ = new JPanel();
        this.envoltorioInputCampoJ.add(this.inputCampoJ);
        this.envoltorioInputJugador1 = new JPanel();
        this.envoltorioInputJugador1.add(this.inputJugador1);
        this.envoltorioInputJugador2 = new JPanel();
        this.envoltorioInputJugador2.add(this.inputJugador2);
        this.envoltorioInputJugador3 = new JPanel();
        this.envoltorioInputJugador3.add(this.inputJugador3);

        this.envoltorioTextoCampoI = new JPanel();
        this.envoltorioTextoCampoI.add(this.textoCampoI);
        this.envoltorioTextoCampoJ = new JPanel();
        this.envoltorioTextoCampoJ.add(this.textoCampoJ);
        this.envoltorioTextoJugador1 = new JPanel();
        this.envoltorioTextoJugador1.add(this.textoJugador1);
        this.envoltorioTextoJugador2 = new JPanel();
        this.envoltorioTextoJugador2.add(this.textoJugador2);
        this.envoltorioTextoJugador3 = new JPanel();
        this.envoltorioTextoJugador3.add(this.textoJugador3);

        this.btnEmpezar = new JButton("Empezar");
        this.btnEmpezar.setEnabled(false);
        this.btnEmpezar.setActionCommand("empezar");
        this.envoltorioBtnEmpezar = new JPanel();
        this.envoltorioBtnEmpezar.add(this.btnEmpezar);

        this.panelEntradas.add(this.envoltorioTextoCampoI);
        this.panelEntradas.add(this.envoltorioInputCampoI);
        this.panelEntradas.add(this.envoltorioTextoCampoJ);
        this.panelEntradas.add(this.envoltorioInputCampoJ);
        this.panelEntradas.add(this.envoltorioTextoJugador1);
        this.panelEntradas.add(this.envoltorioInputJugador1);
        this.panelEntradas.add(this.envoltorioTextoJugador2);
        this.panelEntradas.add(this.envoltorioInputJugador2);
        this.panelEntradas.add(this.envoltorioTextoJugador3);
        this.panelEntradas.add(this.envoltorioInputJugador3);

        this.panelEntradas.add(this.envoltorioBtnEmpezar);

        JPanel panelTableroCard = new JPanel(new BorderLayout());
        this.panelPrincipal.add(panelTableroCard, "tablero");

        panelJugadores = new JPanel();
        panelJugadores.setPreferredSize(new Dimension(200, 0));
        panelTableroCard.add(panelJugadores, BorderLayout.WEST);
        panelTablero = new JPanel();
        panelTableroCard.add(panelTablero, BorderLayout.CENTER);

        CardLayout cl = (CardLayout) this.panelPrincipal.getLayout();
        cl.show(this.panelPrincipal, "entradas");

        this.setVisible(true);

    }

    @Override
    public void cambiarAPanelJuego() {
        CardLayout cl = (CardLayout) this.panelPrincipal.getLayout();
        cl.show(this.panelPrincipal, "tablero");
        Window ventana = SwingUtilities.getWindowAncestor(this.panelPrincipal);
        if (ventana != null) {
            ventana.setSize(800, 800);
            ventana.setLocationRelativeTo(null);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        try {
            int altura = Integer.parseInt(this.inputCampoI.getText());
            int ancho = Integer.parseInt(this.inputCampoJ.getText());
            String nombreJ1 = inputJugador1.getText();
            boolean vacioJ1 = nombreJ1.isEmpty() || nombreJ1 == null;
            String nombreJ2 = inputJugador2.getText();
            boolean vacioJ2 = nombreJ2.isEmpty() || nombreJ2 == null;
            String nombreJ3 = inputJugador3.getText();
            boolean vacioJ3 = nombreJ3.isEmpty() || nombreJ3 == null;
            int area = altura * ancho;
            if ((area % 2 != 0) || area > 120 || vacioJ1 || vacioJ2 || vacioJ3) {
                this.btnEmpezar.setEnabled(false);
            } else {
                this.btnEmpezar.setEnabled(true);
            }
        } catch (Exception exception) {
            this.btnEmpezar.setEnabled(false);
        }
    }

    @Override
    public int getAlto() {
        return Integer.parseInt(inputCampoI.getText());
    }

    @Override
    public int getAncho() {
        return Integer.parseInt(inputCampoJ.getText());

    }

    @Override
    public void mostrarMensaje(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    @Override
    public ArrayList<String> getJugadores() {
        ArrayList<String> jugadores = new ArrayList<String>();
        String j1 = inputJugador1.getText();
        String j2 = inputJugador2.getText();
        String j3 = inputJugador3.getText();
        jugadores.add(j1);
        jugadores.add(j2);
        jugadores.add(j3);
        return jugadores;
    }

    @Override
    public void resetearJuego() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'resetearJuego'");
    }

    @Override
    public void empezarJuego(ArrayList<IJugador> jugadores, Tablero t, ActionListener al) {
        // Construir tablero: no asignamos la imagen al crear el botón
        // para que sólo se muestre al hacer click.
        int numeroConjunto;
        this.panelTablero.removeAll();
        this.panelTablero.setLayout(new GridLayout(t.getAlto(), t.getAncho(), 0, 0));
        for (int i = 0; i < t.getAlto(); i++) {
            for (int j = 0; j < t.getAncho(); j++) {
                numeroConjunto = t.getMatriz()[i][j].getNumeroConjunto();
                // Pasamos null para que el constructor no ponga aún la imagen
                String rutaActual = System.getProperty("user.dir");
                String ruta = rutaActual + File.separator + "memotest" +  File.separator + "src" + File.separator + "main" +
                        File.separator + "java" + File.separator + "memotest" +
                         File.separator + "vista"+File.separator + "imagenes_64" + File.separator +
                        numeroConjunto + "_64px.png";
                System.out.println(ruta);
                JButtonCasilla btn = new JButtonCasilla(i, j, numeroConjunto, ruta, 64,false);
                // guardamos la ruta en la propiedad cliente para usarla al hacer click
                btn.addActionListener(al);
                btn.setActionCommand("apretoCasilla");
                this.panelTablero.add(btn);
            }
        }
        this.panelJugadores.setLayout(new GridLayout(jugadores.size(), 0));
        for (int i = 0; i < jugadores.size(); i++) {
            IJugador j = jugadores.get(i);
            JPanel envoltorioGenerico = new JPanel();
            envoltorioGenerico.add(new JLabel(j.getNombre() + " " + String.valueOf(j.getAciertos())));
            this.panelJugadores.add(envoltorioGenerico);
        }

        cambiarAPanelJuego();
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void addActionListener(ActionListener al) {
        this.btnEmpezar.addActionListener(al);
    }

    @Override
    public void redibujarConPuntuaciones(ArrayList<IJugador> j, Tablero t, ActionListener al) {
        // Reconstruir tablero y panel de jugadores usando los datos recibidos
        int numeroConjunto;
        this.panelTablero.removeAll();
        this.panelTablero.setLayout(new GridLayout(t.getAlto(), t.getAncho(), 0, 0));
        for (int i = 0; i < t.getAlto(); i++) {
            for (int k = 0; k < t.getAncho(); k++) {
                numeroConjunto = t.getMatriz()[i][k].getNumeroConjunto();
                String rutaActual = System.getProperty("user.dir");
                String ruta = rutaActual + File.separator + "memotest" + File.separator + "src" + File.separator + "main" +
                        File.separator + "java" + File.separator + "memotest" +
                        File.separator + "vista" + File.separator + "imagenes_64" + File.separator +
                        numeroConjunto + "_64px.png";
                JButtonCasilla btn = new JButtonCasilla(i, k, numeroConjunto, ruta, 64,t.getMatriz()[i][k].isPisado());
                btn.addActionListener(al);
                btn.setActionCommand("apretoCasilla");
                this.panelTablero.add(btn);
            }
        }

        this.panelJugadores.removeAll();
        this.panelJugadores.setLayout(new GridLayout(j.size(), 0));
        for (int idx = 0; idx < j.size(); idx++) {
            IJugador pj = j.get(idx);
            JPanel envoltorioGenerico = new JPanel();
            envoltorioGenerico.add(new JLabel(pj.getNombre() + " " + String.valueOf(pj.getAciertos())));
            this.panelJugadores.add(envoltorioGenerico);
        }

        this.panelTablero.revalidate();
        this.panelTablero.repaint();
        this.panelJugadores.revalidate();
        this.panelJugadores.repaint();
    }

    

}