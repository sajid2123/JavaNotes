package WIKI;

public class Pelicula {

	private String titulo ;
	private String director ;
	private int anyo;
	private int codigo;
	private static int proximoCodigo=0;
	private int genero;
	private static final String [] generos = {
			"Terror" , "Ciencia ficcion " , "Accion", "Suspense", "Comedia" };

	
	
	public Pelicula (String titulo , String director , int anyo,int genero) {
		 this.titulo = titulo ;
		 this.director = director ;
		 this.anyo = anyo;
		 this .genero = genero;
		 codigo = proximoCodigo;
		 proximoCodigo++;
	}
	 public int getAnyo() {
		  return anyo;
	}
	 public void setAnyo(int anyo) {
		 this .anyo = anyo;
	 }
	 public String getDirector () {
		  return director ;
		 }
		  
	public void setDirector (String director ) {
		  this . director = director ;
		  }
		
	 public String getTitulo () {
		  return titulo ;
	 }
	 public void setTitulo (String titulo ) {
		 this . titulo = titulo ;
	 }
	 public int getCodigo() {
		  return codigo;
	 }
	 
	 public String getGeneroComoCadena(){
		 return generos[genero];
	}

	 public String toString (){
		 
		 return "Codigo:"+codigo+"\n"+"Pelicula: "+ titulo +"\n"+"Director : "+director+
		 " \n"+"Anyo: "+anyo+"\n"+"Genero: "+generos[genero]+"\n";
	 }

	 public static void main(String []args) {
		 Pelicula peli1 ,peli2 ;
		 peli1=new Pelicula("2001: Una Odisea en el Espacio","Stanley Kubrick",1968,2);
		 peli2=new Pelicula("2046","Wong Kar Wai",2004,1);
		 System.out.println(peli1.toString());
		 System.out.println(peli2.toString());
		 }

	 }

