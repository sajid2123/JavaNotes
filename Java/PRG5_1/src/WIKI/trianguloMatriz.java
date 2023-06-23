package WIKI;

import java.util.Scanner;

public class trianguloMatriz {

	public static void main(String[] args) {
	
	int matriz[][] = leerTriangular(5);
	mostrar(matriz);
	}
	public static int[][]leerTriangular(int filas){
        Scanner tec = new Scanner(System.in);
        int matriz[][] = new int[filas][];
        for (int i = 0; i < filas; i++) {
           matriz[i] = new int [i+1]; 
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = tec.nextInt();
            }
        }
        return matriz;
    }
	public static void mostrar(int [][]matriz)
	{
		for(int i=0;i<matriz.length;i++) {
			for(int j = 0; j < matriz[i].length;j++) {
				System.out.print(matriz[i][j]);
			
			}
			System.out.println();
		}
	}
}
