package Str;

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		String s;
		s = tec.nextLine();
		vocales(s);
	}
	public static void vocales(String s) {
		int a,e,i,o,u; 
		a=e=i=o=u=0;
		for(int j=0;j<s.length();j++) {
			if(s.charAt(j)=='a')
				a++;
			if(s.charAt(j)=='e')
				e++;
			if(s.charAt(j)=='i')
				i++;
			if(s.charAt(j)=='o')
				o++;
			if(s.charAt(j)=='u')
				u++;
		}
		System.out.println(a + asteriscos(a) + "a");
		System.out.println(e + asteriscos(e) + "e");
		System.out.println(i + asteriscos(i) + "i");
		System.out.println(e + asteriscos(o) + "o");
		System.out.println(u + asteriscos(u) + "u");
	}
	public static String asteriscos(int x) {
		String s="";
		for(int i=0;i<x;i++) {
			s+='*';
		}
		return s;
		
	}

}
