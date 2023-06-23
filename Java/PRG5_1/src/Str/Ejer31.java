package Str;

import java.util.Scanner;

public class Ejer31 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String s;
		s = tec.nextLine();
		StringBuilder sb= new StringBuilder();
	     
	     for (int i = s.length() - 1; i >= 0; i--) {
	    	   sb.append(s.charAt(i)); 
	     }
	     System.out.println(sb);

	}

}
