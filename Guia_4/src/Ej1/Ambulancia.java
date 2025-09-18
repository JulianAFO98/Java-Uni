package Ej1;

public class Ambulancia extends Vehiculo{

	
	
	public Ambulancia(String patente, String numeroChasis, String numeroMotor) {
		super(patente, numeroChasis, numeroMotor);
	}

	@Override
	public String emiteSonido() {
		
		return "Sirena sonando";
	}

	@Override
	public String toString() {
		return "Ambulancia con patente " + getPatente() + ", numero de chasis " + getNumeroChasis()
				+ ", y numero de moto " + getNumeroMotor() + " hace "+emiteSonido();
	}

	
	
}
