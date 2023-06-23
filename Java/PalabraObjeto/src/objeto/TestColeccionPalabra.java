package objeto;

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



public class TestColeccionPalabra {

	public static void main(String[] args) throws IOException {
		Scanner tec = new Scanner(System.in);
		ColeccionPalabra c = new ColeccionPalabra();
		int entrada,seguir;
		String ingles,frances,espanyol,dic,palabraBuscada,palabraAnt,palabraNueva;
		boolean cambios=false;
		
		c.cargarDiccionario("palabra.obj");
	
		do {
			getMenu();
			entrada=tec.nextInt();
			switch(entrada) {
			case 1:
				do {
					System.out.println("Ingles");
					ingles=tec.next();
					System.out.println("Frances");
					frances=tec.next();
					System.out.println("Espanyol");
					espanyol=tec.next();
					Palabra p=new Palabra(ingles, frances, espanyol);
					if(c.getSize()==0) {
						insertarConHeader(p,"palabra.obj");
						
						//System.out.println("Con Header");
					}else {
						insertarSinHeader(p,"palabra.obj");
						//System.out.println("Sin Header");
					}
					c.addPalabra(p);
					System.out.println("¿Quieres Seguir? Fin=0");
					seguir=tec.nextInt();
				}while(seguir!=0);
			
				break;
			case 2:
				do {
					System.out.println("En que idioma quieres buscar");
					dic=tec.next();
					System.out.println("Palabra que quieres buscar");
					palabraBuscada=tec.next();
					int posBuscar;
					if((posBuscar = c.buscar(dic, palabraBuscada)) != -1) {
						c.mostrar(posBuscar);
					
					}else {
						System.out.println("NO existe la palabra " + palabraBuscada);
					}
					
					System.out.println("Quieres seguir 'Fin=0'");
					seguir=tec.nextInt();
				}while(seguir!=0);
				break;
			case 3:
				do {
					System.out.println("En que idioma quieres cambiar la palabra");
					dic=tec.next();
					System.out.println("Palabra Antigua");
					palabraAnt=tec.next();
					System.out.println("Palabra Nueva");
					palabraNueva = tec.next();
					
					if(c.modificar(dic, palabraAnt, palabraNueva)==true) {
						System.out.println("Palabra Modificada");
						cambios =true;
					}else {
						System.out.println("La palabra no exite");
					}
					System.out.println("Quieres seguir 'Fin=0'");
					seguir=tec.nextInt();
				}while(seguir!=0);
				break;
			case 4:
				do {
					
					System.out.println("Palabra que quieres eliminar");
					palabraBuscada=tec.next();
					System.out.println("En que idioma es la palabra");
					dic=tec.next();
					;
					if(c.eliminar(dic, palabraBuscada)==true) {
						System.out.println("Palabra Eliminada");
						cambios=true;
						
					}else {
						System.out.println("No he eliminado la palabra");
					}
					System.out.println("Quieres seguir 'Fin=0'");
					seguir=tec.nextInt();
				}while(seguir!=0);
				break;
			case 5:		
				System.out.println(c.toString());
				break;
			case 0:
				if(cambios==true) {
					guardaPalabras("palabra.obj",c.getVocabulario());
				}
			}
		}while(entrada!=0);
		
	
		
		
		
	}
	
	public static void getMenu() {
		System.out.println("1.Add");
		System.out.println("2.Buscar");
		System.out.println("3.Modificar");
		System.out.println("4.Eliminar");
		System.out.println("5.Mostrar");
		System.out.println("0.Salir");
		
	}
	
	public static void guardaPalabras(String nombreFichero,ArrayList<Palabra> palabras) {
		
		File archivo=new File(nombreFichero);
		if(archivo.exists()) {
			try {
	            FileOutputStream fs = new FileOutputStream(archivo);
	            ObjectOutputStream oos = new ObjectOutputStream(fs);
	            for (Palabra pa: palabras) {
	          
	                oos.writeObject(pa);
	            }
	            if (oos != null) {
	                oos.close();
	                fs.close();
	            }
	        } catch(IOException e) {
	            e.printStackTrace();
	        }
		}
		
	}
	public static void insertarSinHeader(Palabra p,String fichero) throws IOException {
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
	
	public static void insertarConHeader(Palabra p,String fichero) throws IOException {
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