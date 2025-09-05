package Ej4;

public class Intermedio extends Permanente{

	public Intermedio(String nombre, int numeroLegajo, Domicilio domicilio, int antiguedad, double sueldoBase) {
		super(nombre, numeroLegajo, domicilio, antiguedad, sueldoBase);
	}

	@Override
	public double calcularSueldo() {
		return this.getSueldoBase() + (1.25+(0.01*this.getAntiguedad()));
	}

	@Override
	public String toString() {
		return "Intermedio: "+ this.getNombre() +" Sueldo: "+ this.calcularSueldo();
	}
}
