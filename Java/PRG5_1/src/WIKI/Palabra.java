package WIKI;

public class Palabra {
	private String ingles;
	private String frances;
	private String espanyol;
	
	public Palabra(String ingles,String frances,String espanyol) {
		this.espanyol = espanyol;
		this.frances = frances;
		this.ingles = ingles;
	}
	public String getIngles() {
		return ingles;
	}
	public String getFrances() {
		return frances;
	}
	public String getEspanyol() {
		return espanyol;
	}

	@Override
	public String toString() {
		return "Palabra [ingles=" + ingles
						+ ", frances=" + frances 
						+ ", espanyol=" + espanyol + "]";
	}
	public void setIngles(String ingles) {
		this.ingles = ingles;
	}
	public void setFrances(String frances) {
		this.frances = frances;
	}
	public void setEspanyol(String espanyol) {
		this.espanyol = espanyol;
	}
	
	

}
