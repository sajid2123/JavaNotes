package practica;

public class Racional {
	//Atributos
	private int numerador;
	private int denominador;
	//constructores
	Racional (){
		numerador = 1;
		denominador = 1;
	}
	Racional (int a, int d){
		numerador = a;
		denominador = d;
	}
	//Fin constructores
		public void setNumerador(int n) {
		
		numerador = n;
	}
	public int setDenominador(int d) {
		if (d >=1) {
			denominador = d;
			return denominador;
		}else {
			return 1;
		}
	
		
	}
	
	public double getValor(){
		return numerador/(double)denominador;
	}
	public String toString() {
		return numerador + "/" + denominador + "=" + (double)numerador/denominador;
	}
	public void getMostrar() {
		System.out.println(numerador + "/" + denominador + "=" + numerador/denominador);
	}
	private void simplificar() {
		numerador = numerador/2;
		denominador = denominador/2;
	}
	
	public Racional suma(Racional r) {
		Racional res=new Racional();
		res.setNumerador(numerador*denominador+numerador*r.denominador);
		res.setDenominador(denominador*r.denominador);
		return res;
	}
	public Racional resta(Racional r) {
		Racional res=new Racional();
		res.setNumerador(numerador*denominador-numerador*r.denominador);
		res.setDenominador(denominador*r.denominador);
		return res;
	}
	public Racional multi(Racional r) {
		Racional res=new Racional();
		res.setNumerador(numerador*r.numerador);
		res.setDenominador(denominador*r.denominador);
		return res;
	}
	public Racional dividir(Racional r) {
		Racional res=new Racional();
		res.setNumerador(numerador*r.denominador);
		res.setDenominador(denominador*r.numerador);
		return res;
	}
	
	
		

}
