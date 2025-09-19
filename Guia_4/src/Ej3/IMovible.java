package Ej3;

public interface IMovible {
	double getPosx();
	double getPosy();
	void setXY(double x, double y);
	void incrementaPos(double valorX, double valorY);
	double distancia(IMovible m);

}
