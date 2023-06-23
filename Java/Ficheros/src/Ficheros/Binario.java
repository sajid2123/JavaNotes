package Ficheros;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Binario {
	public static void main(String[] args) throws Exception {
		
		escribir();
		Leer();

	}
	public static void escribir() {
		String []amigos = {"Sajid", "German","Viktor"};
		int []tel = {771,13131,1313};
		
		try {
			FileOutputStream fs = new FileOutputStream("amigos.dat");
			DataOutputStream d = new DataOutputStream(fs);
			
			
			for(int i=0;i<amigos.length;i++) {
				d.writeUTF(amigos[i]);
				d.writeInt(tel[i]);
			}
			if(d!=null) {
				d.close();
				fs.close();
	
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	public static void Leer() throws Exception {
		try {
			File f = null;
			FileInputStream fe = null;
			DataInputStream d = null;
			
			try {
				f= new File("amigos.dat");
				if(f.exists()) {
					fe= new FileInputStream(f);
					d = new DataInputStream(fe);
					String s;
					int l;
					while(true) {
						s=d.readUTF();
						l=d.readInt();
						System.out.println(s +"-->"+ l);
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
}
