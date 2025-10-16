package ej1.modelo;

public class CofreMaldito extends Cofre{

	@Override
	public void hechizar(IHechizable h) {
		h.serMaldecido();
	}

}
