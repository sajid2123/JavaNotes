package WIKI;

import java.util.Scanner;

public class juego_del_ahorcado {
	static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
    	Scanner tec = new Scanner(System.in);
    	final int max=6;
    	int contador=0;
    	int entrada;
       
        String c,d;
        String[] palabras = {"Emiliano", "java", "desarrollo"};
      
        
      
       
        
       
        
        do {
        	String palabrasecreta = palabras[(int)(Math.random() * palabras.length)].toUpperCase(); 
        	StringBuilder palabraconstruida = new StringBuilder();
        	getMenu();
        	entrada = tec.nextInt();
        	switch(entrada) {
        		case 1:
        			
        			jugar(palabrasecreta,palabraconstruida);
        			break;
        		
        	}
        	
        }while(entrada!=0);
        
	}
	
	
    
    public static void palabraconstruida(String palabrasecreta,StringBuilder palabraconstruida) {
    	 for(int i = 0; i < palabrasecreta.length(); i++){
         	palabraconstruida.append("-"); 
         }
         System.out.print(palabraconstruida);
    }
    
    
    
    
    
    public static void jugar(String palabrasecreta,StringBuilder palabraconstruida) {
    	String c;
    	final int max = 6;
    	int contador = 0;
    	boolean bandera = false;
    	System.out.print("La palabra a Adivinar tiene ");
		palabraconstruida(palabrasecreta,palabraconstruida);
		System.out.print(" espacios." + "\n");
		 
		do {
			bandera = false;
       	System.out.println("Introduce la letra");
       	c = tec.next();
       	c = c.toUpperCase();
       	for(int i = 0; i < palabrasecreta.length(); i++){
               if(c.charAt(0)== palabrasecreta.charAt(i)){
                   palabraconstruida.setCharAt(i, c.charAt(0));
                   bandera = true;
               }
       	}
       	if(bandera == false) {
       		contador++;
       		System.out.println("Te quedan " + (max-contador) + " intentos Espabila!!!!");
       	}
       	System.out.println(palabraconstruida);
       	
       }while(contador != max && !palabrasecreta.equals(palabraconstruida.toString()));
       
       if(contador == max)
       	System.out.println("Eres muy malo");
       else
       	System.out.println("Has ganado!!!");
    }
    
    
    
    public static void getMenu() {
    	System.out.println("1.Jugar");
    	System.out.println("0.Salir");
    }
}
