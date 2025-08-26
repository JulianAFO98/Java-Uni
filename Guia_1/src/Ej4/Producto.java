package Ej4;

public class Producto {
	private String descripcion;
	private double precioUnitario;
	private int codigo;
	private static int nroActual = 0;
	
	
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
	
	
	
}
