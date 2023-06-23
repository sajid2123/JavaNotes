package ejerciciosGithub;

public class testConsumo {

	public static void main(String[] args) {
		
		Consumo Cons = new Consumo(360,90,140,100);
		System.out.println("Valor introducido con constructor");
		System.out.println(Cons.getTiempo()+"\n"
							+ "Consumo Medio " +Cons.consumoMedio()+"\n"
							+"Consumo Euros "+Cons.consumoEuros());
		
		
		Cons.setKms(89);
		Cons.setLitros(30);
		Cons.setPgas(10);
		Cons.setVmed(110);
		
		System.out.println("Valor introducido con setters");
		System.out.println(Cons.getTiempo()+"\n"
							+"Consumo Medio " +Cons.consumoMedio()+"\n"
							+"Consumo Euros "+Cons.consumoEuros());
	}

}
