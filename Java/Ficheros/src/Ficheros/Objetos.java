package Ficheros;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Objetos {
	public static void main(String[]args) {
		
		escribir();
		
	}
	public static void escribir() {
		String [] personas= {"Andres","Pedro","Isaac"};
		String [] apellidos= {"Rosique","Roir","Sanchez"};
		long []telefonos= {653364787,627463746,644567346};
		
		//Escritura del fichero
		try {
			FileOutputStream fs = new FileOutputStream("personas.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fs);
			
			for(int i=0;i<3;i++) {
				Persona p = new Persona(personas[i],apellidos[i],telefonos[i]);
				oos.writeObject(p);
				System.out.println("dasd");
			}
			if(oos != null) {
				oos.close();
				fs.close();
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void Lectura() {
		 try {
            File f = null;
            FileInputStream fe = null;
            ObjectInputStream ois = null;
            try {
                f = new File("amigos.obj");
                if (f.exists()) {
                    fe = new FileInputStream(f);
                    ois = new ObjectInputStream(fe);
                    while(true) {
                        Persona a = null;
                        a = (Persona) ois.readObject();
                        a.print();
                    }
                }
            } catch (EOFException eof) {
                System.out.println("--------");
            } catch (FileNotFoundException fnf) {
                System.out.println("Fichero no encontrado " + fnf);
            } catch (Throwable t) {
                System.err.println("Error de programa " + t);
            } finally {
                if (ois != null) {
                    ois.close();
                    fe.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
