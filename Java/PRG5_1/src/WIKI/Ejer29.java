package WIKI;

import java.util.Scanner;

public class Ejer29 {

	 public static void main(String[] args) {
	        String [] nombresEmpleados = introduccionNombresEmpleados(4);
	        double [] [] salarioPorEmpleado = introducionSalariosPorEmpleado(4, 3);
	        double [] salarioAcumulado = acumuladoSalarioPorEmpleado (4, 3, salarioPorEmpleado);
	        mostrarTablas(nombresEmpleados, salarioPorEmpleado, salarioAcumulado);
	    }

	    static String [] introduccionNombresEmpleados (int tamanioPlantilla) {
	    	Scanner tec = new Scanner(System.in);
	        String [] nameEmpleados = new String [tamanioPlantilla];
	        for (int empleado = 0; empleado < tamanioPlantilla; empleado++){
	            nameEmpleados [empleado] = tec.next();
	        }
	        return nameEmpleados;
	    }

	    static double [] [] introducionSalariosPorEmpleado (int tamanioPlantilla, int totalMeses) {
	    	Scanner tec = new Scanner(System.in);
	    	double [] [] wageEmpleado = new double [tamanioPlantilla] [totalMeses];
	        for (int empleado = 0; empleado < tamanioPlantilla; empleado++){
	            for (int mes = 0; mes < totalMeses; mes++) 
	                wageEmpleado [empleado] [mes] = tec.nextDouble(); 
	        }
	        return wageEmpleado;
	    }

	    static double [] acumuladoSalarioPorEmpleado (int tamanioPlantilla, int totalMeses, double [] [] salarioPorEmpleado) {
	        double [] wageAcumulado = new double [tamanioPlantilla];
	        for (int empleado = 0; empleado < tamanioPlantilla; empleado++){
	            for (int mes = 0; mes < totalMeses; mes++) 
	                wageAcumulado [empleado] += salarioPorEmpleado [empleado] [mes];
	        }
	        return wageAcumulado;
	    }

	    static void mostrarTablas (String [] nombresEmpleados, double [] [] salarioPorEmpleado, double [] salarioAcumulado) {
	       
	        for (int empleado = 0; empleado < nombresEmpleados.length; empleado++){
	            System.out.print(nombresEmpleados[empleado]);
	            System.out.print("   ");
	            for (int mes = 0; mes < salarioPorEmpleado[0].length; mes++){
	                System.out.print(" ");
	                System.out.print(salarioPorEmpleado [empleado] [mes]);
	            }
	            System.out.print("   ");
	            System.out.print(salarioAcumulado[empleado] + "\n");
	        }
	        
	    }
	    static int maximoGanador(double []salarioAcumulado) {
	    	int acumuladoMax=0,empleadoMax=0;
	    	for(int empleado = 0; empleado<salarioAcumulado.length; empleado++) {
	    		if(salarioAcumulado[empleado]>acumuladoMax) {
	    			empleadoMax=empleado;
	    		}
	    	}
	    	return empleadoMax;
	    }
	}