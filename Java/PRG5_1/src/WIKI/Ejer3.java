package WIKI;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int a[] = new int[15];
		int n=8;
		
		for(int i=0;i<n;i++) {
			a[i] = tec.nextInt();
		}
		System.out.println("Dime el numero que quieres ingresar");	
		int numbuscar = tec.nextInt();
		int j=0;
		while(j<n && a[j]<numbuscar) {
			j++;
		}
		for(int k = n; k > j;k--) {
			a[k] = a[k-1];
		}
		a[j] = numbuscar;
		n++;

	}
	
	
}		


