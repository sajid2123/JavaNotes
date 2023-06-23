package ejerciciosGithub;

public class Numero {
	private int numero;
	
	public Numero() {
		this.numero = 0;
	}
	public Numero(int numero) {
		this.numero = numero;
	}
	public void aniade(int aniadeValor) {
		this.numero += aniadeValor;
	}
	public void resta(int restaValor) {
		this.numero -= restaValor;
	}
	public int getValor() {
		return numero;
	}
	public int getDoble() {
		return this.numero * 2;
	}
	public int getTriple() {
		return this.numero *3;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
