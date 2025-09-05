package Ej4;

public class Temporario extends Empleado{
	
	private double sueldoPorHora;
	private int horasTrabajadas;
	
	public Temporario(String nombre, int numeroLegajo, Domicilio domicilio,double sueldoPorHora,int horasTrabajas) {
		super(nombre, numeroLegajo, domicilio);
		this.sueldoPorHora = sueldoPorHora;
		this.horasTrabajadas = horasTrabajas;
	}

	@Override
	public String toString() {
		return "Temporario:" + this.getNombre() + " Sueldo: "+ this.horasTrabajadas*this.sueldoPorHora;
	}
	
	
	
}
