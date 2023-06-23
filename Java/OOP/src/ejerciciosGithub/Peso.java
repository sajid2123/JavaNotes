package ejerciciosGithub;

public class Peso {

	private double peso;//kg
	
	public Peso(double peso, String medida) {
		this.peso = peso;
		switch(medida) {
		 case "Lb":
	            this.peso = peso * 0.453;     
	                break;
	                case "Li": 
	            this.peso = peso * 14.59;     
	                break;
	                case "Oz": 
	            this.peso = peso * 0.0283;     
	                break;
	                case "P": 
	            this.peso = peso * 0.00155;     
	                break;
	                case "K": 
	            this.peso = peso;   
	                break;
	                case "G": 
	            this.peso = peso/1000;     
	                break;
	                case "Q": 
	            this.peso = peso * 43.3;     
	                break;   
		}
	}
	public double getLibras() {
		return this.peso / 0.453;
	}
	public double getLingotes() {
		return this.peso/14.59;
	}
	
}
