package ej2.modelo;

import java.io.Serializable;

public class LineaDePedido implements Comparable,Serializable{
	private Producto p;
	private int cantidadProductos;
	private static final long serialVersionUID = 1L;
	public Producto getP() {
		return p;
	}
	public void setP(Producto p) {
		this.p = p;
	}
	public int getCantidadProductos() {
		return cantidadProductos;
	}
	public void setCantidadProductos(int cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}
	


	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineaDePedido other = (LineaDePedido) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LineaDePedido [p=" + p + ", cantidadProductos=" + cantidadProductos + "]";
	}
	@Override
	public int compareTo(Object otro) {
		LineaDePedido ln = (LineaDePedido) otro;
		return this.p.compareTo(ln.p);
	}
	
	
	
	
}
