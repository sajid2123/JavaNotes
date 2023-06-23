package ejerciciosGithub;

import java.util.Scanner;

public class testTemperatura {

	public static void main(String[] args) {
	
	Scanner tec = new Scanner (System.in);
	
	
	
	Temperatura temp = new Temperatura(40,"farenheit");
	
	
	System.out.println("Temperatura es " + temp.getCelsius());
	System.out.println("Temperatura es " + temp.getFarenheit());
	
	temp.setFarenheit(100);
	
	
	
	
	
	}

}
