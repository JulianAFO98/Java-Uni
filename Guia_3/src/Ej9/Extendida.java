package Ej9;

public class Extendida extends Base {
	
	public String metodo1(Extendida x) {
		return "metodo 1 en claseExtendida, parametro Extendida: " + x.toString();
	}

	public String metodo2(Base y) {
		return "metodo 2 en claseExtendida, parametro Base: " + y.toString();
	}

	@Override
	public String toString() {
		return "soy Extendido";
	}
}
