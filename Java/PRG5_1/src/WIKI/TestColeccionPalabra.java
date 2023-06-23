package WIKI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestColeccionPalabra {
	public static void main(String []args) {
		Scanner tec = new Scanner(System.in);
		ColeccionPalabra c = new ColeccionPalabra();
		int entrada,seguir;
		String ingles,frances,espanyol,dic,palabraBuscada,palabraAnt,palabraNueva;
		
		
		
		
		do {
			getMenu();
			entrada=tec.nextInt();
			switch(entrada) {
			case 1:
				do {
					System.out.println("Ingles");
					ingles=tec.next();
					System.out.println("Frances");
					frances=tec.next();
					System.out.println("Espanyol");
					espanyol=tec.next();
					c.addPalabra(ingles, frances, espanyol);
					System.out.println("¿Quieres Seguir? Fin=0");
					seguir=tec.nextInt();
				}while(seguir!=0);
			
				break;
			case 2:
				do {
					System.out.println("En que idioma quieres buscar");
					dic=tec.next();
					System.out.println("Palabra que quieres buscar");
					palabraBuscada=tec.next();
					c.buscar(dic, palabraBuscada);
					System.out.println("Quieres seguir 'Fin=0'");
					seguir=tec.nextInt();
				}while(seguir!=0);
				break;
			case 3:
				do {
					System.out.println("En que idioma quieres cambiar la palabra");
					dic=tec.next();
					System.out.println("Palabra que Antigua");
					palabraAnt=tec.next();
					System.out.println("Palabra Nueva");
					palabraNueva = tec.next();
					c.modificar(dic, palabraAnt, palabraNueva);
					System.out.println("Quieres seguir 'Fin=0'");
					seguir=tec.nextInt();
				}while(seguir!=0);
				break;
			case 4:
				do {
					
					System.out.println("Palabra que quieres eliminar");
					palabraBuscada=tec.next();
					System.out.println("En que idioma es la palabra");
					dic=tec.next();
					c.eliminar(dic, palabraBuscada);
					System.out.println("Quieres seguir 'Fin=0'");
					seguir=tec.nextInt();
				}while(seguir!=0);
				
				break;
			case 5:
				System.out.println(c.toString());

				break;
			}
		}while(entrada!=0);
	
		
		
	}
	
	public static void getMenu() {
		System.out.println("1.Add");
		System.out.println("2.Buscar");
		System.out.println("3.Modificar");
		System.out.println("4.Eliminar");
		System.out.println("5.Mostrar");
		System.out.println("0.Salir");
		
	}

}
