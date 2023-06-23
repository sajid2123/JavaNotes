package ejerciciosGithub;

public class Convertir {
	
	private double valor;
	
	public Convertir(double valor) {
		this.valor = valor;
	}
	
	public double millasAmetros() {
		return this.valor * 1852;
	}
	public double millasAKilometros() {
		return this.valor *1.852;		
	}

	
	
}
