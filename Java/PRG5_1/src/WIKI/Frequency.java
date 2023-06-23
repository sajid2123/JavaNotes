package WIKI;

public class Frequency {

	public static void main(String[] args) {
	int a[] = {2,3,43,52,2,6,43,7};
	contar(a,43);
	}
	public static void contar(int a[],int buscando) {
		int i,contador=0;
		for(i=0;i<a.length;i++) {
			if(a[i]==buscando)
				contador++;
		}
		if(contador >= 0)
		System.out.println("El numero se ha encontrado y la frecuencia es " + contador  );
		else 
		System.out.println("No se ha encontrado el numero");
		
	}
	
}
