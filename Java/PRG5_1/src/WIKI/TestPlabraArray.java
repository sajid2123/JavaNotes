package WIKI;

import java.util.Scanner;

public class TestPlabraArray {
	static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
	Palabra dic[] = new Palabra[100];
	int entrada,n=0;
	String buscar;
	boolean encontrado=false;
	do {
	getMenu();
	entrada = tec.nextInt();
	switch(entrada) {
	case 1: 
		do {
			System.out.println("Dime cuanto quieres llenar [Limte 100]");
			n=tec.nextInt();
			
		}while(n>100);
		insertarDatos(n,dic);
		break;
	case 2: 
		do {
			encontrado = false;
			System.out.println("Diccionario de Ingles" + "\n");
			System.out.println("Escriba la palabra en "
							+ "inglés que quieres traducir o el "
							+ "carácter “*” para volver al menú "
							+ "principal");
			buscar = tec.next();
			for(int i = 0; i < n&& encontrado==false;i++) {
				if(dic[i].getIngles().equalsIgnoreCase(buscar)) {
					System.out.println(dic[i].toString());
					encontrado= true;
				}
					
			}
			if(encontrado==false) {
				System.out.println("Esta palabra no esta en diccionario");
			}	
			System.out.println();
		}while(!buscar.equals("*"));
		
		break;
	case 3:
		do {
			encontrado = false;
			System.out.println("Diccionario de Ingles" + "\n");
			System.out.println("Escriba la palabra en "
							+ "Frances que quieres traducir o el "
							+ "carácter “*” para volver al menú "
							+ "principal");
			buscar = tec.next();
			for(int i = 0; i < n&& encontrado==false;i++) {
				if(dic[i].getFrances().equalsIgnoreCase(buscar)) {
					System.out.println(dic[i].toString());
					encontrado= true;
				}
					
			}
			if(encontrado==false) {
				System.out.println("Esta palabra no esta en diccionario");
			}	
			System.out.println();
		}while(!buscar.equals("*"));
		
		break;
	case 4: 
		do {
			encontrado = false;
			System.out.println("Diccionario de Ingles" + "\n");
			System.out.println("Escriba la palabra en "
							+ "espanyol que quieres traducir o el "
							+ "carácter “*” para volver al menú "
							+ "principal");
			buscar = tec.next();
			for(int i = 0; i < n&& encontrado==false;i++) {
				if(dic[i].getIngles().equalsIgnoreCase(buscar)) {
					System.out.println(dic[i].toString());
					encontrado= true;
				}
					
			}
			if(encontrado==false) {
				System.out.println("Esta palabra no esta en diccionario");
			}	
			System.out.println();
		}while(!buscar.equals("*"));
		
		break;
	}
	}while(entrada!=5);
	}
	
	public static Palabra[] insertarDatos(int n,Palabra[]dic) {
		String ingles,espanyol,frances;
		for(int i=0;i<n;i++) {
			System.out.println("Palabra Ingles");
			ingles = tec.next();
			System.out.println("Palabra Frances");
			frances = tec.next();
			System.out.println("Palabra Espanyol");
			espanyol = tec.next();
			dic[i] = (new Palabra (ingles,frances,espanyol));
		}
		return dic;
		
		
	}
	public static void getMenu() {
		System.out.println("1. Introducir datos");
		System.out.println("2. Diccionario de ingles");
		System.out.println("3. Diccionario de frances");
		System.out.println("4. Diccionario de espanyol");
		System.out.println("5. Terminar");
	}

}



