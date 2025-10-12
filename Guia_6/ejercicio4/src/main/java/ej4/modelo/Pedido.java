package ej4.modelo;

import java.util.Date;
import java.util.Iterator;

public class Pedido extends ConjuntoGenericoOrdenado<LineaDePedido> {
	private Empleado e;
	private Date fecha;
	
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
	
	public void mostrarPedidos(){
		Iterator<LineaDePedido> pedidos = getIterator();
		LineaDePedido lp;
		while (pedidos.hasNext()) {
			lp = pedidos.next();
			System.out.println(lp);
		}
	}
	
	public double obtenerPrecioTotalPedido(){
		Iterator<LineaDePedido> pedidos = getIterator();
		LineaDePedido lp;
		double sumaPedido = 0;
		while (pedidos.hasNext()) {
			lp = pedidos.next();
			sumaPedido+=lp.getCantidadProductos()*lp.getP().getPrecioUnitario();
		}
		return sumaPedido;
	}
	
}
