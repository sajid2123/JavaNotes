package Str;

import java.util.Scanner;

public class Ejer30 {

	public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
	String s;
	int contador=0,p=0;
	s = tec.nextLine().toLowerCase();
	for(int j =0;j<s.length()&&contador!=4;j++) {
		if(s.charAt(j)=='a')
			contador++;
		if(s.charAt(j)=='e')
			contador++;
		if(s.charAt(j)=='i')
			contador++;
		if(s.charAt(j)=='o')
			contador++;
		if(s.charAt(j)=='u')
			contador++;
		if(contador == 4) {
			for(int i = 0;i<s.length();i++) {
				if(s.charAt(i)!=' ') {
					p++;
				}
			}
		}
	}
	System.out.println("Hay " +p+ "Palabras");
	}

}
