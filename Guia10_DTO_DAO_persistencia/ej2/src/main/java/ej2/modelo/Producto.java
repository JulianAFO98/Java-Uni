package ej2.modelo;

import java.io.Serializable;

public class Producto implements Comparable,Serializable{
	private String descripcion;
	private double precioUnitario;
	private int codigo;
	private static int nroActual = 0;
	private static final long serialVersionUID = 1L;
	
	public Producto(String descripcion,double precioUnitario) {
		this.descripcion  = descripcion;
		this.precioUnitario = precioUnitario;
		this.codigo = nroActual++;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecioUnitario() {
		return precioUnitario;
	}


	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public static int getNroActual() {
		return nroActual;
	}


	public static void setNroActual(int nroActual) {
		Producto.nroActual = nroActual;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + codigo;
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
		Producto other = (Producto) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (codigo != other.codigo)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Producto [descripcion=" + descripcion + ", precioUnitario=" + precioUnitario + ", codigo=" + codigo
				+ "]";
	}


	@Override
	public int compareTo(Object otro) {
		Producto p = (Producto) otro;
		int res = 0;
		if(this.codigo>p.codigo)
			res = 1;
		else if(this.codigo<p.codigo)
			res = -1;
		return res;
	}


	


	

	
	
	
	
}
