package Ej7;

public abstract class Cafe extends Infusion{

	@Override
	protected void agregarTipoInfusion() {
		System.out.println("Se agrega cafe molido a la taza");
		
	}

	//preguntar
	@Override
	protected abstract void endulzar();
	

}
