package Ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class JugadoresValencia {
	
	public static void main(String[]args) {
		
		informeAltosProvincia("Jugadores.txt","Valencia");
	}
	public static float mediaProvincia(String nf,String provincia) {
		
		float media=0;
		int contador=0;
		
		File fe = new File(nf);
		if(fe.exists()) {
			try {
				FileReader fr = new FileReader(fe);
				BufferedReader br = new BufferedReader(fr);
				String cadena;
				while((cadena = br.readLine()) != null) {
					StringTokenizer str;
					str = new StringTokenizer(cadena);
					String []jugador ={str.nextToken(),str.nextToken(),str.nextToken()};
					if(jugador[2].equalsIgnoreCase(provincia)) {
					contador++;
					media +=	Float.parseFloat(jugador[1]);
					}
				}
				if(contador==0) {
					media =-1;
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		return media/contador;
	}
	public static void informeAltosProvincia(String nf,String provincia) {
		float media = mediaProvincia("Jugadores.txt","Valencia");
		File fe = new File(nf);
		if(fe.exists()) {
			try {
				FileReader fr = new FileReader(fe);
				BufferedReader br = new BufferedReader(fr);
				String cadena;
				while((cadena = br.readLine()) != null) {
					StringTokenizer str;
					str = new StringTokenizer(cadena);
					String []jugador ={str.nextToken(),str.nextToken(),str.nextToken()};
					if(Float.parseFloat(jugador[1]) > media && jugador[2].equalsIgnoreCase(provincia)) {
						for(int i=0;i<3;i++){
							System.out.print(jugador[i] +" ");
						}
					System.out.println();
					
					}
				}
				
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
		
	}

}
