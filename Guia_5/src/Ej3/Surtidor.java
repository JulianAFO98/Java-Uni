package Ej3;

public class Surtidor {
	private double cantidadDiesel;
	private double cantidadPremium;
	private double cantidadSuper;

	public Surtidor() {
		this.cantidadSuper = 20000;
		this.cantidadPremium = 20000;
		this.cantidadSuper = 20000;
	}

	public double getCantidadDiesel() {
		return cantidadDiesel;
	}

	public double getCantidadPremium() {
		return cantidadPremium;
	}

	public double getCantidadSuper() {
		return cantidadSuper;
	}

	public void llenarDiesel() {
		this.cantidadDiesel = 20000;
	}

	public void llenarPremium() {
		this.cantidadPremium = 20000;
	}

	public void llenarSuper() {
		this.cantidadSuper = 20000;
	}

	public void cargarCombustible(String combustible, double cantidad)
			throws CargaInvalidaException, TipoCombustibleInvalidoException, FaltaCombustibleException {

		double cantidadCombustibleSeleccionado = 0;
		if (cantidad <= 0) {
			throw new CargaInvalidaException("No se pudo cargar un valor negativo o 0", combustible, cantidad, 0);
		}

		if (!esCombustibleValido(combustible)) {
			throw new TipoCombustibleInvalidoException("Ingrese un combustible valido", combustible, cantidad, 0);
		}

		if (combustible.equalsIgnoreCase("diesel"))
			cantidadCombustibleSeleccionado = this.getCantidadDiesel();
		else if (combustible.equalsIgnoreCase("super"))
			cantidadCombustibleSeleccionado = this.getCantidadSuper();
		else if (combustible.equalsIgnoreCase("premium"))
			cantidadCombustibleSeleccionado = this.getCantidadPremium();

		if (cantidadCombustibleSeleccionado - cantidad < 0) {
			throw new FaltaCombustibleException(
					"La cantidad solicitada excede la cantidad actual de combustible en surtidor", combustible,
					cantidad, cantidadCombustibleSeleccionado);
		}

		if (combustible.equalsIgnoreCase("diesel")) {
			this.cantidadDiesel -= cantidad;
		} else if (combustible.equalsIgnoreCase("super")) {
			this.cantidadSuper -= cantidad;
		} else if (combustible.equalsIgnoreCase("premium")) {
			this.cantidadPremium -= cantidad;
		}
	}

	private boolean esCombustibleValido(String combustible) {
		return combustible.equalsIgnoreCase("diesel") || combustible.equalsIgnoreCase("super")
				|| combustible.equalsIgnoreCase("premium");
	}

}
