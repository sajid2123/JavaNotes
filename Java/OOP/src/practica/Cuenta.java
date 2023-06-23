package practica;

public class Cuenta {
	//atributos
	private double saldo;
	//constructores
	Cuenta() {
	saldo = 0.0;
	}
	Cuenta(double param) {
	saldo = param;
	}
	public boolean reintegro(double param){
	boolean resultado = false;
		if(param >= saldo){
			saldo = saldo - param;
			resultado = true;
			}
		return resultado;
	}
	public void ingreso(double param)
	{
	 saldo = saldo + param;
	}
	 public double getSaldo(){
	 return saldo;
	}
	public void setSaldo(double param)
	{
	 saldo = param;
	}
}
