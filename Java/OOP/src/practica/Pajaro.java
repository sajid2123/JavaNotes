package practica;

public class Pajaro {
	private static int numPajaros = 0; 
	private char color;
	private String nombre;
	private byte edad;
	//metodos estaticos
	static void nuevoPajaro(){
	numPajaros++;
	}
	static void muestraPajaros(){
	System.out.println(numPajaros);
	}
	public void setNombre(String n){
		 nombre=n;
		}
		public String getNombre()
		{
			return nombre;
		}
		public void setColor(char c){
		 color=c;
		}
		 public char getColor(){
		 return color;
		}
		public byte getEdad(){
		 return edad;
		}
		public void printEdad() {
		 System.out.println("Edad: " + edad);
		}
		public void setEdad(byte anyos){
		edad = anyos;
		}
		public void printColor() {
		 System.out.println("Color: " + color);
		}
	
		Pajaro() {
		color = 'v';
		edad = 0;
		numPajaros++;
		}
		Pajaro(char c, byte e) {
		color = c;
		edad = e;
		nuevoPajaro();
		
		}
}



