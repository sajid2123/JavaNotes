package practica;

public class Pelicula {
	
	private int codigo;
	private static int proximoCodigo=0;
	
	public Pelicula() {
		codigo = proximoCodigo;
		proximoCodigo++;
	}
	public void mostrar() {
		//System.out.println("Codigo es = " + codigo);
	}
}
