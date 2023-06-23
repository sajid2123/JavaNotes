package Examen;

public class VideoJuego extends Juego{

	private String version;
	private int edad;
	
	public VideoJuego() {
		super();
	}
	

	public VideoJuego(String nombre, String creador, String distribuidor, int anyo,String version,int edad) {
		super(nombre, creador, distribuidor, anyo);
		this.version = version;
		this.edad = edad;
	}
	


	@Override
	public String toString() {
		return "VideoJuego [version=" + version + ", edad=" + edad  + super.toString() + "]";
	}

	
	
	

}
