package practica;

import java.util.Scanner;

public class TestCuenta {
	public static void main(String[] args)
	 {
		Scanner tec =new Scanner (System.in);
	     int menu;
	     boolean salir=false;
	     double param=0;
	     Cuenta cuent=new Cuenta();
	     do {
	         System.out.println("Elige: \n 1:Consultar saldo \n 2:Ingreso \n 3:Reintegro \n 0:salir ");
	     menu=tec.nextInt();
	        switch(menu){
	        
	            case 1:
	                System.out.print("Tu saldo es ");
	                System.out.println(cuent.getSaldo());
	               
	                break;
	            case 2:
	                System.out.println("Dime el dinero a ingresar");
	                param= tec.nextDouble();
	                System.out.print("Tu saldo ahora es ");
	                cuent.ingreso(param);
	           
	                break;
	            case 3:
	                System.out.println("Dime cuanto dinero quieres sacar");
	                param= tec.nextDouble();
	               cuent.reintegro(param);
	              
	                break;
	            case 0:
	             salir=true;
	                break;
	        }
	     } while(!salir);
	 }

}
