package ejerciciosGithub;

import java.util.Scanner;

public class testNumero {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner (System.in); 	
		
	System.out.println("Introduce un numero base");
	int numero = tec.nextInt();
	Numero valor = new Numero(numero);
	
	
	
	int elegir;
	do{
         System.out.println("Elige una opción:");
         System.out.println("1. Añade. 2. Resta. 3. Devuelve el valor. 4. Duplica. 5. Triplica. 6. Nuevo valor interno. 0 Salir");
         elegir = tec.nextInt();

         switch(elegir){
             case 1:
                 System.out.println("Introduce el número que quieres sumar");
                 int sumador=tec.nextInt();
                 valor.aniade(sumador);
                 System.out.println("Resultado: "+valor.getValor());
                 break;
             case 2:
             System.out.println("Introduce el número que quieres restar");
                 int restador=tec.nextInt();
                 valor.resta(restador);
                 System.out.println("Resultado: "+valor.getValor());
                 break;
             case 3:
                 System.out.println("El valor interno es: " + valor.getValor());
                 break;
             case 4:
                 System.out.println("Doble: " + valor.getDoble());
                 break;
             case 5:
                 System.out.println("Triple: " + valor.getTriple());
                 break;
             case 6:
                 System.out.print("El número actual es: " + valor.getValor()+". Introduce el número al que lo quieres cambiar:");
                 int nuevoValor=tec.nextInt();
                 valor.setNumero(nuevoValor);
                 System.out.println("El nuevo valor interno es: " + valor.getValor());

         }
     } while(elegir !=0);
     System.out.println("Fnn");

	
	}

}
