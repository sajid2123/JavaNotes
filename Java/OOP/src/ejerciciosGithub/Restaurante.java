package ejerciciosGithub;

public class Restaurante {
	
	
	private double papas;
	private double choco;

	
	public Restaurante() {
		this.choco = 0;
		this.papas = 0;
	}
	public Restaurante(double papas, double choco) {
		if (papas >= 0 &&choco >=0) {
			this.papas = papas;
			this.choco = choco;
		}else {
			papas=choco=0;
		}
		
	}
	
	
	public double getPapas() {
		return papas;
	}
	public double getChoco() {
		return choco;
	}
	public void setPapas(double papas) {
		this.papas = papas;
	}
	public void setChoco(double choco) {
		this.choco = choco;
	}
	public void addPapas(int papasin) {
		papas += papasin;
	}
	public void addChoco(double chocoin) {
		choco +=chocoin;
	}
	public void showPapas() {
		System.out.println("Tenemos " + papas + " Papas en el Almacen ");
	}
	public void showChoco() {
		System.out.println("Tenemos " + choco + " Chocos en el Almacen ");
	}
	public int getCientes() {
		int Clientes=0;
		int contador=0;
		while(this.papas>= 1 && this.choco>= 0.5){
			this.papas = this.papas - 1;
			this.choco = this.choco - 0.5;
			contador++;
		}
		Clientes = contador *3;
		return Clientes;
	}
}
