package Wiki;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;



public class Eje4 {
	public static void main(String[]args) throws Exception {
		Scanner tec = new Scanner(System.in);
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		personas = cargarPersona("persona.obj","personaVip.obj");
	
		int entrada;
		do {
			menu();
			entrada = tec.nextInt();
			String nombre,apellido,vip;
			int telefono;
			switch(entrada) {
			case 1:
				System.out.println("NOmbre");
				nombre = tec.next();
				System.out.println("Apellido");
				apellido = tec.next();
				System.out.println("Telefono");
				telefono = tec.nextInt();
				Persona p=new Persona(nombre,apellido,telefono);
				personas.add(p);
				
				break;
			
			case 2:
				System.out.println(personas.toString());
				break;
			
			case 3:
				System.out.println("NOmbre");
				nombre = tec.next();
				System.out.println("Apellido");
				apellido = tec.next();
				System.out.println("Telefono");
				telefono = tec.nextInt();
				System.out.println("Vip O NoVip");
				vip = tec.next();
				Persona pVip=new PersonaVip(nombre,apellido,telefono,vip);
				personas.add(pVip);
				break;
			}
		}while(entrada !=0);	
		
		//guardar("personaVip.obj","persona.obj",personas);
	}
	public static void menu() {
		System.out.println("1.Anyadir Persona");
		System.out.println("2.Mostrar");
		System.out.println("3.Anyadir PersonaVip");
		System.out.println("0.Salir");
	}
	public static void guardar(String ficheroPersonaVip,String ficheroPersona,ArrayList<Persona> persona) {

		try {
			File fe1 = new File(ficheroPersonaVip);
			File fe2 = new File(ficheroPersona);
			FileOutputStream fos1=new FileOutputStream(fe1);
			FileOutputStream fos2=new FileOutputStream(fe2);
			ObjectOutputStream oos1=new  ObjectOutputStream(fos1);
			ObjectOutputStream oos2=new  ObjectOutputStream(fos2);
			for(int i=0;i<persona.size();i++) {
				if(persona.get(i) instanceof PersonaVip) {
					oos1.writeObject(persona.get(i));
				}else {
					oos2.writeObject(persona.get(i));
				}
			}
			oos2.close();
			oos1.close();
			fos2.close();
			fos1.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public static ArrayList<Persona> cargarPersona(String fichero,String ficheroVip) {
		ArrayList<Persona> personas = new ArrayList<Persona>();
            try {
            	  File f = new File(fichero);
            	 
                  FileInputStream fe =  new FileInputStream(f);
                 
                  ObjectInputStream ois = new ObjectInputStream(fe);
                  
                    while(true) {
                        Persona persona = (Persona)ois.readObject();
                        personas.add(persona);
                    }
                   
               
 
			} catch (EOFException  eof) {
				
			}
            catch (IOException  e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
            try {
          	 
          	  File f1 = new File(ficheroVip);
              
                FileInputStream fe1 =  new FileInputStream(f1);
               
                ObjectInputStream ois1 = new ObjectInputStream(fe1);
                  while(true) {
                      Persona persona = (PersonaVip)ois1.readObject();
                      personas.add(persona);
                
                  }
             

			} catch (EOFException  eof) {
				
			}
          catch (IOException  e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		return personas;
	}
	
	public static void insertarSinHeader(Persona p,String fichero) throws IOException {
		File archivo=new File(fichero);
		if(archivo.exists()) {
			try {
				 FileOutputStream fs = new FileOutputStream(archivo,true);
				  ObjectOutputStreamSinHeader oos = new  ObjectOutputStreamSinHeader(fs);
				  
				  oos.writeObject(p);
	
				
				if (oos != null) {
	                oos.close();
	                fs.close();
	            }
	        } catch(IOException e) {
	            e.printStackTrace();
	        }
			 
		}
	}
	
	public static void insertarConHeader(Persona p,String fichero) throws IOException {
		File archivo=new File(fichero);
		if(archivo.exists()) {
			try {
				 FileOutputStream fs = new FileOutputStream(archivo);
				  ObjectOutputStream oos = new  ObjectOutputStream(fs);
				  
				  oos.writeObject(p);
	
				
				if (oos != null) {
	                oos.close();
	                fs.close();
	            }
	        } catch(IOException e) {
	            e.printStackTrace();
	        }
			 
		}
	}
	

}
