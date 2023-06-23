package Wiki;


public class PersonaVip extends Persona {
	private String vip;
	
	public PersonaVip() {
		
	}

	public PersonaVip(String nombre, String apellido, int telefono,String vip) {
		super(nombre, apellido, telefono);
		this.vip = vip;
	}

	@Override
	public String toString() {
		return "PersonaVip [vip=" + vip + ", toString()=" + super.toString() + "]";
	}

	
	
}
