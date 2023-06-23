package Str;

import java.util.Scanner;

public class Ejer26 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String s;
		int contador=1;
		char c,d;
		System.out.println("Dame una frase");
		s = tec.nextLine();
		for(int i=0;i<s.length()-1;i++) {
			c=s.charAt(i);
			d=s.charAt(i+1);
			if(c==' ' && d!=' ')
			contador++;
		}
		System.out.println("Hay " +contador + " Palabras");

	}

}
