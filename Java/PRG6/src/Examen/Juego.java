package Examen;

public class Juego implements EsComparable<Juego> {
	private String nombre;
	private String creador;
	private String distribuidor;
	private int anyo;
	
	public Juego() {
		
	}
	public Juego(String nombre, String creador, String distribuidor, int anyo) {
		super();
		this.nombre = nombre;
		this.creador = creador;
		this.distribuidor = distribuidor;
		this.anyo = anyo;
	}


	public String getNombre() {
		return nombre;
	}


	public String getCreador() {
		return creador;
	}


	public String getDistribuidor() {
		return distribuidor;
	}


	public int getAnyo() {
		return anyo;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setCreador(String creador) {
		this.creador = creador;
	}


	public void setDistribuidor(String distribuidor) {
		this.distribuidor = distribuidor;
	}


	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	
	@Override
	public boolean mayorQue(Juego t) {
		boolean mayor=false;
		if(anyo>t.anyo) {
			mayor=true;
		}
		return mayor;
	}
	

	@Override
	public boolean equals(Object t) {
		Juego j= (Juego)t;
		boolean equals=false;
		if(nombre.equalsIgnoreCase(j.nombre)) {
			if(creador.equalsIgnoreCase(j.creador)) {
				if(distribuidor.equalsIgnoreCase(j.distribuidor)) {
					if(anyo==j.anyo) {
						equals=true;
					}
				}
			}
		}
		return equals;
	}


	@Override
	public String toString() {
		return "Juego [nombre=" + nombre + ", creador=" + creador + ", distribuidor=" + distribuidor + ", anyo=" + anyo
				+ "]";
	}


	

}
