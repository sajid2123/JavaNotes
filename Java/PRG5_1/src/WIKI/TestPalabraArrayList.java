package WIKI;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPalabraArrayList {

		static Scanner tec = new Scanner(System.in);
		public static void main(String[] args) {
		ArrayList<Palabra> dic = new ArrayList<>();
		int entrada;
		String buscar,p1,p2,p3;
		boolean encontrado=false;
		do {
		getMenu();
		entrada = tec.nextInt();
		switch(entrada) {
		case 1: 
			do {
				System.out.println("Introduzca la palabra en ingles o * para salir");
				p1 = tec.next();
				if(!p1.equals("*")) {
					System.out.println("Introduzca la palabra en frances");
					p2 = tec.next();
					System.out.println("Introduzca la palabra en espanyol");
					p3 = tec.next();
					dic.add(new Palabra(p1,p2,p3));
				}
				
				System.out.println("");
			}while(!p1.equals("*"));
			System.out.println();
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
				for(int i = 0; i < dic.size()&& encontrado==false;i++) {
					if(dic.get(i).getIngles().equalsIgnoreCase(buscar)) {
						System.out.println(dic.get(i).toString());
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
				System.out.println("Diccionario de Frances" + "\n");
				System.out.println("Escriba la palabra en "
								+ "frances que quieres traducir o el "
								+ "carácter “*” para volver al menú "
								+ "principal");
				buscar = tec.next();
				for(int i = 0; i < dic.size()&& encontrado==false;i++) {
					if(dic.get(i).getFrances().equalsIgnoreCase(buscar)) {
						System.out.println(dic.get(i).toString());
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
				System.out.println("Diccionario de Espanyol" + "\n");
				System.out.println("Escriba la palabra en "
								+ "inglés que quieres traducir o el "
								+ "carácter “*” para volver al menú "
								+ "principal");
				buscar = tec.next();
				for(int i = 0; i < dic.size()&& encontrado==false;i++) {
					if(dic.get(i).getEspanyol().equalsIgnoreCase(buscar)) {
						System.out.println(dic.get(i).toString());
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
		public static void getMenu() {
			System.out.println("1. Introducir datos");
			System.out.println("2. Diccionario de ingles");
			System.out.println("3. Diccionario de frances");
			System.out.println("4. Diccionario de espanyol");
			System.out.println("5. Terminar");
		}

	


	}


