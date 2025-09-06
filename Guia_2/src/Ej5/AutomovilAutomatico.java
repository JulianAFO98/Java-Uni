package Ej5;

public class AutomovilAutomatico extends Automovil{

	public AutomovilAutomatico(String patente) {
		super(patente);
		
	}

	@Override
	public void acelerar(double vel) {
		if (vel>90) {
			this.setMarcha(5);
		}else if (vel > 50) {
			this.setMarcha(4);
		}else if (vel > 35) {
			this.setMarcha(3);
		}else if (vel > 10) {
			this.setMarcha(2);
		}else if (vel > 0) {
			this.setMarcha(1);
		}else {
			this.setMarcha(0);
		}
		
	}

	@Override
	public void frenar(double vel) {
		if (vel>90) {
			this.setMarcha(5);
		}else if (vel > 50) {
			this.setMarcha(4);
		}else if (vel > 35) {
			this.setMarcha(3);
		}else if (vel > 10) {
			this.setMarcha(2);
		}else if (vel > 0) {
			this.setMarcha(1);
		}else {
			this.setMarcha(0);
		}
		
	}

}
