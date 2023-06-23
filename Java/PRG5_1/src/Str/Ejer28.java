package Str;

import java.util.Scanner;

public class Ejer28 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		String s;
		char c,d;
		s = tec.nextLine();
		StringBuilder sb = new StringBuilder(s);
		for(int i=0;i<s.length()-1;i++) {
			c=s.charAt(i);
			if(c==' ')
				sb.setCharAt(i, '*');
		}
		System.out.println(sb);
	}

}
