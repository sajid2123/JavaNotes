package tiposP;

import java.util.Arrays;

import Ejercicio2.EsComparable;

public class ContenedorOrdenador<T extends EsComparable> {
	private T[]datos;
	private  int n;
	private final int N=10;
	
	public ContenedorOrdenador() {
		n=0;
		datos = (T[]) new EsComparable[N];
	}
	
	public void inserta (T d){
	int i = 0;
	while ((i<n) && (datos[i].compara(d)<0)) {
		i++;
	}
	 if(i<N) {
		 for(int j=n;j>i;j--) {
			 datos[j]=datos[j-1]; 
		 }
		 datos[i]=d;
		 n++;
	 }
	
	}

	@Override
	public String toString() {
		String cadena = "";
		for(int i=0;i<n;i++) {
			cadena += datos[i] + "\n";
		}
		return cadena;
	}
	
}
