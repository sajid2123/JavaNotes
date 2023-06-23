package ejercicios;

public class Ejer5 {

	public void primero() {
		System.out.println("Primero");
	}
	public void segundo() {
		primero();
		this.primero();
	}
}
