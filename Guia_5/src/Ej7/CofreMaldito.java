package Ej7;

public class CofreMaldito extends Cofre{

	@Override
	public void hechizar(IHechizable h) {
		h.serMaldecido();
	}

}
