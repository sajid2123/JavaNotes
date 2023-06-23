package WIKI;

public class Ejer_6 {

	public static void main(String[] args) {
		final int  N = 10;
		int n = 535321312;
        int [] Num = new int [N];
        int i=0;
        
        while(i<N &&n>0) {
            Num [i] = n % 10;
            n /= 10;
            i++;
        }
        if(n > 0)
        	System.out.println("El numero es mayor que diez");
        else {
        	 int j = i-1;
             i = 0;
             while(i < j && Num[i] == Num [j]) {
                 i++;
                 j--;
             }
             if(i >= j) System.out.println("El numero es capicua.");
             else System.out.println("El numero no es capicua.");
        }
       

        
        

	}

}
