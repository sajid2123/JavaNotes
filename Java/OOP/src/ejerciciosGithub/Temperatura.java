package ejerciciosGithub;

public class Temperatura {
	private double temperatura;
	
	public Temperatura() {
		temperatura = 0;
	}

	public Temperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public Temperatura(double temperatura, String medida) {
		this.temperatura = temperatura;
		switch(medida) {
			case "celsius":
				this.temperatura = temperatura;
				break;
			case "farenheit":
				this.temperatura = (temperatura -32)*5/9;
		}
	}
	public double getCelsius() {
		return this.temperatura;
	}
	public void setCelsius(double temperatura) {
		this.temperatura = temperatura;
	}
	public double getFarenheit() {
		return (temperatura * 9/5) + 32;
	}
	
	public void setFarenheit(double temperatura) {
		this.temperatura = (temperatura -32) * 9/5;
	}
	
	
	public  double getTemperatura(double temperatura,String medida){
		this.temperatura = temperatura;
		switch(medida) {
			case "celsius":
				this.temperatura = temperatura;
				break;
			case "farenheit":
				this.temperatura = (temperatura -32)*1.8;
		}
		return this.temperatura;
	}
		
	}

