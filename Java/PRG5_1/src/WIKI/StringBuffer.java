package WIKI;

public class StringBuffer {

	public static void main(String[] args) {
		String[] palabras = {"Emiliano", "java", "desarrollo"};
        String palabrasecreta = palabras[(int)(Math.random() * palabras.length)].toUpperCase(); 
        StringBuilder palabraconstruida = new StringBuilder(palabrasecreta);
        
       
        System.out.println( palabrasecreta.equals(palabraconstruida.toString()));

	}

}
