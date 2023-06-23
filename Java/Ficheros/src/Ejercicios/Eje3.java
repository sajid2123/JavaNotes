package Ejercicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Eje3 {

	public static void main(String[] args) throws Exception {
		//crearFichero("num.dat");
		//Leer("num.dat");
		//orden("num.dat");
		//Leer("num.dat");

	}
	public static void orden(String fs) throws IOException{
		int numeros = 0;
		File f = null;
		FileInputStream fe = null;
		DataInputStream d = null;
		//Cuantos Elemento
		f= new File(fs);
		if(f.exists()) {
			fe= new FileInputStream(f);
			d = new DataInputStream(fe);
			String s;
			int l;
			while(d.available() !=0) {
				d.readInt();
				numeros++;
			}
			d.close();
			fe.close();
		}
		//Guardar en Array
		int nums[] = new int[numeros];
		f= new File(fs);
		if(f.exists()) {
			fe= new FileInputStream(f);
			d = new DataInputStream(fe);
			int i=0;
			while(d.available() !=0) {
			 nums[i] = d.readInt();
			 i++;
			}
			d.close();
			fe.close();
		}
		//Ordenar
		nums = burbuja(nums);
		//Escribir
		FileOutputStream fichero = new FileOutputStream(fs);
		DataOutputStream escribir = new DataOutputStream(fichero);
		for(int i=0;i<nums.length;i++) {
			escribir.writeInt(nums[i]);
			
		}
		if(d!=null) {
			escribir.close();
			fichero.close();

		}
	}
	public static void crearFichero(String nf) {
		Scanner tec = new Scanner(System.in);
		int num;
		int aux=0;
		try {
			FileOutputStream fs = new FileOutputStream(nf);
			DataOutputStream d = new DataOutputStream(fs);
			System.out.println("Introducce un numero Fin=negativo" );
			while((num = tec.nextInt()) > 0) {
					d.writeInt(num);
			}
			
				if(d!=null) {
				d.close();
				fs.close();
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	public static void Leer(String nf) throws Exception {
		try {
			File f = null;
			FileInputStream fe = null;
			DataInputStream d = null;
			
			try {
				f= new File(nf);
				if(f.exists()) {
					fe= new FileInputStream(f);
					d = new DataInputStream(fe);
					int l;
					while(true) {
						l=d.readInt();
						System.out.println("-->" + l);
					}
					
				}
			
		}catch(EOFException eof) {
				System.out.println("----------------------------------");
		}catch(FileNotFoundException fnf) {
				System.out.println("Fichero no Encontrado" + fnf);
		}catch (Throwable t) {
				System.out.println("Error de programa" + t);
		}finally {
				if(d!= null) {
					d.close();
				}
			}
			
	}catch(IOException e) {
		e.printStackTrace();
	}
		
		
	}
	public static int[] burbuja(int []v) {
		int aux;
		for(int i = 0; i < v.length - 1; i++) 
			 for(int j = 0; j < v.length-i-1 ; j++)
			if (v[j] > v[j+1]) {
			 aux = v[j];
			 v[j] = v[j+1];
			 v[j+1] = aux; 
			}
		return v;
	}

}
