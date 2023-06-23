package Str;

import java.util.Scanner;

public class Ejer25 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Dame una palabra");
		String s;
		s = tec.next();
		int i=0,j=s.length()-1,bandera=0;
		while(i<j&&bandera==0) {
			if(s.charAt(i)!=s.charAt(j))
				bandera=1;
		i++;
		j--;	
		}
		if(bandera == 0) {
			System.out.println("Palindrome");
		}else {
			System.out.println("NO palindrome");
		}

	}

}
