package Ej7;

public abstract class Personaje implements IMovible, IHechizable, Comparable<Personaje>,Cloneable{
	protected String nombre;
	protected int vitalidad;
	protected int danio;
	protected Posicion pos;
	protected double distanciaMaximaDeDesplazamiento;

	public Personaje(String nombre, int vitalidad, int danio, Posicion pos, double distanciaMaximaDeDesplazamiento) {
		this.nombre = nombre;
		this.vitalidad = vitalidad;
		this.danio = danio;
		this.pos = pos;
		this.distanciaMaximaDeDesplazamiento = distanciaMaximaDeDesplazamiento;
	}

	public String getNombre() {
		return nombre;
	}

	public int getVitalidad() {
		return vitalidad;
	}

	public Posicion getPos() {
		return pos;
	}

	public int getDanio() {
		return danio;
	}

	@Override
	public void incrementaPos(double valorX, double valorY) throws IncrementoImposibleException {

		if (valorX > this.distanciaMaximaDeDesplazamiento)
			throw new IncrementoImposibleException(this.distanciaMaximaDeDesplazamiento, valorX);

		if (valorY > this.distanciaMaximaDeDesplazamiento)
			throw new IncrementoImposibleException(this.distanciaMaximaDeDesplazamiento, valorY);

		this.pos.incrementaPos(valorX, valorY);
	}

	public void ataca(Personaje p) throws AtaqueImposibleException {
		if (this.getPos().distancia(p.getPos()) > this.distanciaMaximaDeDesplazamiento)
			throw new AtaqueImposibleException(p, this);
		p.recibeDanio(this.danio);
	}

	public abstract void recibeDanio(int cantidad);

	@Override
	public double getPosx() {
		return this.pos.getPosx();
	}

	@Override
	public double getPosy() {
		return this.pos.getPosy();
	}

	@Override
	public double distancia(IMovible m) {
		return this.pos.distancia(m);
	}

	
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Personaje clonado = (Personaje)this.clone();
		clonado.pos = (Posicion) this.pos.clone();
		return clonado;
	}

	@Override
	public int compareTo(Personaje o) {
		int orden = this.getNombre().compareTo(o.getNombre());

		if (orden == 0) {
			if (this.vitalidad > o.vitalidad) {
				orden = 1;
			} else if (this.vitalidad < o.vitalidad) {
				orden = -1;
			}
		}

		return orden;
	}

}
