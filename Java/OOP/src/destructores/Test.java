package destructores;

public class Test {

	public static void main(String[] args) {
		Punto pun = new Punto(2,2);
		Circulo circulo = new Circulo(pun, 3.0);
		circulo.muestra();
	}

}
