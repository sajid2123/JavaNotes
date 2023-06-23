package WIKI;

import java.util.Scanner;

public class Ejer34 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[][][] notas = {{{0, 0}, {1, 6}, {2, 6}},
        {{3, 1}, {3, 7}, {5, 5}},
        {{6, 2}, {7, 8}, {8, 4}},
        {{9, 3}, {8, 9}, {7, 3}}};
       
     mostrar(notas);
     funcion(notas);
        
        
    }
	public static void funcion(int [][][]notas) {
		for(int asig =0;asig < notas[0][0].length;asig++) {
        	System.out.println("Asig: " + asig);
        	double sumaTotal = 0;
            for (int eval = 0; eval < notas[0].length; eval++) {
                System.out.println("Evaluacion " + eval);
                double suma = 0;
                for (int alum = 0; alum < notas.length; alum++) {
                    System.out.println("Alumno " + alum);
                    suma += notas[alum][eval][asig];
                }
                System.out.println("Media: " + suma / notas.length);
                sumaTotal += suma / notas.length;
            }
            System.out.println("Media total: " + sumaTotal / notas[0][0].length);
        }
	}
	public static void mostrar(int [][][]notas) {
		  for (int alum = 0; alum < notas.length; alum++) {
	            System.out.println("Nnotas del alumno: " + alum);
	            for (int eval = 0; eval < notas[alum].length; eval++) {
	                System.out.println("Notas evaluacion: " + eval);
	                for (int asig = 0; asig < notas[alum][eval].length; asig++) {
	                    System.out.println("\t\tAsig." + asig + " : " + notas[alum][eval][asig]);
	                }
	            }
	        }
	        
	}
	
}
