package ejerciciosGithub;

public class Consumo {

	private double kms;
	private double litros;
	private double vmed;
	private double pgas;
	
	
	public Consumo(double kms, double litros,double vmed,double pgas) {
		this.kms = kms;
		this.litros = litros;
		this.vmed = vmed;
		this.pgas = pgas;
	}
	
	
	public void setKms(double kms) {
		this.kms = kms;
	}

	
	public void setLitros(double litros) {
		this.litros = litros;
	}

	

	public void setVmed(double vmed) {
		this.vmed = vmed;
	}

	

	public void setPgas(double pgas) {
		this.pgas = pgas;
	}

	public String getTiempo() {
		return "Tiempo en horas son " +this.kms / this.vmed;
	}
	public double consumoMedio() {
		return  litros * 100 / kms;
	}
	public double consumoEuros() {
		return consumoMedio() * this.pgas;
	}
	
	
}
