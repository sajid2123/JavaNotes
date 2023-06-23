/*
 Autor: Sajid Ahmad
 */
package ejercicios;

public class SumaDigitos {

	public static void main(String[] args) {
		
		System.out.println(suma(1234));
	}
	public static int suma(int n) {
		int res = 0;
		if(n==0)
			res = 0;
		else
			res = n%10 + suma(n/10);
		return res;
	}
}
