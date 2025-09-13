package Ej5;

public abstract class Categoria {
	private String nombreCategoría;
	private double sueldo;
	private boolean habilitaColectivoLinea;
	private boolean habilitaColectivoLarga;
	private boolean habilitaCamion;
	public Categoria(String nombreCategoría, double sueldo, boolean habilitaColectivoLinea,
			boolean habilitaColectivoLarga, boolean habilitaCamion) {
		
		this.nombreCategoría = nombreCategoría;
		this.sueldo = sueldo;
		this.habilitaColectivoLinea = habilitaColectivoLinea;
		this.habilitaColectivoLarga = habilitaColectivoLarga;
		this.habilitaCamion = habilitaCamion;
	}
	public String getNombreCategoría() {
		return nombreCategoría;
	}
	public double getSueldo() {
		return sueldo;
	}
	public boolean isHabilitaColectivoLinea() {
		return habilitaColectivoLinea;
	}
	public boolean isHabilitaColectivoLarga() {
		return habilitaColectivoLarga;
	}
	public boolean isHabilitaCamion() {
		return habilitaCamion;
	}
	@Override
	public String toString() {
		return  nombreCategoría;
	}

	
	
	
}


