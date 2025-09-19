package Ej5;

public class Madera extends Material{

	private String tipo;
	
	public Madera(String tipo,String color) {
		super(color);
		this.tipo = tipo;
	
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
		return  tipo +" "+ this.getColor();
	}
	
	
}
