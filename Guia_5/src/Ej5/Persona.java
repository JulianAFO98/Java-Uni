package Ej5;

public class Persona implements Cloneable{
	private int dni;
	private String apellido;
	private Domicilio domicilio;
	private int legajo;
	private Animal mascota;
	
	
	
	public Persona(int dni, String apellido, Domicilio domicilio, int legajo, Animal mascota) {
		super();
		this.dni = dni;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.legajo = legajo;
		this.mascota = mascota;
	}

	
	public Animal getMascota() {
		return mascota;
	}


	public void setMascota(Animal mascota) {
		this.mascota = mascota;
	}


	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Persona clonado = (Persona)super.clone();
		clonado.domicilio = (Domicilio)this.domicilio.clone();
		clonado.mascota = (Animal)this.mascota.clone();
		return super.clone();
	}


	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", apellido=" + apellido + ", domicilio=" + domicilio + ", legajo=" + legajo
				+ ", mascota=" + mascota + "]";
	}

	
	
	
	
	
}
