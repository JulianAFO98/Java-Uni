package Ej1;

public abstract class Vehiculo implements Emisor_de_Sonido{
	
	private String patente;
	private String numeroChasis;
	private String numeroMotor;
	
	public Vehiculo(String patente, String numeroChasis, String numeroMotor) {
		this.patente = patente;
		this.numeroChasis = numeroChasis;
		this.numeroMotor = numeroMotor;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public void setNumeroChasis(String numeroChasis) {
		this.numeroChasis = numeroChasis;
	}
	public void setNumeroMotor(String numeroMotor) {
		this.numeroMotor = numeroMotor;
	}
	public String getPatente() {
		return patente;
	}
	public String getNumeroChasis() {
		return numeroChasis;
	}
	public String getNumeroMotor() {
		return numeroMotor;
	}
	
	
	
	
}
