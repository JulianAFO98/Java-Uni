package ej4.vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import ej4.modelo.Estacion;
import ej4.modelo.IDespachador;
import ej4.modelo.RegistroCombustible;

public class Ventana extends JFrame implements IVista{

    private JPanel panelPrincipal;
    private JPanel panelAdmin;
    private JPanel panelInfo;
    private JScrollPane panelLista;
    private JList<IDespachador> listaSurtidores;
    private JPanel panelLog;
    private JTextArea areaLog;
    private JScrollPane scrollLog;
    private DefaultListModel<IDespachador> modelo;
    private JButton btnAgregarSurtidor;
    private JPanel wrapperAgregarSurtidor;
    private JLabel textoAgregarSurtidor;
    private JPanel wrapperTextAgregarSurtidor;
    private JButton agregarNaftaPremium;
    private JPanel wrapperNaftP;
    private JButton agregarNaftaSuper;
    private JPanel wrapperNaftS;
    private JButton agregarGasoil;
    private JPanel wrapperGasoil;

    public Ventana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 700, 700);
        this.panelPrincipal = new JPanel();
        this.panelPrincipal.setPreferredSize(new Dimension(700,700));
        this.panelPrincipal.setBorder(new TitledBorder("Estacion Admin"));
        setContentPane(panelPrincipal);
        this.panelPrincipal.setLayout(new BorderLayout());


        this.panelInfo = new JPanel();
        this.panelInfo.setPreferredSize(new Dimension(350,500));
        this.panelInfo.setLayout(new BorderLayout());
        this.listaSurtidores = new JList<IDespachador>();
        this.panelLista = new JScrollPane(this.listaSurtidores);
        this.panelInfo.add(this.panelLista, BorderLayout.CENTER);

        this.panelAdmin = new JPanel();
        this.panelAdmin.setLayout(new GridLayout(0,1,0,0));
        this.panelAdmin.setPreferredSize(new Dimension(350,500));

        this.panelLog = new JPanel();
        this.panelLog.setPreferredSize(new Dimension(700,200));
        this.panelLog.setLayout(new BorderLayout());
        this.areaLog = new JTextArea();
        this.areaLog.setEditable(false); // opcional, para solo mostrar logs
        this.scrollLog = new JScrollPane(this.areaLog);
        this.panelLog.add(this.scrollLog,BorderLayout.CENTER);

        this.panelPrincipal.add(this.panelAdmin,BorderLayout.WEST);
        this.panelPrincipal.add(this.panelInfo,BorderLayout.EAST);
        this.panelPrincipal.add(this.panelLog,BorderLayout.SOUTH);

        this.textoAgregarSurtidor = new JLabel("Aprete para agregar un surtidor");
        this.wrapperTextAgregarSurtidor = new JPanel();
        this.wrapperTextAgregarSurtidor.add(this.textoAgregarSurtidor);
        this.btnAgregarSurtidor = new JButton();
        this.btnAgregarSurtidor.setActionCommand("crearSurtidor");
        this.btnAgregarSurtidor.setText("Nuevo Surtidor");
        this.wrapperAgregarSurtidor = new JPanel();
        this.wrapperAgregarSurtidor.add(this.btnAgregarSurtidor);
        this.panelAdmin.add(this.wrapperTextAgregarSurtidor);
        this. panelAdmin.add(this.wrapperAgregarSurtidor);

        this.agregarNaftaPremium = new JButton("Agregar Nafta Premium");
        this.agregarNaftaPremium.setActionCommand("agregarNaftaPremium");
        this.wrapperNaftP = new JPanel();
        this.wrapperNaftP.add(agregarNaftaPremium);
        this.panelAdmin.add(wrapperNaftP);

        this.agregarNaftaSuper = new JButton("Agregar Nafta Super");
        this.agregarNaftaSuper.setActionCommand("agregarNaftaSuper");
        this.wrapperNaftS = new JPanel();
        this.wrapperNaftS.add(agregarNaftaSuper);
        this.panelAdmin.add(wrapperNaftS);

        this.agregarGasoil = new JButton("Agregar Gasoil");
        this.agregarGasoil.setActionCommand("agregarGasoil");
        this.wrapperGasoil = new JPanel();
        this.wrapperGasoil.add(agregarGasoil);
        this.panelAdmin.add(wrapperGasoil);


        this.modelo = new DefaultListModel<>();
        this.listaSurtidores.setModel(modelo);


        this.setVisible(true);
    }

    @Override
    public IDespachador getValorSeleccionado() {
        return this.listaSurtidores.getSelectedValue();
    }

    @Override
    public void mostrarMensaje(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    @Override
    public void actualizarVista(Estacion e) {
        IDespachador rc = null;
        Iterator<IDespachador> r = e.getSurtidores().iterator();
        this.modelo.clear();
        while(r.hasNext()){
            rc = (IDespachador) r.next();
            this.modelo.addElement(rc);
        }
    }

    

    @Override
    public void addActionListener(ActionListener al) {
        this.btnAgregarSurtidor.addActionListener(al);
        this.agregarNaftaPremium.addActionListener(al);
        this.agregarGasoil.addActionListener(al);
        this.agregarNaftaSuper.addActionListener(al);
    }

}
