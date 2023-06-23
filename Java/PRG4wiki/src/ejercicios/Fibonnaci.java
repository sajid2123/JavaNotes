package ejercicios;

public class Fibonnaci {
	
	
	 public static void main(String[]args) {
		 
		 
		 System.out.println(fibonacci(6));
	 }
	 
	 
	 
	 
	 public static  int fibonacci(int n) {
		 int res = 0;
			if (n == 0 || n == 1) 
				res = n;
	         else 
	        	 res = fibonacci(n - 1) + fibonacci(n - 2);
			return res;
		}
}
