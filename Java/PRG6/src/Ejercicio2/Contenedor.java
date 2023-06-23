package Ejercicio2;

import java.util.Vector;

public class Contenedor<T extends EsComparable> {
	
		private Vector<T> datos;
		
		
		public Contenedor() {
			datos= new Vector<T>();
		}
		
		
		public Contenedor(int cap){
			datos= new Vector<T>(cap);
		}
		
		
		private boolean contenedorLleno(){
			if (datos.size()==datos.capacity())
		return true;
		else
		return false;
		}


		
		public boolean anyadeDatoOrdenado(T dato){
		boolean ok=false;
		int i=0;
		while (i<datos.size() && (datos.get(i)).compara(dato)< 0 ){
		i++;
		}
		datos.add(i,dato);
		ok= true;
		return ok;
		}
		
		
		
		public T getDatoPos(int pos){
		T res;
		res= datos.elementAt(pos);
		return res;
		}
		
		
		
		public T obtenerDatoPos(int pos){
		T res;
		res= datos.get(pos);
		return res;
		}
		
		
		
		
		public void eliminarDato(int dato){
			datos.removeElementAt(dato);
		}
		
		
		
		public int numElementos(){
		return datos.size();
		}
		/* (non-Javadoc)
		* @see java.lang.Object#toString()
		*/
		@Override
		public String toString() {
		return "Contenedor [datos=" + datos + "]";
		}
		
				
				
		public boolean buscarDato(T dato){
		boolean esta= false;
		int i=0;
		while ((i<datos.size())&&(datos.elementAt(i)).compara(dato)!=0)
		i++;
		//Elemento esta en el vector
		if (i<datos.size())
		esta= true;
		return esta;
		}
		
		
		
		
		public int buscarDatoPos(T dato){
		int pos=-1;
		int i=0;
		while ((i<datos.size())&& (datos.elementAt(i)).compara(dato)!=0)
		i++;
		//Elemento esta en el vector
		if (i<datos.size())
		pos=i;
		return pos;
		}
}




