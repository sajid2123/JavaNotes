/*
 Autor:Sajid Ahmad
 * */
package ejercicios;

public class Pez implements Cloneable {
	
	
	protected String nombre;
	private static int numpeces = 0;
	
	
	public Pez(String nombre) {
		this.nombre = nombre;
		numpeces++;
	}
	public Pez(Pez p) {
		this.nombre = p.nombre;
		numpeces++;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	 protected Object clone()
		        throws CloneNotSupportedException
		    {
		        return super.clone();
		    }
	 @Override
		public String toString() {
			return "Pez [nombre=" + nombre + "numpeces="+numpeces+"]";
		}
	public boolean equals(Object o){
        if (o == this.nombre) {
           return true;
        } else {
            return false;
        }
        
        
	}}
