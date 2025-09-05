package Ej4;

public class Principiante extends Permanente{

	
	public Principiante(String nombre, int numeroLegajo, Domicilio domicilio, int antiguedad, double sueldoBase) {
		super(nombre, numeroLegajo, domicilio, antiguedad, sueldoBase);
	
	}

	@Override
	public double calcularSueldo() {
		double sueldo = this.getSueldoBase() * 0.83;
		if(this.getAntiguedad()>=20) {
			sueldo*=1.20;
		}else {
			if(this.getAntiguedad()>=15) {
				sueldo*=1.15;
			}else {
				if(this.getAntiguedad()>=10) {
					sueldo*=1.1;
				}else {
					if(this.getAntiguedad()>=5) {
						sueldo*=1.07;
					}else {
						if(this.getAntiguedad()>=2) {
							sueldo*=1.05;
						}
					}
				}
			}
		}
		return sueldo;
	}

	@Override
	public String toString() {
		return "Principiante: "+ this.getNombre() +" Sueldo: "+ this.calcularSueldo();
	}
	
	
	

}
