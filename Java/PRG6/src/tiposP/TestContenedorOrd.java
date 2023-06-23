package tiposP;

import Ejercicio2.Empleado;
import Ejercicio2.Figura;

public class TestContenedorOrd {

	public static void main(String[] args) {
	
	ContenedorOrdenador<Empleado> E = new ContenedorOrdenador<Empleado>();
	ContenedorOrdenador<Figura> F = new ContenedorOrdenador<Figura>();
	
	
	Empleado S1 = new Empleado(1200.00);
	Empleado S2 = new Empleado(120.00);
	Empleado S3 = new Empleado(11200.00);
	
	E.inserta(S1);
	E.inserta(S2);
	E.inserta(S3);
	
	System.out.println(E);
	
	
	
	
	
	
	}

}
