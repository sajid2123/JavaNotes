package objeto;



import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class ColeccionPalabra  {
	

	private ArrayList<Palabra> vocabulario;
	
	
	public ArrayList<Palabra> getVocabulario() {
		return vocabulario;
	}
	public void cargarDiccionario(String fichero) {
		
		try {
            File f = null;
            FileInputStream fe = null;
            ObjectInputStream ois = null;
            try {
                f = new File(fichero);
                if (f.exists()) {
                    fe = new FileInputStream(f);
                    ois = new ObjectInputStream(fe);
                    while(true) {
                    
                        Palabra palabra = (Palabra)ois.readObject();
                        vocabulario.add(palabra);
                        
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
	
	public ColeccionPalabra() {
		vocabulario= new ArrayList<Palabra>();
	}
	public Palabra getPalabraPos(int pos) {
		return vocabulario.get(pos);
	}
	public int getSize() {
		return vocabulario.size();
	}
	public String getList(){
		//return vocabulario.toString();
		System.out.println("Salida: "+vocabulario.get(0));
		return vocabulario.get(0).toString();
		//return "Hola";
	}
	public void addPalabra(Palabra p) {
		vocabulario.add(p);
	}
	public int buscar(String dic,String palabra) {
		
		int pos=-1;
		int entrada=0;
		boolean encontrado=false;
		if(dic.equalsIgnoreCase("ingles")) {
			entrada=1;
		}else if(dic.equalsIgnoreCase("frances")) {
			entrada=2;
		}else {
			entrada=3;
		}
		
		switch(entrada) {
		case 1:
			for(int i = 0; i < vocabulario.size()&& encontrado==false;i++) {
				if(vocabulario.get(i).getIngles().equalsIgnoreCase(palabra)) {
					vocabulario.get(i).toString();
					encontrado= true;
					pos=i;
				}
					
			}
			break;
		case 2:
			for(int i = 0; i < vocabulario.size()&& encontrado==false;i++) {
				if(vocabulario.get(i).getFrances().equalsIgnoreCase(palabra)) {
					vocabulario.get(i).toString();
					encontrado= true;
					pos=i;
				}	
			}
			break;
		case 3: 
			for(int i = 0; i < vocabulario.size()&& encontrado==false;i++) {
				if(vocabulario.get(i).getEspanyol().equalsIgnoreCase(palabra)) {
					vocabulario.get(i).toString();
					encontrado= true;
					pos=i;
				}	
			}
			break;
		}
		return pos;
	}
	public void mostrar(int pos) {
		System.out.println("Palabra [" + vocabulario.get(pos).toString( ) +"]");
		
		
	}
	public boolean modificar(String dic,String palabra,String palabraNueva) {
		boolean palabraEncontrada = false;
		if(buscar(dic,palabra) != -1) {
			palabraEncontrada=true;
			int entrada=0;
			boolean encontrado=false;
			if(dic.equalsIgnoreCase("ingles")) {
				entrada=1;
			}else if(dic.equalsIgnoreCase("frances")) {
				entrada=2;
			}else {
				entrada=3;
			}
			switch(entrada) {
			case 1:
				for(int i = 0; i < vocabulario.size()&& encontrado==false;i++) {
					if(vocabulario.get(i).getIngles().equalsIgnoreCase(palabra)) {
						vocabulario.get(i).setIngles(palabraNueva);
						encontrado= true;
					}
						
				}
				break;
			case 2:
				for(int i = 0; i < vocabulario.size()&& encontrado==false;i++) {
					if(vocabulario.get(i).getFrances().equalsIgnoreCase(palabra)) {
						vocabulario.get(i).setFrances(palabraNueva);;
						encontrado= true;
					}	
				}
				break;
			case 3: 
				for(int i = 0; i < vocabulario.size()&& encontrado==false;i++) {
					if(vocabulario.get(i).getEspanyol().equalsIgnoreCase(palabra)) {
						vocabulario.get(i).setEspanyol(palabraNueva);
						encontrado= true;
					}	
				}
				break;
			}
		}
		
		return palabraEncontrada;
		
	}
	public boolean eliminar(String dic,String palabra) {
		Scanner tec = new Scanner(System.in);
		String respuesta;
		boolean palabraEliminada = false;
		int pos=buscar(dic,palabra);
		if(pos != -1) {
			System.out.println("Estas Seguro de Eliminar estas palabras");
			mostrar(pos);
			System.out.println("Si O NO");
			respuesta = tec.next();
			if(respuesta.equalsIgnoreCase("SI")) {
				palabraEliminada = true;
				int entrada=0;
				boolean encontrado=false;
				if(dic.equalsIgnoreCase("ingles")) {
					entrada=1;
				}else if(dic.equalsIgnoreCase("frances")) {
					entrada=2;
				}else {
					entrada=3;
				}
				
				switch(entrada) {
				case 1:
					for(int i = 0; i < vocabulario.size()&& encontrado==false;i++) {
						if(vocabulario.get(i).getIngles().equalsIgnoreCase(palabra)) {
							vocabulario.remove(i);
							encontrado= true;
						}
							
					}
					break;
				case 2:
					for(int i = 0; i < vocabulario.size()&& encontrado==false;i++) {
						if(vocabulario.get(i).getFrances().equalsIgnoreCase(palabra)) {
							vocabulario.remove(i);
							encontrado= true;
						}	
					}
					break;
				case 3: 
					for(int i = 0; i < vocabulario.size()&& encontrado==false;i++) {
						if(vocabulario.get(i).getEspanyol().equalsIgnoreCase(palabra)) {
							vocabulario.remove(i);
							encontrado= true;
						}	
					}
					break;
				}
			}
		}
		return palabraEliminada;
	}
	public String toString(){
		 String resultado="";
		 for ( int i=0;i<vocabulario.size();i++)
		  resultado=resultado+vocabulario.get(i).toString ()+" \n";
		 return resultado;
	}
}
