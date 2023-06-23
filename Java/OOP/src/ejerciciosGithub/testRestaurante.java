package ejerciciosGithub;

public class testRestaurante {

	public static void main(String[] args) {
	Restaurante israel = new Restaurante(1,0.5);
		
	israel.addChoco(1);
	israel.addPapas(2);
	israel.showChoco();
	israel.showPapas();
	System.out.println("Capaciadad de Clientes = " + israel.getCientes());
	
	}

}
