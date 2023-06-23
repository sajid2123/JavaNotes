package practica;

import java.util.Scanner;

public class testRacional {

	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in);
		System.out.println("Numerador de primera fraccion");
		int n1 = tec.nextInt();
		System.out.println("Denuminaador de primera fraccion");
		int n2 = tec.nextInt();
		System.out.println("Numerador de segunda fraccion");
		int n3 = tec.nextInt();
		System.out.println("Denuminaador de segunda fraccion");
		int n4 = tec.nextInt();
		Racional r1 = new Racional(n1,n2);
		Racional r2 = new Racional(n3,n4);
		Racional r3 = new Racional();
		
		
		menu();
		int menu = tec.nextInt();
		do {
			switch(menu) {
			case 1:
				r3=r1.suma(r2);
				System.out.println("La suma es " + r3);
				
				break;
			case 2:
				r3=r1.resta(r2);
				System.out.println("La resta es " + r3);
				
				break;
			case 3:
				r3=r1.multi(r2);
				System.out.println("La multiplicacion es " + r3);
			
				break;
			case 4:
				r3=r1.dividir(r2);
				System.out.println("La Division es " + r3);
				
				break;
			case 5: 
				System.out.println(r1.toString());
				System.out.println(r2.toString());
				
				
			}
			
			menu();
			menu = tec.nextInt();
			
		}while (menu != 0);
		System.out.println("Se acabo");
			
		}
		

	public static void menu() {
		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Division");
		System.out.println("4.Multiplicacion");
		System.out.println("5.Consulta");
		System.out.println("0.Salir");
		
	}

}
