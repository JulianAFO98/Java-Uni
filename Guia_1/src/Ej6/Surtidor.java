package Ej6;

public class Surtidor {
	private int id;
	private static int  contId=0;
	private int cantGasoil;
	private int cantVentasGasoil;
	private int litrosHistoricosGasoil = 0;
	private int cantPremium;
	private int cantVentasPremium;
	private int litrosHistoricosPremium = 0;
	private int cantSuper;
	private int cantVentasSuper;
	private int litrosHistoricosSuper = 0;
	private int maximaCarga;
	
	public Surtidor(int maximaCarga) {
		this.id = ++contId;
		this.maximaCarga = maximaCarga;
		this.cantGasoil = maximaCarga;
		this.cantSuper = maximaCarga;
		this.cantPremium = maximaCarga;
		this.cantVentasGasoil = 0;
		this.cantVentasPremium = 0;
		this.cantVentasSuper = 0;
		this.litrosHistoricosGasoil=0;
		this.litrosHistoricosPremium=0;
		this.litrosHistoricosSuper=0;
	}

	public int getId() {
		return id;
	}
	public int getCantGasoil() {
		return cantGasoil;
	}

	public int getCantPremium() {
		return cantPremium;
	}

	public int getCantSuper() {
		return cantSuper;
	}

	public int getCantVentasGasoil() {
		return cantVentasGasoil;
	}

	public int getCantVentasPremium() {
		return cantVentasPremium;
	}

	public int getCantVentasSuper() {
		return cantVentasSuper;
	}

	void llenarDepositoGasoil() {
		this.cantGasoil = maximaCarga;
	}
	void llenarDepositoPremium() {
		this.cantPremium = maximaCarga;
	}
	void llenarDepositoSuper() {
		this.cantSuper = maximaCarga;
	}
	
	boolean extraerGasoil(int litros) {
		boolean extraer = this.cantGasoil >= litros;
		if(extraer) {
			litrosHistoricosGasoil+=litros;
			this.cantGasoil -= litros;
		}else {
			litrosHistoricosGasoil+=this.cantGasoil;
			this.cantGasoil = 0;
		}
		this.cantVentasGasoil++;
		return extraer;
	}
	
	boolean extraerPremium(int litros) {
		boolean extraer = this.cantPremium >= litros;
		if(extraer) {
			litrosHistoricosPremium+=litros;
			this.cantPremium -= litros;
		}else {
			litrosHistoricosPremium+=this.cantPremium;
			this.cantPremium = 0;
		}
		this.cantVentasPremium++;
		return extraer;
	}
	boolean extraerSuper(int litros) {
		boolean extraer = this.cantSuper >= litros;
		if(extraer) {
			litrosHistoricosSuper+=litros;
			this.cantSuper -= litros;
		}else {
			litrosHistoricosSuper+=this.cantSuper;
			this.cantSuper = 0;
		}
		this.cantVentasSuper++;
		return extraer;
	}

	public  int getLitrosHistoricosGasoil() {
		return litrosHistoricosGasoil;
	}

	public  int getLitrosHistoricosPremium() {
		return litrosHistoricosPremium;
	}

	public  int getLitrosHistoricosSuper() {
		return litrosHistoricosSuper;
	}
	
	
}
