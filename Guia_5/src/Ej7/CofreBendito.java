package Ej7;

public class CofreBendito extends Cofre{

	@Override
	public void hechizar(IHechizable h) {
		h.serBendecido();
	}

}
