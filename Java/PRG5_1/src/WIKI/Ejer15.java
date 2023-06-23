package WIKI;


/*
 Autor: Sajid Ahmad
 */
import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {
		
	String vector[] = leerVector(5);
	mostrar(vector);
	busquedaNom(vector);
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
	public static void busquedaNom(String []vector) {
		Scanner tec = new Scanner(System.in);
		
		
		boolean encontrado = false;
		String buscar;
		System.out.println("Escribe el nombre que quieres buscar Fin=(*)");
		buscar = tec.next();
		
		while(!buscar.equals("*")) {
			encontrado = false;
			
			for(int i = 0; i<vector.length;i++) {
				if(vector[i].equalsIgnoreCase(buscar)) 
					encontrado = true;
			}
		if(encontrado == true)
			System.out.println("El nombre esta");
		else
			System.out.println("El nombre no esta");
		System.out.println("Escribe el nombre que quieres buscar Fin=(*)");
		buscar = tec.next();
		}	
	}
	public static void mostrar(String []vector) {
		for(int i = 0;i<vector.length;i++) {
			System.out.println(vector[i] + ",");
		}
	}
}
