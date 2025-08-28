package Ej6;

import java.util.ArrayList;

public class Estacion {
	
	private String nombre;
	private ArrayList<Surtidor> surtidores = new ArrayList<Surtidor>();
	
	public Estacion(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarSurtidor(Surtidor s) {
		surtidores.add(s);
	}
	
	public int getCantSurtidores() {
		return surtidores.size();
	}
	
	public int cantLitrosCombustible(int tipoCombustible) {
		int suma = 0;
		switch(tipoCombustible) {
			case 1:
				for (int i = 0; i < surtidores.size(); i++) {
					suma+=surtidores.get(i).getCantGasoil();
				}
				break;
			case 2:
				for (int i = 0; i < surtidores.size(); i++) {
					suma+=surtidores.get(i).getCantPremium();
				}
				break;
			case 3:
				for (int i = 0; i < surtidores.size(); i++) {
					suma+=surtidores.get(i).getCantSuper();
				}
				break;
		}
		return suma;
	}
	
	public int surtidorConMasVentasDeUnTipo(int tipoCombustible) {
		int max = 0;
		int indiceMax = 0;
		switch(tipoCombustible) {
			case 1:
				for (int i = 0; i < surtidores.size(); i++) {
					if(surtidores.get(i).getCantVentasGasoil() > max) {
						max = surtidores.get(i).getCantVentasGasoil();
						indiceMax = i;
					}
						
				}
				break;
			case 2:
				for (int i = 0; i < surtidores.size(); i++) {
					if(surtidores.get(i).getCantVentasPremium() > max) {
						max = surtidores.get(i).getCantVentasPremium();
						indiceMax = i;
					}
						
				}
				break;
			case 3:
				for (int i = 0; i < surtidores.size(); i++) {
					if(surtidores.get(i).getCantVentasSuper()> max) {
						max = surtidores.get(i).getCantVentasSuper();
						indiceMax = i;
					}
						
				}
				break;
		}
		return indiceMax;
	}
	
	public int getHistoricoCombustible(int tipoCombustible) {
		int combustibleSuma=0;
		switch(tipoCombustible) {
			case 1:
				for (int i = 0; i < surtidores.size(); i++) {
					combustibleSuma+=surtidores.get(i).getLitrosHistoricosGasoil();
				}
				break;
			case 2:
				for (int i = 0; i < surtidores.size(); i++) {
					combustibleSuma+=surtidores.get(i).getLitrosHistoricosGasoil();
				}
				break;
			case 3:
				for (int i = 0; i < surtidores.size(); i++) {
					combustibleSuma+=surtidores.get(i).getLitrosHistoricosGasoil();
				}
				break;
		}
		return combustibleSuma;
	}
	
	public int getHistoricoSurtidores(int surtidor) {
		int suma;
		int i = 0;
		while(surtidores.get(i).getId() != surtidor)
			i++;
		suma = 	surtidores.get(i).getLitrosHistoricosGasoil()+
				surtidores.get(i).getLitrosHistoricosPremium()+
				surtidores.get(i).getLitrosHistoricosSuper();
		return suma;
	}
	
	public int getHistoricoEstacion() {
		int suma = 0;
		for (int i = 0; i < surtidores.size(); i++) {
			suma+= 	surtidores.get(i).getLitrosHistoricosGasoil()+
					surtidores.get(i).getLitrosHistoricosPremium()+
					surtidores.get(i).getLitrosHistoricosSuper();
		}
		return suma;
	}
	
	
}
