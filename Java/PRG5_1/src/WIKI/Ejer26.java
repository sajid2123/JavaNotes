package WIKI;

import java.util.Scanner;

public class Ejer26 {
	static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
	
	double matriz[][] = matriz(2,3);
	int almacenMaxVentas = almacenMaxVentas(matriz,0);
	System.out.println("Almacen con mas ventas es: " + almacenMaxVentas);
	int mesMax = mesMaxVentas(matriz,3);
	System.out.println("Mes con mas ventas es: " +  mesMax);
	}
	public static double[][] matriz(int a,int b)
	{
	double matriz[][] =new double [a][b];
	for(int i=0;i<matriz.length;i++) {
		System.out.println("Almacen: " + i);
		for(int j=0;j<matriz[0].length;j++) {
			System.out.println("Mes: " + j);
			matriz[i][j] = tec.nextDouble();
		}
	}
	return matriz;
	}
	public static int almacenMaxVentas(double matriz[][],int mes) {
		int almacenMaxVentas=0;
		double maxVentas = matriz[0][mes];
		for(int i=0;i<matriz.length;i++) {
			if(matriz[i][mes] > maxVentas) {
				maxVentas = matriz[i][mes];
				almacenMaxVentas = i;
			}
		}
		
		return almacenMaxVentas;
	}
	public static int mesMaxVentas(double [][]matriz,int numMeses) {
		int suma,k=0;
		int vector[] = new int [numMeses]; 
		for(int i=0;i<matriz[0].length;i++) {
			suma=0;
			for(int j=0;j<matriz.length;j++) {
				suma += matriz[j][i];
			}
			vector[k] = suma;
			System.out.println(vector[k]);
			k++;
		}
		int mesMax=0;
		int pos=0;
		for(int x=0;x<vector.length;x++) {
			if(vector[x]>mesMax) {
				mesMax = vector[x];
				pos = x;
			}
		}
		return pos;
	}
}
