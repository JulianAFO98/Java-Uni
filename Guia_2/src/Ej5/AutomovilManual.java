package Ej5;

public class AutomovilManual extends Automovil{

	public AutomovilManual(String patente,double velocidadMaxima) {
		super(patente,velocidadMaxima);
	}
	
	public AutomovilManual(String patente) {
		super(patente);
	}
	
	

	@Override
	public void acelerar(double vel) {
		if(vel>=0 && (this.velocidad+vel <= this.velocidadMaxima)) {
			this.velocidad+=vel;
		}
		
	}

	@Override
	public void frenar(double vel) {
		if(vel>=0 && (this.velocidad-vel >=0)) {
			this.velocidad-=vel;
		}
		
	}

}
