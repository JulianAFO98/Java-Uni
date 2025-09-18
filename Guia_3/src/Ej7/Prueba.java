package Ej7;

public class Prueba {

	public static void main(String[] args) {
		Infusion i1 = new Mate();
		Infusion i2 = new CafeDulce();
		Infusion i3 = new CafeAmargo();
		i1.prepararInfusion();
		i2.prepararInfusion();
		i3.prepararInfusion();
	}

}
