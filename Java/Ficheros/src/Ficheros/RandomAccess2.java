package Ficheros;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RandomAccess2 {

	public static void main(String[] args) {
		int pos = 0;
		 String nombreFichero = "prueba.txt";
		 RandomAccessFile raf = null;
		 try
		 {
		 //lectura y escritura
		 raf = new RandomAccessFile(nombreFichero,"rw");
		 long tamaño = raf.length();
		 Character unaLetra;
		 int caract;
		 boolean espacio= false;
		 if(raf.getFilePointer()<tamaño)
		 {
		 for(int i=pos;i<raf.length()-1;i++)
		 {
		 raf.seek(i);
		 caract = raf.read();
		 raf.seek(raf.getFilePointer()-1);
		 unaLetra = (char) caract;
		 if(i==0) {
			 unaLetra = Character.toUpperCase(unaLetra);
			 raf.write(unaLetra);
		 }
		
		 if(espacio == true)
		 {
		 unaLetra = Character.toUpperCase(unaLetra);
		 raf.write(unaLetra);
		 espacio = false;
		 }
		if(unaLetra ==' ' || unaLetra =='\n')
		 espacio = true;
		 }
		 }
		 }
		 catch (FileNotFoundException e) {
		 System.out.println("Error: Fichero no encontrado");
		 System.out.println(e.getMessage());
		 }
		 catch(Exception e)
		 {
		 System.out.println("Error de lectura/escritura en el fichero");
		 System.out.println(e.getMessage());
		 }
		 finally
		 {
		 try {
		 if(raf != null)
		 raf.close();
		 }
		 catch (Exception e) {
		 System.out.println("Error al cerrar el fichero");
		 System.out.println(e.getMessage());
		 }
		 }
		 }
		}
