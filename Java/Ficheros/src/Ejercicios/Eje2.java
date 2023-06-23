package Ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Eje2 {

	public static void main(String[] args) throws IOException {
		cambiaPalabras2("entrada.txt","parejas.txt","salida.txt");

	}
	public static void cambiaPalabras2(String fEntrada,String parejas,String fSalida) throws IOException {
		ArrayList<String> primeraC = new ArrayList<String>();
		ArrayList<String> segundaC = new ArrayList<String>();
		
		File fe1 = new File(parejas);
		File fe2 = new File(fEntrada);
		File fe3 = new File(fSalida);
		
			if(fe1.exists()) {
				FileReader fr = new FileReader(fe1);
				BufferedReader br = new BufferedReader(fr);
				try {
					String cadena;
					while((cadena = br.readLine()) != null) {
						StringTokenizer str;
						str = new StringTokenizer(cadena);
						String []vendedor ={str.nextToken(),str.nextToken()};
						primeraC.add(vendedor[0]);
						segundaC.add(vendedor[1]);
					}
					br.close();
					fr.close();
				}catch(IOException e){
					e.printStackTrace();
			}
		}
			
			 
			Scanner tec = null;
			if(fe2.exists() && fe3.exists()) {
				FileReader fr1 = new FileReader(fe2);
				tec = new Scanner(fr1);
				FileWriter fw = new FileWriter(fe3,true);
				try {
					
					while(tec.hasNext()) {
						String cadena = tec.next();
						boolean escrito = false;
						int i;
						for( i=0; i < primeraC.size() && escrito==false;i++) {
							if(primeraC.get(i).equalsIgnoreCase(cadena)) {
								fw.write(segundaC.get(i));
								fw.write(" ");
								escrito=true;
							}
						}
						if(escrito==false) {
							fw.write(cadena);
							fw.write(" ");
						}
					}
					fw.close();
					tec.close();
					fr1.close();
					
				}catch(IOException e){
				e.printStackTrace();
			
		}
		
			
		
			
		
			}}



}
