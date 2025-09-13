package Ej5;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Chofer> choferes = new ArrayList<Chofer>();
    ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    ArrayList<Acoplado> acoplados = new ArrayList<Acoplado>();
    
    
    public Empresa() {
	}

	public  void agregarChofer(Chofer c) {
    	choferes.add(c);
    }
	public  void agregarAcoplado(Acoplado a) {
    	acoplados.add(a);
    }
    
    public  void agregarVehiculo(Vehiculo v) {
    	vehiculos.add(v);
    }
    
    public int contarPorCategoria(String nombreCate) {
    	int cont=0;
    	for (Chofer chofer : choferes) {
			if(chofer.getCategoria().getNombreCategoría().equals(nombreCate))
				cont++;
		}
    	return cont;
    }
    
    public int cuantosSinVehiculo() {
    	int cont=0;
    	for (Chofer chofer : choferes) {
			if(chofer.getVehiculoAsignado() == null)
				cont++;
		}
    	return cont;
    }
    
    public int cuantosVehiculosHay() {
    	return vehiculos.size();
    }
    
    public int cuantosAcoplados() {
    	return acoplados.size();
    }
    
    
    
    
    public ArrayList<Chofer> getChoferes() {
		return choferes;
	}

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public ArrayList<Acoplado> getAcoplados() {
		return acoplados;
	}

	public void detalle() {
    	for (Chofer chofer : choferes) {
			System.out.println(chofer.toString());
		}
    }
    
}
