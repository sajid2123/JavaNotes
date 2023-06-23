package WIKI;

import java.util.Scanner;

public class Ejer35 {

	public static void main(String[] args) {
		
	Scanner tec=new Scanner(System.in);
	int [][][]a = {{{0,0},{1,6},{2,6}},{{3,1},{4,7},{5,5}},{{6,2},{7,8},{8,4}},{{9,3},{8,9},{7,3}}};	
		
	int entrada;
	do {
		getMenu();
		entrada = tec.nextInt();
	switch(entrada) {
	case 1: 
		opcionUno(a);
		break;
	case 2: 
		opcionDos(a);
		break;
	case 3: 
		opcionTres(a);
		break;
	case 4: 
		opcionCuatro(a);
		break;
	case 5: 
		opcionCinco(a);
		break;
	}
	
		
	}while(entrada != 0);
	
	
	
	}
	public static void opcionUno(int [][][]a) {
	
		for(int i=0;i <a[0].length;i++) {
			System.out.println("Evaluacion" + (i) );
			for(int j=0; j<a.length;j++) {
				System.out.println("Alumno" + (j));
				for(int k=0; k<a[0][0].length;k++){
					System.out.println("Asig" + (k) + ": " + a[j][i][k]);
					
				}
			}
			
		}
	}
	public static void opcionDos(int [][][]a) {
		
		for(int i=0;i <a.length;i++) {
			System.out.println("Alumno" + (i) );
			for(int j=0; j<a[0][0].length;j++) {
				System.out.println("Asig" + (j));
				for(int k=0; k<a[0].length;k++){
					System.out.println("Evaluacion" + (k) + ": " + a[i][k][j]);
					
				}
			}
			
		}
	}
	public static void opcionTres(int [][][]a) {
		int alumno = 2;
		int evaluacion = 1;
		System.out.println("Alumno: " + alumno);
		System.out.println("Evaluacion: " + evaluacion);
				for(int k=0; k<a[0][0].length;k++){
					System.out.println("Asignatura" + (k) + ": " + a[alumno][evaluacion][k]);
					
				}
			
			
		
	}
	public static void opcionCuatro(int [][][]a) {
		
		int asignatura = 0;
		int evaluacion = 2;
		System.out.println("Evaluacion: " + evaluacion);
		System.out.println("Asignatura: " + asignatura);
				for(int k=0; k<a.length;k++){
					System.out.println("Alumno" + (k) + ": " + a[k][evaluacion][asignatura]);
					
				}
}
	public static void opcionCinco(int [][][]a) {
		int asignatura = 1;
		int alumno = 1;
		System.out.println("Alumno: " + alumno);
		System.out.println("Asignatura: " + asignatura);
				for(int k=0; k<a[0].length;k++){
					System.out.println("Evaluacion" + (k) + ": " + a[alumno][k][asignatura]);
					
				}
}
	public static void getMenu() {
		System.out.println("1. Por columnas, filas y profundidad");
		System.out.println("2. Por filas, profundidad y columna");
		System.out.println("3. Para mostrar las notas de todas asignaturas del alumno 2, en la evaluación 1");
		System.out.println("4. Para mostrar las notas de todos alumnos en la evaluación 2, en la asignatura 0");
		System.out.println("5. Para mostrar las notas de todas evaluaciones del alumno 1 en la asignatura1.");
		System.out.println("0. Salir");
	}

	
}
