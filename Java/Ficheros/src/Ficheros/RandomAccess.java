package Ficheros;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RandomAccess {

	public static void main(String[] args) {
	
		//La variable 'pos' indicará la posición del puntero del fichero,
		 // señalando el lugar donde se leerá o escribirá
		 int pos = 11;
		 String nombreFichero = "prueba.txt";
		 RandomAccessFile raf = null;
		 try
		 {
		 //Se abre el fichero para permitir lectura y escritura
			 raf = new RandomAccessFile(nombreFichero,"rw");
			 //Obtener el tamaño del fichero
			 long tamaño = raf.length();
			 //Posicionar el puntero del fichero en la posición indicada
			 raf.seek(pos);
			 //Comprobar si se intenta posicionar el puntero más allá
			 // del tamaño del fichero
			 while(raf.getFilePointer()<tamaño)
			 {
				 //Leer un carácter y avanzar puntero al siguiente carácter
				 //Los caracteres leídos se toman de tipo entero
				 int caract = raf.read();
				 //Retroceder una posición para volver a la posición anterior
				 raf.seek(raf.getFilePointer());
				 //Escribir el carácter leído convertido a mayúsculas
				 raf.write(Character.toUpperCase(caract));
			 }
			 
		 }catch (FileNotFoundException e) {
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
