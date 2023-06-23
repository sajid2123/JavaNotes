package WIKI;

public class StrBuild {

	public static void main(String[] args) {
	
	StringBuilder sb = new StringBuilder("Tony");
	System.out.println(sb);
	//Tony
	
	
	
	
	//Set char at index 0
	sb.setCharAt(0, 'P');
	System.out.println(sb);
	//Pony
	
	//insert palabra en un sitio sin machacarlo y moviendo posicciones.
	sb.insert(2, 'n');
	System.out.println(sb);
	//SPony
	
	
	//delete 
	sb.delete(2, 4);
	// en este caso elimina la pos 2 y 3, no incluye 4.
	System.out.println(sb);
	//poy
	
	
	//append
	sb.append("AA");
	//Te adjunta al final del string
	System.out.println(sb);
	//PoyAA
	}

}
