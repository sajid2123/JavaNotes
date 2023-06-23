package WIKI;

import java.util.HashSet;

public class Coleccion2 {

	private HashSet<Pelicula> peliculas;
		
	public Coleccion2(){
	peliculas=new HashSet<Pelicula>();
	}
	
	public boolean add(Pelicula p){
		return peliculas.add(p);
	}

	public String toString (){
		String resultado="";
		for (Pelicula p: peliculas )
		resultado=resultado+p.toString()+"\n";
		return resultado;
	}	
	public static void main(String[] args) {
		 Coleccion2 coleccion=new Coleccion2();
		 coleccion.add(new Pelicula("2001: Una Odisea en el Espacio",
		 "Stanley Kubrick",1968,2));
		 coleccion.add(new Pelicula("2046","Wong Kar Wai",2004,4));
		 System.out.println(coleccion);


	}
}
