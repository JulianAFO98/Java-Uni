package ej1.modelo;


public interface IMovible {
	double getPosx();
	double getPosy();
	void incrementaPos(double valorX, double valorY) throws IncrementoImposibleException;
	double distancia(IMovible m);

}
