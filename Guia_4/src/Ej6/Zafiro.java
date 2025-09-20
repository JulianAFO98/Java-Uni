package Ej6;

public class Zafiro extends Gema{

	@Override
	public void combinar(Gema g) {
		g.conZafiro();
	}

	@Override
	public void conZafiro() {
		System.out.println("Inundacion");
		
	}

	@Override
	public void conDiamante() {
		System.out.println("Granizo Asesino");
		
	}

	@Override
	public void conRubi() {
		System.out.println("Erupcion Volcanica");
		
	}

	@Override
	public void conEsmeralda() {
		System.out.println("Huracan");
		
	}

}
