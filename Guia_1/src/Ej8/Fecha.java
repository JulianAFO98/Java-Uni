package Ej8;

public class Fecha {
	private int dia,mes,anio;

	public Fecha(int anio,int mes,int dia) {
		this.anio = anio;
		this.mes = mes;
		this.dia = dia;
	}
	
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return anio+"-"+mes+"-"+dia;
	}
	
	
}
