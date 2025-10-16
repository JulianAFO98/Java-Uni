package ej1.vista;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import ej1.modelo.Arquero;
import ej1.modelo.AtaqueImposibleException;
import ej1.modelo.Caballero;
import ej1.modelo.Dragon;
import ej1.modelo.IVista;
import ej1.modelo.Mago;
import ej1.modelo.Paladin;
import ej1.modelo.Personaje;
import ej1.modelo.Posicion;

import java.awt.event.ActionListener;
import java.util.Iterator;


public class Ventana extends JFrame implements IVista {

	private static final long serialVersionUID = 1L;
	private ActionListener controlador;
	private JPanel contentPane;
	private JPanel panelPersonajes;
	private JPanel panelAgregar;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JScrollPane scrollPane_1;
	private JPanel panelCrear;
	private JList<Personaje> listaPersonaje1;
	private JList<Personaje> listaPersonaje2;
	private JPanel panelDetalles;
	private JScrollPane scrollPane_2;
	private JTextArea log;
	private JButton btnAtacar;
	private JPanel panel_1;
	private JPanel panelNombre;
	private JLabel lblNewLabel;
	private JTextField campoNombre;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panelMover;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_11;
	private JPanel panel_12;
	private JButton btnNewButton_3;
	private JPanel panel_13;
	private JPanel panel_15;
	private JPanel panel_14;
	private JPanel panel_16;
	private JLabel lblNewLabel_1;
	private JTextField campoX;
	private JPanel panel_17;
	private JLabel lblNewLabel_2;
	private JTextField campoY;
	private JPanel panel_18;
	private JPanel panel_19;
	private JPanel panel_20;
	private JPanel panel_21;
	DefaultListModel<Personaje> modelo;
	private JButton btnCofreBendito;
	private JButton btnCofreMaldito;
	private JPanel panel_22;
	private JPanel panel_23;
	private JButton btnNewButton_4;
	private JPanel panel_24;
	private JPanel panel_25;
	private JButton brnCrearMago;
	private JPanel panel_26;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.contentPane = new JPanel();
		this.contentPane.setPreferredSize(new Dimension(1000, 600));
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));

		this.panelPersonajes = new JPanel();
		this.panelPersonajes.setPreferredSize(new Dimension(700, 400));
		this.contentPane.add(this.panelPersonajes, BorderLayout.CENTER);
		this.panelPersonajes.setLayout(new GridLayout(1, 3, 0, 0));

		this.scrollPane = new JScrollPane();
		this.panelPersonajes.add(this.scrollPane);

		this.listaPersonaje1 = new JList<Personaje>();
		this.scrollPane.setViewportView(this.listaPersonaje1);

		this.panel = new JPanel();
		this.panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.panelPersonajes.add(this.panel);

		this.panel_1 = new JPanel();
		this.panel.add(this.panel_1);

		this.btnAtacar = new JButton("Atacar");
		this.btnAtacar.addActionListener(this.controlador);
		this.panel_1.add(this.btnAtacar);
		this.btnAtacar.setActionCommand("atacar");

		this.panel_22 = new JPanel();
		this.panel.add(this.panel_22);

		this.btnCofreBendito = new JButton("Abrir cofre bendito");
		this.btnCofreBendito.addActionListener(this.controlador);
		this.btnCofreBendito.setActionCommand("bendito");
		this.panel_22.add(this.btnCofreBendito);

		this.panel_23 = new JPanel();
		this.panel.add(this.panel_23);

		this.btnCofreMaldito = new JButton("Abrir cofre maldito");
		this.btnCofreMaldito.setActionCommand("maldito");
		this.btnCofreMaldito.addActionListener(this.controlador);
		this.panel_23.add(this.btnCofreMaldito);

		this.scrollPane_1 = new JScrollPane();
		this.panelPersonajes.add(this.scrollPane_1);

		this.listaPersonaje2 = new JList<Personaje>();
		this.scrollPane_1.setViewportView(this.listaPersonaje2);

		this.panelAgregar = new JPanel();
		this.panelAgregar.setPreferredSize(new Dimension(300, 400));
		this.contentPane.add(this.panelAgregar, BorderLayout.EAST);
		this.panelAgregar.setLayout(new GridLayout(2, 1, 0, 0));

		this.panelCrear = new JPanel();
		this.panelCrear.setBorder(
				new TitledBorder(null, "Crear personaje", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelCrear.setPreferredSize(new Dimension(0, 0));
		this.panelAgregar.add(this.panelCrear);
		this.panelCrear.setLayout(new GridLayout(4, 1, 0, 0));

		this.panelNombre = new JPanel();
		this.panelCrear.add(this.panelNombre);
		this.panelNombre.setLayout(new GridLayout(0, 2, 0, 0));

		this.panel_2 = new JPanel();
		this.panelNombre.add(this.panel_2);

		this.lblNewLabel = new JLabel("Nombre:");
		this.panel_2.add(this.lblNewLabel);

		this.panel_3 = new JPanel();
		this.panelNombre.add(this.panel_3);

		this.campoNombre = new JTextField();
		this.panel_3.add(this.campoNombre);
		this.campoNombre.setColumns(10);

		this.panel_4 = new JPanel();
		this.panelCrear.add(this.panel_4);
		this.panel_4.setLayout(new GridLayout(1, 2, 0, 0));

		this.panel_7 = new JPanel();
		this.panel_4.add(this.panel_7);

		this.btnNewButton = new JButton("Caballero");
		this.btnNewButton.setActionCommand("caballero");
		this.btnNewButton.addActionListener(this.controlador);
		this.panel_7.add(this.btnNewButton);

		this.panel_24 = new JPanel();
		this.panel_7.add(this.panel_24);

		this.btnNewButton_4 = new JButton("Dragon");
		this.btnNewButton_4.setActionCommand("dragon");
		this.panel_24.add(this.btnNewButton_4);
		this.btnNewButton_4.addActionListener(this.controlador);

		this.panel_5 = new JPanel();
		this.panelCrear.add(this.panel_5);
		this.panel_5.setLayout(new GridLayout(0, 2, 0, 0));

		this.panel_8 = new JPanel();
		this.panel_5.add(this.panel_8);

		this.btnNewButton_1 = new JButton("Paladin");
		this.btnNewButton_1.addActionListener(this.controlador);
		this.btnNewButton_1.setActionCommand("paladin");
		this.panel_8.add(this.btnNewButton_1);
		
		this.panel_25 = new JPanel();
		this.panel_5.add(this.panel_25);
		
		this.panel_26 = new JPanel();
		this.panel_25.add(this.panel_26);
		
		this.brnCrearMago = new JButton("Mago");
		this.brnCrearMago.addActionListener(this.controlador);
		this.panel_26.add(this.brnCrearMago);

		this.panel_6 = new JPanel();
		this.panelCrear.add(this.panel_6);

		this.panel_9 = new JPanel();
		this.panel_6.add(this.panel_9);

		this.btnNewButton_2 = new JButton("Arquero");
		this.btnNewButton_2.addActionListener(this.controlador);
		this.btnNewButton_2.setActionCommand("arquero");
		this.panel_9.add(this.btnNewButton_2);

		this.panelMover = new JPanel();
		this.panelMover.setBorder(new TitledBorder(null, "Mover", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelAgregar.add(this.panelMover);
		this.panelMover.setLayout(new GridLayout(3, 1, 0, 0));

		this.panel_10 = new JPanel();
		this.panelMover.add(this.panel_10);
		this.panel_10.setLayout(new GridLayout(0, 2, 0, 0));

		this.panel_14 = new JPanel();
		this.panel_10.add(this.panel_14);

		this.panel_18 = new JPanel();
		this.panel_14.add(this.panel_18);

		this.lblNewLabel_1 = new JLabel("X:");
		this.panel_18.add(this.lblNewLabel_1);

		this.panel_16 = new JPanel();
		this.panel_10.add(this.panel_16);

		this.panel_19 = new JPanel();
		this.panel_16.add(this.panel_19);

		this.campoX = new JTextField();
		this.panel_19.add(this.campoX);
		this.campoX.setColumns(10);

		this.panel_11 = new JPanel();
		this.panelMover.add(this.panel_11);
		this.panel_11.setLayout(new GridLayout(0, 2, 0, 0));

		this.panel_15 = new JPanel();
		this.panel_11.add(this.panel_15);

		this.panel_21 = new JPanel();
		this.panel_15.add(this.panel_21);

		this.lblNewLabel_2 = new JLabel("Y:");
		this.panel_21.add(this.lblNewLabel_2);

		this.panel_17 = new JPanel();
		this.panel_11.add(this.panel_17);

		this.panel_20 = new JPanel();
		this.panel_17.add(this.panel_20);

		this.campoY = new JTextField();
		this.panel_20.add(this.campoY);
		this.campoY.setColumns(10);

		this.panel_12 = new JPanel();
		this.panelMover.add(this.panel_12);

		this.panel_13 = new JPanel();
		this.panel_12.add(this.panel_13);

		this.btnNewButton_3 = new JButton("Mover");
		this.btnNewButton_3.setActionCommand("mover");
		this.btnNewButton_3.addActionListener(this.controlador);
		this.panel_13.add(this.btnNewButton_3);

		this.panelDetalles = new JPanel();
		this.panelDetalles.setPreferredSize(new Dimension(1000, 200));
		this.contentPane.add(this.panelDetalles, BorderLayout.SOUTH);
		this.panelDetalles.setLayout(new BorderLayout(0, 0));

		this.scrollPane_2 = new JScrollPane();
		this.panelDetalles.add(this.scrollPane_2, BorderLayout.CENTER);

		this.log = new JTextArea();
		this.scrollPane_2.setViewportView(this.log);

		modelo = new DefaultListModel<Personaje>();
		listaPersonaje1.setModel(modelo);
		listaPersonaje2.setModel(modelo);

	}

	@Override
	public void setControlador(ActionListener controlador) {
		this.controlador = controlador;
	}

	private void crearMago() {
        String nombre = this.campoNombre.getText();
        if (nombre == null || nombre.equals("")) {
            JOptionPane.showMessageDialog(this, "No se puede crear un personaje sin nombre");
        } else {
            mapa.agregarPersonaje(new Mago(nombre, new Posicion(0, 0)));
            this.log.append("Se creo un Mago\n");
        }

    }

    private void maldecir() {
        Personaje p = (Personaje) this.listaPersonaje1.getSelectedValue();
        if (p != null) {
            p.serMaldecido();
            this.log.append(p.getNombre() + " fue maldecido!\n");
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un personaje de la lista 1 para maldecir");
        }
    }

    private void bendecir() {
        Personaje p = (Personaje) this.listaPersonaje1.getSelectedValue();
        if (p != null) {
            p.serBendecido();
            this.log.append(p.getNombre() + " fue bendecido!\n");
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un personaje de la lista 1 para bendecir");
        }

    }

    private void atacar() {
        Personaje p1 = (Personaje) this.listaPersonaje1.getSelectedValue();
        Personaje p2 = (Personaje) this.listaPersonaje2.getSelectedValue();
        if (p1 != null && p2 != null) {
            if (p1 == p2) {
                JOptionPane.showMessageDialog(this, "El personaje no es pendejo,no se ataca solo");
            } else {
                try {
                    mapa.ataca(p1, p2);
                    this.log.append(p1.getNombre() + " ataco a " + p2.getNombre() + "\n");
                } catch (AtaqueImposibleException e) {
                    double distDeAtaque = e.getAtacante().getDistanciaMaximaDeDesplazamiento();
                    JOptionPane.showMessageDialog(this, p1.getNombre() + " quizo atacar a " + p2.getNombre()
                            + " pero estaba fuera de rango(Distancia Max: " + distDeAtaque + ")\n");
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "Falto seleccionar algun personaje");
        }

    }

    private void actualizarListas() {
        this.modelo.clear();
        Iterator<Personaje> it = this.mapa.getPersonajes().iterator();
        while (it.hasNext()) {
            this.modelo.addElement(it.next());
        }

    }

    private void mover() {
        Personaje p = (Personaje) this.listaPersonaje1.getSelectedValue();
        if (p != null) {
            double x = Double.parseDouble(this.campoX.getText());
            double y = Double.parseDouble(this.campoY.getText());
            mapa.mueve(p, x, y);
            this.log.append(p.getNombre() + " se movio a " + "(" + p.getPosx() + "," + p.getPosy() + ")\n");

        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un personaje de la lista 1");
        }

    }

    private void crearPaladin() {

        String nombre = this.campoNombre.getText();
        if (nombre == null || nombre.equals("")) {
            JOptionPane.showMessageDialog(this, "No se puede crear un personaje sin nombre");
        } else {
            mapa.agregarPersonaje(new Paladin(nombre, new Posicion(0, 0)));
            this.log.append("Se creo un Paladin\n");
        }

    }

    private void crearCaballero() {
        String nombre = this.campoNombre.getText();
        if (nombre == null || nombre.equals("")) {
            JOptionPane.showMessageDialog(this, "No se puede crear un personaje sin nombre");
        } else {
            mapa.agregarPersonaje(new Caballero(nombre, new Posicion(0, 0)));
            this.log.append("Se creo un caballero\n");
        }

    }

    private void crearArquero() {
        String nombre = this.campoNombre.getText();
        if (nombre == null || nombre.equals("")) {
            JOptionPane.showMessageDialog(this, "No se puede crear un personaje sin nombre");
        } else {
            mapa.agregarPersonaje(new Arquero(nombre, new Posicion(0, 0)));
            this.log.append("Se creo un Arquero\n");
        }

    }

    private void crearDragon() {
        String nombre = this.campoNombre.getText();
        if (nombre == null || nombre.equals("")) {
            JOptionPane.showMessageDialog(this, "No se puede crear un personaje sin nombre");
        } else {
            mapa.agregarPersonaje(new Dragon(nombre, 1000, 30, new Posicion(0, 0), 100));
            this.log.append("Se creo un Arquero\n");
        }

    }


}

	
	