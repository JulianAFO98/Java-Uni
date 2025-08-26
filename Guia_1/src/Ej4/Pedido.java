package Ej4;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	private Empleado e;
	private Date fecha;
	private ArrayList<LineaDePedido> listaPedidos;
	public Empleado getE() {
		return e;
	}
	public void setE(Empleado e) {
		this.e = e;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public ArrayList<LineaDePedido> getListaPedidos() {
		return listaPedidos;
	}
	public void setListaPedidos(ArrayList<LineaDePedido> listaPedidos) {
		this.listaPedidos = listaPedidos;
	}
	
	
}
