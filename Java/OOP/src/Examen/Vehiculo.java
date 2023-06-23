package Examen;

public class Vehiculo {
	
	private int matricula;
	private String marca;
	private String modelo;
	private String color;
	private int precioCompra;
	private int anoFabricacion;
	
	//Constructor por defecto
	
	public Vehiculo() {
		matricula = 0;
		marca = "";
		modelo = "";
		color = "";
		precioCompra = 0;
		anoFabricacion = 0;
	}
	//Constructor con argumentos
	public Vehiculo(String marca, String modelo, String color, int precioCompra,int anoFabricacion) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precioCompra = precioCompra;
		this.anoFabricacion = anoFabricacion;
	}
	//Constructor de copia
	public Vehiculo(Vehiculo v) {
		this.marca = v.marca;
		this.modelo = v.modelo;
		this.color = v.color;
		this.precioCompra = v.precioCompra;
		this.anoFabricacion = v.anoFabricacion;
	}
	//Setters

	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setColor(String Color) {
		this.color = color;
	}
	public void setPrecioCompra(int precioCompra) {
		this.precioCompra = precioCompra;
	}
	public void setAnoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}
	//Metodo Mostrar
	public void mostrar() {
		System.out.println("Informacion de la Vehiculo:\n"
                			+ "Matricula: " + matricula + "\n"
                			+ "Marca: " + marca + "\n"
                			+ "Modelo: " + modelo+ "\n"
                			+ "Color: " + color + "\n"
                			+ "PrecioCompra: " + precioCompra+ "\n"
                			+ "anoFabricacion: " + anoFabricacion + " \n"
							+ "ValorActual: " + valorActual() + " \n");
	}
	//Metodo toString 
	public String toString() {
		return "Informacion de la Vehiculo:\n"
                + "Matricula: " + matricula + "\n"
                + "Marca: " + marca + "\n"
                + "Modelo: " + modelo+ "\n"
                + "Color: " + color + "\n"
                + "PrecioCompra: " + precioCompra+ "\n"
                + "anoFabricacion: " + anoFabricacion + " \n"
				+ "ValorActual: " + valorActual() + " \n";
	}
	//Metodo matricula
	public void generarMatricula() {
		
	}
	//Metodo Valor Actual
	public float valorActual() {
		float anosdeUso = 2022-anoFabricacion;
		float precio = 0;
		
		if(anosdeUso < 1) {
			precio = precioCompra;
		}else if  (anosdeUso < 2){
			precio = precioCompra*84 /100;
		}else if (anosdeUso < 3) {
			precio = precioCompra*67 /100;
		}else if (anosdeUso < 4) {
			precio = precioCompra * 56/100;
		}
		//No le he puesto todos los argumentos
			
		return precio;
	}
	//Metodo antiguedad
	/*
	public int relacion(Vehiculo v) {
		return;
	}
	*/
}
