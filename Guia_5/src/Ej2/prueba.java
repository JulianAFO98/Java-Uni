package Ej2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class prueba extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JList<CuentaBancaria> listaCuentas;
	private JTextArea log;
	private JPanel panel_2;
	private JPanel panel_3;
	private JTextField inputCuenta;
	private JButton crearCuenta;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JButton btnNewButton;
	private JPanel panel_9;
	private JPanel panel_10;
	private JButton btnNewButton_1;
	private JPanel panel_11;
	private JPanel panel_12;
	private JPanel panel_13;
	private JPanel panel_14;
	private JLabel lblNewLabel;
	private JTextField inputExtraer;
	private JPanel panel_15;
	private JPanel panel_16;
	private JPanel panel_17;
	private JPanel panel_18;
	private JLabel lblNewLabel_1;
	private JTextField inputDepositar;
	private JPanel panel_19;
	private JPanel panel_20;
	private DefaultListModel<CuentaBancaria> modelo;
	private ArrayList<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba frame = new prueba();
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
	public prueba() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1010, 645);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel = new JPanel();
		this.contentPane.add(this.panel);
		this.panel.setLayout(new GridLayout(2, 0, 0, 0));
		
		this.scrollPane = new JScrollPane();
		this.panel.add(this.scrollPane);
		
		this.listaCuentas = new JList();
		this.scrollPane.setViewportView(this.listaCuentas);
		
		this.scrollPane_1 = new JScrollPane();
		this.panel.add(this.scrollPane_1);
		
		this.log = new JTextArea();
		this.scrollPane_1.setViewportView(this.log);
		
		this.panel_1 = new JPanel();
		this.contentPane.add(this.panel_1);
		this.panel_1.setLayout(new GridLayout(2, 0, 0, 0));
		
		this.panel_3 = new JPanel();
		this.panel_3.setBorder(new TitledBorder(null, "Crear cuenta", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panel_1.add(this.panel_3);
		this.panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.panel_4 = new JPanel();
		this.panel_3.add(this.panel_4);
		
		this.crearCuenta = new JButton("Crear");
		this.crearCuenta.addActionListener(this);
		this.crearCuenta.setActionCommand("crear");
		this.panel_4.add(this.crearCuenta);
		
		this.panel_5 = new JPanel();
		this.panel_3.add(this.panel_5);
		
		this.inputCuenta = new JTextField();
		this.panel_5.add(this.inputCuenta);
		this.inputCuenta.setColumns(10);
		
		this.panel_2 = new JPanel();
		this.panel_2.setBorder(new TitledBorder(null, "Acciones de cuenta", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panel_1.add(this.panel_2);
		this.panel_2.setLayout(new GridLayout(3, 0, 0, 0));
		
		this.panel_6 = new JPanel();
		this.panel_2.add(this.panel_6);
		this.panel_6.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_17 = new JPanel();
		this.panel_6.add(this.panel_17);
		
		this.panel_19 = new JPanel();
		this.panel_17.add(this.panel_19);
		
		this.lblNewLabel_1 = new JLabel("Monto a depositar:");
		this.panel_19.add(this.lblNewLabel_1);
		
		this.panel_18 = new JPanel();
		this.panel_6.add(this.panel_18);
		
		this.panel_20 = new JPanel();
		this.panel_18.add(this.panel_20);
		
		this.inputDepositar = new JTextField();
		this.panel_20.add(this.inputDepositar);
		this.inputDepositar.setColumns(10);
		
		this.panel_7 = new JPanel();
		this.panel_2.add(this.panel_7);
		this.panel_7.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_13 = new JPanel();
		this.panel_7.add(this.panel_13);
		
		this.panel_16 = new JPanel();
		this.panel_13.add(this.panel_16);
		
		this.lblNewLabel = new JLabel("Monto a extraer:");
		this.panel_16.add(this.lblNewLabel);
		
		this.panel_14 = new JPanel();
		this.panel_7.add(this.panel_14);
		
		this.panel_15 = new JPanel();
		this.panel_14.add(this.panel_15);
		
		this.inputExtraer = new JTextField();
		this.panel_15.add(this.inputExtraer);
		this.inputExtraer.setColumns(10);
		
		this.panel_8 = new JPanel();
		this.panel_2.add(this.panel_8);
		this.panel_8.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_9 = new JPanel();
		this.panel_8.add(this.panel_9);
		
		this.panel_12 = new JPanel();
		this.panel_9.add(this.panel_12);
		
		this.btnNewButton = new JButton("Depositar");
		this.btnNewButton.addActionListener(this);
		this.panel_12.add(this.btnNewButton);
		
		this.panel_10 = new JPanel();
		this.panel_8.add(this.panel_10);
		
		this.panel_11 = new JPanel();
		this.panel_10.add(this.panel_11);
		
		this.btnNewButton_1 = new JButton("Extraer");
		this.btnNewButton_1.addActionListener(this);
		this.panel_11.add(this.btnNewButton_1);
		this.modelo = new DefaultListModel<CuentaBancaria>();
		
		this.listaCuentas.setModel(modelo);
		

	}

	public void actionPerformed(ActionEvent e) {
		JButton btn =(JButton) e.getSource();
		if(btn.getActionCommand().equalsIgnoreCase("crear")) {
			this.crearCuenta();
		}
		if(btn.getActionCommand().equalsIgnoreCase("extraer")) {
			this.extraer();
		}
		if(btn.getActionCommand().equalsIgnoreCase("depositar")) {
			this.depositar();
		}
		this.actualizarListas();
	}

	private void depositar() {
		String input = this.inputDepositar.getText();
		CuentaBancaria cb = this.listaCuentas.getSelectedValue();
        if(input.isEmpty() || cb == null) {
        	if(input.isEmpty())
        		JOptionPane.showMessageDialog(this,"Coloque un valor valido para depositar");
        	else
        		JOptionPane.showMessageDialog(this,"Elija una cuenta de la lista");
        }else {
        	double value = Double.parseDouble(input);
        	
				try {
					cb.depositar(value);
					this.log.append("Se deposito "+value+" en la cuenta de "+cb.getTitular()+"\n");
				} catch (DepositoInvalidoException e) {
					this.log.append("Se quizo depositar un valor incorrecto en la cuenta de "+cb.getTitular()+"\n");
				}
			
        	
        }
		
	}

	private void extraer() {
		String input = this.inputExtraer.getText();
		CuentaBancaria cb = this.listaCuentas.getSelectedValue();
        if(input.isEmpty() || cb == null) {
        	if(input.isEmpty())
        		JOptionPane.showMessageDialog(this,"Coloque un valor valido para extraer");
        	else
        		JOptionPane.showMessageDialog(this,"Elija una cuenta de la lista");
        }else {
        	double value = Double.parseDouble(input);
        	try {
				cb.extraer(value);
				this.log.append("Se extrajo : "+value+" de la cuenta de "+cb.getTitular()+"\n");
			} catch (ExtraccionInvalidaException e) {
				double sumaDeseada = e.getDato().getExtraccionSolicitada();
				double sueldo = e.getDato().getSueldo();
				this.log.append("Se quizo extraer "+sumaDeseada+" de la cuenta de "+cb.getTitular()+" pero el monto era "+sueldo+"\n");
			}
        	
        }
		
	}

	private void crearCuenta() {
		String input = this.inputCuenta.getText();
        if(input.isEmpty()) {
        	JOptionPane.showMessageDialog(this,"Coloque un valor valido al crear la cuenta");
        }else {
        	this.cuentas.add(new CuentaBancaria(input));
        	this.log.append("Se creo una cuenta con titular: "+input+"\n");
        }
		
	}
	
	private void actualizarListas() {
		this.modelo.clear();
		Iterator<CuentaBancaria> it = this.cuentas.iterator();
		while(it.hasNext()) {
			this.modelo.addElement(it.next());
		}
		
	}
}
