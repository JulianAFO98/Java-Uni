package Ej5;

public class Chofer {
	private String nombre;
	private Categoria categoria;
	private Domicilio domicilio;
	private Vehiculo vehiculoAsignado=null;
	
	
	public Chofer(String nombre, Categoria categoria,Domicilio d) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.domicilio = d;
	}


	public String getNombre() {
		return nombre;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setVehiculoAsignado(Vehiculo vehiculoAsignado) {
		if (vehiculoAsignado.aceptoChofer(this))
			this.vehiculoAsignado = vehiculoAsignado;
	}


	public Vehiculo getVehiculoAsignado() {
		return vehiculoAsignado;
	}
	
	public void desvincularVehiculo() {
		this.vehiculoAsignado = null;
	}


	@Override
	public String toString() {
		String r = "Chofer: " + nombre + ", categoria: " + categoria;
		r+= this.vehiculoAsignado != null ? " vehiculo: " + this.vehiculoAsignado : " no posee un vehiculo";
		return r;
	}
	
}
