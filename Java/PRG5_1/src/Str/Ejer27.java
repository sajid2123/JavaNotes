package Str;

import java.util.Scanner;

public class Ejer27 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String s;
		s = tec.nextLine().toLowerCase();
		int a,e,i,o,u; 
		a=e=i=o=u=0;
		for(int j=0;j<s.length();j++) {
			char c = s.charAt(j);
			if(c=='a')
				a++;
			if(c=='e')
				e++;
			if(c=='i')
				i++;
			if(c=='o')
				o++;
			if(c=='u')
				u++;
		}
		
		System.out.println("Hay " + a + " a");
		System.out.println("Hay " + e + " e");
		System.out.println("Hay " + i + " i");
		System.out.println("Hay " + e + " o");
		System.out.println("Hay " + u + " u");

	}

}
