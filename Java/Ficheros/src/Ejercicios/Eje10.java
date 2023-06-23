package Ejercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Eje10 {

	public static void main(String[] args) {
		caracteres("char.txt");
		

	}
	//Funciona pero repite el 	System.out.println("Escribe un caracter:");	3 veces si alguien lo sabe porque, avisa
	public static void caracteres(String fs) {
		Scanner tec = new Scanner(System.in);
		File f = new File(fs);
		if(f.exists()) {
			try {
				FileWriter fw = new FileWriter(f);
				System.out.println("Escribe un caracter");
				char c;
				while((c = (char) System.in.read()) != ' '){
						fw.write(c);
						System.out.println("Escribe un caracter:");	
				}
				fw.close();
				
			}catch(IOException eof) {
				eof.printStackTrace();
			}
		}
	}

}
