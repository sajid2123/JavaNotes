package Wiki;

import java.io.Serializable;

public class Persona implements Serializable {
	
	private String nombre;
	private String apellido;
	private int telefono;
	public Persona(){
		
	}
	public Persona(String nombre, String apellido, int telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + "]";
	}

}
