package WIKI;
/*
 Autor: Sajid Ahmad
 */
import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {
		
	String []vector = leerVector(5);
	
	burbuja(vector);
	mostrar(vector);
	dicotomica(vector);
	}
	public static void dicotomica(String a[]) {
		Scanner tec=new Scanner(System.in);
		int i=0,j=a.length,bandera=0,pos = 0,centro;
		String buscando;
		System.out.println("Dime el nombre Fin(*)");
		buscando = tec.next();
		
		while(!buscando.equals("*")) {
			i=0;
			j=a.length;
			bandera=0;
			while(i<j && bandera==0) {
				centro = (i+j)/2;
				if(a[centro].equals(buscando)) {
					bandera=1;
					pos=centro+1;
				}else if(a[centro].compareTo(buscando)>0)
					j=centro-1;
				else if(a[centro].compareTo(buscando)<0)
					i=centro+1;
		
				}
			if(bandera==0)
				System.out.println("NO ENCONTRADO");
			else 
				System.out.println("ENCONTRADO EN LA POSICION " + pos);
			System.out.println("Dime el nombre Fin(*)");
			buscando = tec.next();
		}
		
		
	}
	public static void burbuja(String []vector) {
		String aux;
		for(int i = 0; i < vector.length-1 ; i++) {
			for(int j = 0; j < (vector.length-1)-i; j++) {
				 if(vector[j].compareTo(vector[j+1]) >0) {
					 aux = vector[j];
					 vector[j] = vector[j+1];
					 vector[j+1] = aux;
					}
			 }
		}
	}
	public static String[] leerVector(int longitud) {
		Scanner tec = new Scanner(System.in);
		
		String vector[] = new String [longitud];
		
		for(int i=0;i<vector.length;i++) {
			System.out.println("Escribe");
			vector[i] = tec.next();
		}
		return vector;
	}
	public static void mostrar(String []vector) {
		for(int i = 0;i<vector.length;i++) {
			System.out.println(vector[i] + ",");
		}
	}
}
