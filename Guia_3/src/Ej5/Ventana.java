package Ej5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;

public class Ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelChoferes;
	private JPanel panelVehiculos;
	private JPanel panelAcoplados;
	private JPanel panelAgregar;
	private JScrollPane scrollPane;
	private JList<Chofer> listChoferes;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane_2;
	private JList<Vehiculo> listaVehiculos;
	private JList<Acoplado> listaAcoplados;
	private JPanel panelVincularVehiculo;
	private JButton btnAsignarVehiculo;
	private JButton btnAsignarAcoplado;
	private JPanel panel_1;
	private JPanel panel;
	private DefaultListModel<Chofer> modeloChofer;
	private DefaultListModel<Vehiculo> modeloVehiculo;
	private DefaultListModel<Acoplado> modeloAcoplado;
	private Empresa e;
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
		setBounds(100, 100, 1000, 600);
		this.contentPane = new JPanel();
		this.contentPane.setPreferredSize(new Dimension(1000, 600));
		this.contentPane.setBorder(new TitledBorder(null, "Programa empresa vehiculos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new GridLayout(0, 4, 0, 0));
		
		this.panelChoferes = new JPanel();
		this.contentPane.add(this.panelChoferes);
		this.panelChoferes.setLayout(new BorderLayout(0, 0));
		
		this.scrollPane = new JScrollPane();
		this.panelChoferes.add(this.scrollPane, BorderLayout.CENTER);
		
		this.listChoferes = new JList<Chofer>();
		this.scrollPane.setViewportView(this.listChoferes);
		
		this.panelVehiculos = new JPanel();
		this.contentPane.add(this.panelVehiculos);
		this.panelVehiculos.setLayout(new BorderLayout(0, 0));
		
		this.scrollPane_1 = new JScrollPane();
		this.panelVehiculos.add(this.scrollPane_1, BorderLayout.CENTER);
		
		this.listaVehiculos = new JList<Vehiculo>();
		this.scrollPane_1.setViewportView(this.listaVehiculos);
		
		this.panelAcoplados = new JPanel();
		this.contentPane.add(this.panelAcoplados);
		this.panelAcoplados.setLayout(new BorderLayout(0, 0));
		
		this.scrollPane_2 = new JScrollPane();
		this.panelAcoplados.add(this.scrollPane_2, BorderLayout.CENTER);
		
		this.listaAcoplados = new JList<Acoplado>();
		this.scrollPane_2.setViewportView(this.listaAcoplados);
		
		this.panelAgregar = new JPanel();
		this.contentPane.add(this.panelAgregar);
		this.panelAgregar.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.panelVincularVehiculo = new JPanel();
		this.panelAgregar.add(this.panelVincularVehiculo);
		this.panelVincularVehiculo.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.panel_1 = new JPanel();
		this.panelVincularVehiculo.add(this.panel_1);
		
		this.btnAsignarVehiculo = new JButton("Asignar Vehiculo");
		this.btnAsignarVehiculo.addActionListener(this);
		this.panel_1.add(this.btnAsignarVehiculo);
		this.btnAsignarVehiculo.setActionCommand("asignarVehiculo");
		
		this.panel = new JPanel();
		this.panelVincularVehiculo.add(this.panel);
		
		this.btnAsignarAcoplado = new JButton("Asignar acoplado");
		this.panel.add(this.btnAsignarAcoplado);
		this.btnAsignarAcoplado.addActionListener(this);
		this.btnAsignarAcoplado.setActionCommand("asignarAcoplado");
		
		//Esto se podria generar con botones e inputs
		e = new Empresa();
		Categoria c1 = new Categoria1();
		Categoria c2 = new Categoria2();
		Categoria c3 = new Categoria3();
		Categoria c4 = new Categoria4();
		
		Domicilio d1 = new Domicilio("Luro",3670);
		Domicilio d2 = new Domicilio("Colon",2790);
		Domicilio d3 = new Domicilio("Justo",1900);
		
		Chofer chofer1 = new Chofer("Juan Perez",c1,d1);
		Chofer chofer2 = new Chofer("Laura laureano",c4,d2);
		Chofer chofer3 = new Chofer("Agustin navarro",c3,d3);	
		
		
		Vehiculo v1 = new Colectivo("Mercedez C1",30);
		Vehiculo v2 = new Camion("Camioncito Veloz Z34",445,2000,20000);
		Vehiculo v3 = new ColectivoLargaDistancia("Camita 27V",23,true);
		
		Acoplado a = new Acoplado(2000,15000, true, 23, false);
		
		e.agregarAcoplado(a);
		e.agregarChofer(chofer1);
		e.agregarChofer(chofer2);
		e.agregarChofer(chofer3);
		e.agregarVehiculo(v1);
		e.agregarVehiculo(v2);
		e.agregarVehiculo(v3);
		

		modeloVehiculo = new DefaultListModel<Vehiculo>();
		for (Vehiculo v : e.getVehiculos()) {
		    modeloVehiculo.addElement(v);
		}
		this.listaVehiculos.setModel(modeloVehiculo);
		
		modeloChofer = new DefaultListModel<Chofer>();
		for (Chofer c : e.getChoferes()) {
			modeloChofer.addElement(c);
		}
		this.listChoferes.setModel(modeloChofer);
		
		
	
		modeloAcoplado = new DefaultListModel<Acoplado>();
		for (Acoplado acoplado : e.getAcoplados()) {
			modeloAcoplado.addElement(acoplado);
		}
		this.listaAcoplados.setModel(modeloAcoplado);
		
		
		
	}

	public void actionPerformed(ActionEvent e) {
		
		JButton boton = (JButton) e.getSource();
		if(boton.getActionCommand().equals("asignarVehiculo")) {
			this.vincularVehiculo();
			this.actualizarListaChoferes();
		}else if(boton.getActionCommand().equals("asignarAcoplado")) {
			this.vincularAcoplado();
			this.actualizarAcoplado();
		}
		this.actualizarListaVehiculo();
	}
	
	private void actualizarListaChoferes() {
		this.modeloChofer.clear();
		Iterator<Chofer> it =this.e.getChoferes().iterator();
		while(it.hasNext()) {
			this.modeloChofer.addElement(it.next());
		}
		
	}

	private void actualizarAcoplado() {
		this.modeloAcoplado.clear();
		Iterator<Acoplado> it =this.e.getAcoplados().iterator();
		while(it.hasNext()) {
			this.modeloAcoplado.addElement(it.next());
		}
		
	}

	public void actualizarListaVehiculo() {
		this.modeloVehiculo.clear();
		Iterator<Vehiculo> it =this.e.getVehiculos().iterator();
		while(it.hasNext()) {
			this.modeloVehiculo.addElement(it.next());
		}
		
	}
	
	public void vincularVehiculo() {
		
		Chofer c = this.listChoferes.getSelectedValue();
		Vehiculo v = this.listaVehiculos.getSelectedValue();
		if ( c == null || v == null) {
			JOptionPane.showMessageDialog(this, "Chofer o vehiculo no seleccionado");
		}else {
			c.setVehiculoAsignado(v);
		}
	}
	
	
	public void vincularAcoplado() {
		Acoplado a = this.listaAcoplados.getSelectedValue();
		Camion c  = (Camion) this.listaVehiculos.getSelectedValue(); // preguntar
		if ( a == null || c == null) {
			JOptionPane.showMessageDialog(this, "Acoplado o vehiculo no seleccionado");
		}else {
			c.asignarAcoplado(a);
		}
	}
	
	
	
}
