package WIKI;

import java.util.Scanner;

public class FilasColumnas {

	public static void main(String[] args) {
		
	Scanner tec = new Scanner(System.in);
	int a[][] = {{2,3,4,6},
				{368,234,6,3},
				{23,43,678,32},
				{2,-34,2,6},
				{68,54,23,56}};
	
	int filaMayor[] = {0};
	int columnaMayor[] = {0};
	int filaMenor[] = {0};
	int columnaMenor[] = {0};
	
	mayor(a,filaMayor,columnaMayor,filaMenor,columnaMenor);
	
	
	}
	
	

	public static void mayor(int a[][],int filaMayor[],int columnaMayor[], int filaMenor[] ,int columnaMenor[] ) {
		
		filaMayor[0]=columnaMayor[0]=filaMenor[0]=columnaMenor[0]=0;
		
		for(int i = 0; i < a.length;i++) {
			for(int j = 0;j< a[i].length;j++) {
				
				if(a[i][j]>a[filaMayor[0]][columnaMayor[0]]) {
					filaMayor[0] = i;
					columnaMayor[0] = j;
				}
					
				if(a[i][j] < a[filaMenor[0]][columnaMenor[0]]) {
					filaMenor[0] = i;
					columnaMenor[0]= j;
			}
			
		}
		
		
	}
		System.out.println("Mayor es: " +a[filaMayor[0]][columnaMayor[0]]) ;
		System.out.println("Menor es: " +a[filaMenor[0]][columnaMenor[0]]);
		System.out.println("Posiciones de mayor son: fila: " + filaMayor[0] + " y columna es: " + columnaMayor[0]);
		System.out.println("Posiciones de menor son: fila: " + filaMenor[0] + " y columna es: " + columnaMenor[0]);

	}
	public static int[][] leerMatriz(int f, int c){
	int [][]matriz = new int[f][c];
	Scanner tec = new Scanner(System.in);
	for(int i=0;i<f;i++) {
		for(int j = 0; j < c;j++) {
			System.out.println("ELemento" + "["+i+"]"+"["+j+"]");
			matriz[f][c] = tec.nextInt();
		}
	}
	return matriz;
	}
	public static void mostrar(int [][]matriz)
	{
		for(int i=0;i<matriz.length;i++) {
			for(int j = 0; j < matriz[i].length;j++) {
				System.out.println();
			
			}
		}
	}

}
