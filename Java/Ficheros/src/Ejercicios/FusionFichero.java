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

public class FusionFichero {
	static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		
		
		//crearFichero("Fichero1.dat");
		//crearFichero("Fichero2.dat");
		//Fusionar("Fichero1.dat","Fichero2.dat","Nuevo.dat");
		Leer("Nuevo.dat");
		
		
	}
	public static void crearFichero(String nf) {
		int num;
		int aux=0;
		try {
			FileOutputStream fs = new FileOutputStream(nf);
			DataOutputStream d = new DataOutputStream(fs);
			System.out.println("Introducce un numero Fin=negativo" );
			while((num = tec.nextInt()) > 0) {

				if(num == aux || num > aux) {
					d.writeInt(num);
					aux = num;
				}else {
					System.out.println("El numero tiene que ser mayor que " + aux);
				}
				System.out.println("Introducce un numero Fin=negativo" );
			}
			
			if(d!=null) {
				d.close();
				fs.close();
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	public static void Fusionar(String f1,String f2,String nuevo) {
		try {
			boolean finalf1 = true;
			boolean finalf2 = true;
			int num1;
			int num2;
			File fichero1 = null;
			File fichero2 = null;
			FileInputStream fe1 = null;
			FileInputStream fe2 = null;
			DataInputStream d1 = null;
			DataInputStream d2 = null;
			FileOutputStream fs = new FileOutputStream(nuevo);
			DataOutputStream d = new DataOutputStream(fs);
			try {
				fichero1= new File(f1);
				fichero2= new File(f2);
				if(fichero1.exists() && fichero2.exists()) {
					fe1= new FileInputStream(fichero1);
					fe2= new FileInputStream(fichero2);
					d1 = new DataInputStream(fe1);
					d2 = new DataInputStream(fe2);
					num1 = d1.readInt();
					num2 = d2.readInt();
					
					
					while(finalf1 && finalf2) {
						if(num1 <= num2) {
							d.writeInt(num1);
							try {
								num1 = d1.readInt();
							}catch(EOFException e) {
								finalf1 = false;
							}
							
						}else {
							d.writeInt(num2);
							try {
								num2 = d2.readInt();
							}catch(EOFException e) {
								finalf2 = false;
							}
							}
						}
					
					
					
					if (finalf1==true) {
						 d.writeInt(num1);
						while (d1.available() != 0) {
	                        num1 = d1.readInt();
	                        d.writeInt(num1);
	                    }
	                }
					
					
					if (finalf2==true) {
						d.writeInt(num2);
	                    while (d2.available() != 0) {
	                        num2 = d2.readInt();
	                        d.writeInt(num2);
	                    }
	                }
					
					
					
					
					
					}
					
				
					
					
					
				
		
			
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
	
}
