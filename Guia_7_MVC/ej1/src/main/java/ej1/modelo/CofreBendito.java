package ej1.modelo;

public class CofreBendito extends Cofre{

	@Override
	public void hechizar(IHechizable h) {
		h.serBendecido();
	}

}
