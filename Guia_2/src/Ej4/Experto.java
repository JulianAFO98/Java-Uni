package Ej4;

public class Experto extends Permanente {
	
	public Experto(String nombre, int numeroLegajo, Domicilio domicilio, int antiguedad, double sueldoBase) {
		super(nombre, numeroLegajo, domicilio, antiguedad, sueldoBase);
	}

	@Override
	public double calcularSueldo() {
		return this.getSueldoBase() + (1.50+(0.015*this.getAntiguedad()));
	}

	@Override
	public String toString() {
		return "Experto: "+ this.getNombre() +" Sueldo: "+ this.calcularSueldo();
	}
	
}
