package Str;

import java.util.Scanner;

	public class Ejer1 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String s;
		int vocales=0;
		s = tec.nextLine().toUpperCase();
		for(int i = 0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c == 'A' || c == 'E' || c == 'O' || c == 'I' || c == 'U' ) {
				vocales++;
			}
				
		}
		
		System.out.println("Hay " + vocales + " Vocales");

	}

}
