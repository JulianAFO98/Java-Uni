package Ej7;

public class Mate extends Infusion{

	@Override
	protected void agregarTipoInfusion() {
		System.out.println("Se agrega Yerba al mate");
		
	}

	@Override
	protected void endulzar() {
		System.out.println("La bebida se tomara amarga");

	}

	@Override
	public  void prepararInfusion() {
		System.out.println("Lave el mate ");
        super.prepararInfusion();
        System.out.println("Recalentando el agua");
    } 
	
}
