package Ej5;

public class Chofer {
	private Categoria categoria;
	private String nombre;
	private Domicilio domicilio;
	private Colectivo colectivo=null;
	
	public Chofer(Categoria categoria, String nombre, Domicilio domicilio) {
		this.categoria = categoria;
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	
	
	
	public Colectivo getColectivo() {
		return colectivo;
	}

	public void desvincularColectivo() {
		this.colectivo = null;
	}
	public void setColectivo(Colectivo colectivo) {
		this.colectivo = colectivo;
	}

	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	@Override
	public String toString() {
		String s= "";
		
		s+= "Chofer: " + this.nombre + "Domicilio: "+this.domicilio+" Categoria: "+this.categoria;
		if(this.colectivo != null) {
			s+= "Colectivo: " + this.colectivo;
		}
		
		return s;
	}
	
	
}
