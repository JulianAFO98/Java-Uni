package Ej5;

public class Metal extends Material{

	private String nombre;
	public Metal(String nombre,String color) {
		super(color);
		this.nombre = nombre;
	
	}
	@Override
	public String porJoyero() {
		return " fabrico un anillo de "+this.toString();
		
	}
	@Override
	public String porJuguetero() {
		 return " fabrico un muñequito de "+this.toString();
		
	}
	@Override
	public String toString() {
		return  this.nombre +" "+ this.getColor();
	}

}
