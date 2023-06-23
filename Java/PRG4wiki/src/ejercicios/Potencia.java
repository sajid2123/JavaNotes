package ejercicios;

public class Potencia {

	public static void main(String[] args) {
		
		System.out.println(potencia(2,3));

	}
	public static int potencia(int base, int exp) {
		int res = 0;
		if (exp == 0)
			res = 1;
		else 
			res = base* potencia(base,exp-1);
		return res;
	}

}
