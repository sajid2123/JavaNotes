package Ficheros;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RandomAccess3 {
	public static void main(String[] args) {
		 String nombreFichero = "rtest.dat";
		 RandomAccessFile rf = null;
		 try
		 {
		 // throws IOException
		 // acceso de lectura/escritura
		 rf = new RandomAccessFile(nombreFichero, "rw");
		 for(int i = 0; i < 10; i++)
		 rf.writeDouble(i*1.00);
		 rf.close();
		 rf = new RandomAccessFile(nombreFichero, "rw");
		 rf.seek(5*8); // salta 5 doubles (8 bytes cada uno)
		 rf.writeDouble(47.00); // modifica el sexto double
		 rf.close();
		 // acceso de sólo lectura
		 rf = new RandomAccessFile(nombreFichero, "r");
		 for(int i = 0; i < 10; i++)
		 System.out.println( "Value " + i + ": " + rf.readDouble());
		 rf.close();
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
			 if(rf != null)
			 rf.close();
			 }
			 catch (Exception e) {
			 System.out.println("Error al cerrar el fichero");
			 System.out.println(e.getMessage());
			 }
			 }
			 }

}
