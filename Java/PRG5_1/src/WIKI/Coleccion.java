package WIKI;

public class Coleccion {
	
	private Pelicula [] peliculas ;
	private static final int MAX=100;
	private int posicionActual=0;
	public Coleccion(){
		peliculas=new Pelicula[MAX];
	}

	 public boolean add(Pelicula p){
		 if (posicionActual<MAX) {
			 peliculas [posicionActual]=p;
		 	 posicionActual++;
		 	 return true;
		 } else {
			 return false;
		 }
	 }
	 public String toString (){
		 String resultado="";
		 for ( int i=0;i<posicionActual;i++)
		  resultado=resultado+peliculas[i ]. toString ()+" \n";
		 return resultado;
		 
	 }
	
	public static void main(String[] args) {
		Coleccion coleccion=new Coleccion();
		coleccion.add(new Pelicula("2001: Una Odisea en el Espacio","Stanley Kubrick",1968,
		1));
		coleccion.add(new Pelicula("2046","Wong Kar Wai",2004,4));
		System.out.println(coleccion.toString());
	}
	}


