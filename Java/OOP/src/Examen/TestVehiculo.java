package Examen;

import java.util.Scanner;

public class TestVehiculo {

	public static void main(String[] args) {
		
		Scanner tec= new Scanner(System.in);
		
		System.out.println("Dime Marca");
		String marca = tec.next();
		
		
		System.out.println("Dime Modelo");
		String modelo = tec.next();
		
		
		System.out.println("Dime Color");
		String color = tec.next();
		
		
		System.out.println("Dime PrecioCompra");
		int precioCompra = tec.nextInt();
		
		
		System.out.println("Dime añoFabricacion");
		int anoFabricacion = tec.nextInt();
		
		
		
		Vehiculo vehiculo1 = new Vehiculo();
		Vehiculo vehiculo2 = new Vehiculo(marca, modelo,color,precioCompra,anoFabricacion);
		Vehiculo copiavehiculo2 = new Vehiculo(vehiculo2);
		
		System.out.println("Vehiculo por defecto");
		vehiculo1.mostrar();
		
		System.out.println("Vehiculo con informacion introducido por teclado");
		vehiculo2.toString();
		
		System.out.println("Vehiculo con la copia");
		copiavehiculo2.mostrar();
		
		System.out.println("Vehiculo valor introducido con setters");
		vehiculo1.setMarca("porche");
		vehiculo1.setModelo("E78");
		vehiculo1.setColor("Rojo");
		vehiculo1.setPrecioCompra(200000);
		vehiculo1.setAnoFabricacion(2001);
		vehiculo1.mostrar();
	}

}
