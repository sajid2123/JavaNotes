package Ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Eje5 {
	public static void main(String[]args) {
		media("numeros.txt","resultado.txt");
	}
	public static void media(String ficheroE,String ficheroS) {
		Double dato= 0.0,media = 0.0;
		int contador=0;
		File fe = new File(ficheroE);
		File fs = new File(ficheroS);
		if(fe.exists()) {
			try {
				FileReader fr = new FileReader(fe);
				BufferedReader br = new BufferedReader(fr);
				String cadena;
				while((cadena = br.readLine()) != null) {
					dato =Double.parseDouble(cadena);
					contador++;
					media += dato;
					
				}
				
				
				br.close();
				fr.close();

				
			}catch(IOException eof) {
				eof.printStackTrace();
			}
		}
		media = media / contador;
		Double res = 0.0;

		if(fs.exists()) {
			try {
				FileReader fr = new FileReader(fe);
				FileWriter fw = new FileWriter(fs,true);
				BufferedReader br = new BufferedReader(fr);
				String cadena;
				while((cadena = br.readLine()) != null) {
					dato =Double.parseDouble(cadena);
					
					res = dato-media;
					fw.write(Double.toString(res));
					fw.write("\r\n");
				}
				fw.write("Media era: ");
				fw.write(Double.toString(media));
				br.close();
				fw.close();
				fr.close();
				
			}catch(IOException eof) {
				
			}
		}
		
	}

}
