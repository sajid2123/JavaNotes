package Ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Eje7 {
	public static void main(String[] args) throws IOException {
		leer("notas.txt","salida.txt");
	}
	public static void leer(String fe,String fs) throws IOException {
		File f1 = new File(fe);
		File f2 = new File(fs);
		if(f1.exists() && f2.exists()) {
			FileReader fr = new FileReader(f1);
			FileWriter fw = new FileWriter(f2);
			BufferedReader br = new BufferedReader(fr);
			String cadena;
			while((cadena = br.readLine()) != null){
				fw.write(cadena);
				fw.write("\r\n");
				cadena = br.readLine();
				String notas = cadena;
				StringTokenizer str;
				str = new StringTokenizer(cadena);
				String []nota ={str.nextToken(),str.nextToken(),str.nextToken(),str.nextToken()};
				notas += notaCorrespondiente(calcular(nota));
				fw.write(notas);
				fw.write("\r\n");
			}
			br.close();
			fw.close();
			fr.close();
		}
	}
	public static String notaCorrespondiente(double nota) {
		String notaCorrespondiente = " Suspendido";
		if (nota>= 90.0 && nota<= 100.0) {
			notaCorrespondiente = " Sobresaliente";
        } else if (nota >= 70.0 && nota< 90.0) {
        	notaCorrespondiente = " Notable";
        } else if (nota>= 50.0 && nota< 70.0) {
        	notaCorrespondiente = " Aprobado";
        } 
        return notaCorrespondiente;
	}
	public static double calcular(String []notas) {
		
		double nota = 0.0;
		double valor1 = Double.parseDouble(notas[0]);
	    double valor2 = Double.parseDouble(notas[1]);
	    double valor3 = Double.parseDouble(notas[2]);
	    double valor4 = Double.parseDouble(notas[3]);
	    nota = (((valor1 + valor2)*10)/2) * 0.25 + valor3 * 0.50 + valor4 * 0.25;
	    return nota;
		
	}

}
