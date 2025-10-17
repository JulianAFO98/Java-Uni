package buscaminas.vista;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import buscaminas.modelo.Casilla;
import buscaminas.modelo.Tablero;

public class Ventana extends JFrame implements IVista, KeyListener {

    private JPanel panelPrincipal;
    private JPanel panelEntradas;
    private JPanel envoltorioTextoCampoI;
    private JLabel textoCampoI;
    private JPanel envoltorioTextoCampoJ;
    private JLabel textoCampoJ;
    private JPanel envoltorioTextoCampoMinas;
    private JLabel textoCampoMinas;
    private JPanel envoltorioInputCampoI;
    private JTextField inputCampoI;
    private JPanel envoltorioInputCampoJ;
    private JTextField inputCampoJ;
    private JPanel envoltorioInputCampoCantMinas;
    private JTextField inputCampoCantMinas;
    private JPanel envoltorioBtnEmpezar;
    private JButton btnEmpezar;
    private JButtonCasilla btnCasilla;
    private JPanel panelTablero;

    public Ventana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 200, 300);
        this.panelPrincipal = new JPanel();
        this.panelPrincipal.setPreferredSize(new Dimension(200, 300));
        this.panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panelPrincipal);
        this.panelPrincipal.setLayout(new CardLayout());

        this.panelEntradas = new JPanel();
        this.panelEntradas.setPreferredSize(new Dimension(200, 300));
        this.panelPrincipal.add(this.panelEntradas, "entradas");
        this.panelEntradas.setLayout(new GridLayout(0, 1, 0, 0));

        this.inputCampoCantMinas = new JTextField();
        this.inputCampoCantMinas.setColumns(10);
        this.inputCampoI = new JTextField();
        this.inputCampoI.setColumns(10);
        this.inputCampoJ = new JTextField();
        this.inputCampoJ.setColumns(10);

        this.inputCampoI.addKeyListener(this);
        this.inputCampoJ.addKeyListener(this);
        this.inputCampoCantMinas.addKeyListener(this);

        this.textoCampoI = new JLabel("Ingrese alto");
        this.textoCampoJ = new JLabel("Ingrese ancho");
        this.textoCampoMinas = new JLabel("Ingrese cantidad minas");

        this.envoltorioInputCampoCantMinas = new JPanel();
        this.envoltorioInputCampoCantMinas.add(this.inputCampoCantMinas);

        this.envoltorioInputCampoI = new JPanel();
        this.envoltorioInputCampoI.add(this.inputCampoI);
        this.envoltorioInputCampoJ = new JPanel();
        this.envoltorioInputCampoJ.add(this.inputCampoJ);

        this.envoltorioTextoCampoI = new JPanel();
        this.envoltorioTextoCampoI.add(this.textoCampoI);
        this.envoltorioTextoCampoJ = new JPanel();
        this.envoltorioTextoCampoJ.add(this.textoCampoJ);
        this.envoltorioTextoCampoMinas = new JPanel();
        this.envoltorioTextoCampoMinas.add(this.textoCampoMinas);

        this.btnEmpezar = new JButton("Empezar");
        this.btnEmpezar.setEnabled(false);
        this.btnEmpezar.setActionCommand("empezar");
        this.envoltorioBtnEmpezar = new JPanel();
        this.envoltorioBtnEmpezar.add(this.btnEmpezar);

        this.panelEntradas.add(this.envoltorioTextoCampoI);
        this.panelEntradas.add(this.envoltorioInputCampoI);
        this.panelEntradas.add(this.envoltorioTextoCampoJ);
        this.panelEntradas.add(this.envoltorioInputCampoJ);
        this.panelEntradas.add(this.envoltorioTextoCampoMinas);
        this.panelEntradas.add(this.envoltorioInputCampoCantMinas);
        this.panelEntradas.add(this.envoltorioBtnEmpezar);
        this.panelTablero = new JPanel();
        this.panelPrincipal.add(this.panelTablero, "tablero");

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
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

        try {
            int altura = Integer.parseInt(this.inputCampoI.getText());
            int ancho = Integer.parseInt(this.inputCampoJ.getText());
            int cantMinas = Integer.parseInt(this.inputCampoCantMinas.getText());
            if ((cantMinas > altura * ancho) || altura > 20 || ancho > 20) {
                this.btnEmpezar.setEnabled(false);
            } else {
                this.btnEmpezar.setEnabled(true);
            }
        } catch (Exception exception) {
            this.btnEmpezar.setEnabled(false);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void generarTablero(Tablero t, ActionListener al) {
        this.panelTablero.setLayout(new GridLayout(t.getAlto(), t.getAncho(), 0, 0));
        for (int i = 0; i < t.getAlto(); i++) {
            for (int j = 0; j < t.getAncho(); j++) {
                JButtonCasilla btn = new JButtonCasilla(i, j, "");
                btn.setActionCommand("apretoCasillero");
                btn.addActionListener(al);
                this.panelTablero.add(btn);
            }
        }
    }

    @Override
    public void addActionListener(ActionListener al) {
        this.btnEmpezar.addActionListener(al);

    }

    @Override
    public int getCampoI() {
        return Integer.parseInt(this.inputCampoI.getText());
    }

    @Override
    public int getCampoJ() {
        return Integer.parseInt(this.inputCampoJ.getText());
    }

    @Override
    public int getCantMinas() {
        return Integer.parseInt(this.inputCampoCantMinas.getText());
    }

    @Override
    public void mostrarDialog(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    @Override
    public void resetearJuego() {
        CardLayout cl = (CardLayout) this.panelPrincipal.getLayout();
        cl.show(this.panelPrincipal, "entradas");
        Window ventana = SwingUtilities.getWindowAncestor(this.panelPrincipal);
        if (ventana != null) {
            ventana.setSize(200, 300);
            ventana.setLocationRelativeTo(null);
        }
        this.inputCampoCantMinas.setText("");
        this.inputCampoI.setText("");
        this.inputCampoJ.setText("");
        this.panelTablero.removeAll();
        this.panelTablero.revalidate();
        this.panelTablero.repaint();
    }

    @Override
    public void recargarVistaNuevamente(Tablero t, ActionListener al) {
        this.panelTablero.removeAll();
        this.panelTablero.revalidate();
        this.panelTablero.repaint();
        this.panelTablero.setLayout(new GridLayout(t.getAlto(), t.getAncho(), 0, 0));
        for (int i = 0; i < t.getAlto(); i++) {
            for (int j = 0; j < t.getAncho(); j++) {
                Casilla c = t.getMatriz()[i][j];
                JButtonCasilla btn = new JButtonCasilla(i, j,"");
                btn.setActionCommand("apretoCasillero");
                btn.addActionListener(al);
                if (c.isPisada()) {
                    btn.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
                    btn.setOpaque(true);
                    btn.setContentAreaFilled(true);
                    btn.setBackground(Color.LIGHT_GRAY);
                    btn.setForeground(Color.BLACK);
                    btn.setEnabled(true);
                    btn.setText(c.getText());
                    btn.setHorizontalAlignment(SwingConstants.CENTER);
                    btn.setFont(new Font("SansSerif", Font.BOLD, 16));
                }
                this.panelTablero.add(btn);
            }
        }
        this.panelTablero.revalidate();
        this.panelTablero.repaint();
    }

}
