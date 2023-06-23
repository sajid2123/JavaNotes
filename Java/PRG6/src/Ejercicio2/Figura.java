package Ejercicio2;

public class Figura implements EsComparable<Figura>{
	
	private int lados;
	

	public Figura(int lados) {
		super();
		this.lados = lados;
	}

	public int getLados() {
		return lados;
	}
	
	@Override
	public String toString() {
		return "Figura [lados=" + lados + "]";
	}

	public void setLados(int lados) {
		this.lados = lados;
	}
	
	public int compara(Figura c) {
		return lados-c.lados;
	}

}
