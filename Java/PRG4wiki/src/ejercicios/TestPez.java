package ejercicios;

public class TestPez {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Pez p1 = new Pez("pez");
		System.out.println(p1.toString());
		Pez p2 = new Pez("fish");
		System.out.println(p2.toString());
		System.out.println(p1.equals("pez"));
		System.out.println(p2.equals("pez"));
		
		Pez p3 = (Pez)p2.clone();
		System.out.println(p3.getNombre());
		
		
		System.out.println(p3.toString());
		
		Pez p4 = new Pez("nemo");
		System.out.println(p4.toString());
		Pez p5 = new Pez(p4);
		
		System.out.println(p5.toString());
	}

}
