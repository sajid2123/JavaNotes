/*
 Autor: Sajid Ahmad
*/


package ejercicios;

public class Mcd {

	public static void main(String[] args) {
		
	System.out.println(mcd(8,4));
	}
	
	
	public static int mcd(int a, int b) {
		int res = 0;
		if(b==0)
			res = a;
		else 
			res = mcd(b, a%b);
		return res;
	}

}
