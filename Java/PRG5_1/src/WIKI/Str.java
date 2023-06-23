package WIKI;

import java.util.Scanner;

public class Str {

	public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);
	
	/*No admite espacios
	name = tec.next();
	*/
	
	/*admite espacios
	name = tec.nextLine();
	System.out.println(name);
	*/
	
	
	/*
	String name = "Sajid";
	String lastName = "Ahmad";
	String fullName = name +" "+ lastName;
	System.out.println(fullName);
	//Sajid Ahmad
	*/
	
	
	//length
	String name = "Sajid";
	System.out.println(name.length());
	//5
	
	//CharAt() te devuelve un caracter en una posicion indicada
	System.out.println(name.charAt(0));
	//S
	
	//comapreTo()
	String  s1 ="hello";
	String  s2 ="hello";
	/*
	 s1 > s2 : devuelve valor +positivo
	 s1 = s1 : 0
	 s1 < s2 : devuelve valor -negativo  
	 */
	System.out.println(s1.compareTo(s2));
	//0
	
	//replace 
	String s = s1.replace('h', 'p');
	System.out.println(s);
	
	//subString
	String frase = "Soy genio";
	String subcad = frase.substring(0,6);
	System.out.println(subcad);
	//Soy ge
	//Si no le indicamos la final coge el ultimo index como final
	String sub = frase.substring(4);
	System.out.println(sub);
	//genio
	
	}

}
