package Ej4;

public abstract class Permanente extends Empleado{
	
	private int antiguedad;
	private double sueldoBase;
	public Permanente(String nombre, int numeroLegajo, Domicilio domicilio, int antiguedad, double sueldoBase) {
		super(nombre, numeroLegajo, domicilio);
		this.antiguedad = antiguedad;
		this.sueldoBase = sueldoBase;
	}
	
	public abstract  double calcularSueldo();

	public int getAntiguedad() {
		return antiguedad;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}
	
	
	
	
	
}
