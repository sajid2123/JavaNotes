package Ejercicio2;

public class Empleado implements EsComparable<Empleado>{

	private double sueldo;
	
	public Empleado(double sueldo) {
		super();
		this.sueldo = sueldo;
	}
	
	public int compara(Empleado c) {
		return (int) (sueldo-c.sueldo);
	}


	@Override
	public String toString() {
		return "Empleado [sueldo=" + getSueldo() + "]";
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	

}
