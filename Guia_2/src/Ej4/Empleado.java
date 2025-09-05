package Ej4;

public abstract class Empleado {

	private String nombre;
	private int numeroLegajo;
	private Domicilio domicilio;
	
	
	public Empleado(String nombre, int numeroLegajo, Domicilio domicilio) {
		this.nombre = nombre;
		this.numeroLegajo = numeroLegajo;
		this.domicilio = domicilio;
	}


	public String getNombre() {
		return nombre;
	}


	public int getNumeroLegajo() {
		return numeroLegajo;
	}


	public Domicilio getDomicilio() {
		return domicilio;
	}
	
	
	
	
}
