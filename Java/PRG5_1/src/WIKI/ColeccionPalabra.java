package WIKI;

import java.util.ArrayList;

public class ColeccionPalabra {
	private ArrayList<Palabra> vocabulario;
	public ColeccionPalabra() {
		vocabulario= new ArrayList<Palabra>();
	}
	public String getList(){
		//return vocabulario.toString();
		System.out.println("Salida: "+vocabulario.get(0));
		return vocabulario.get(0).toString();
		//return "Hola";
	}
	public void addPalabra(String ingles,String frances,String espanyol) {
		Palabra p= new Palabra(ingles,frances,espanyol);
		vocabulario.add(p);
		
	}
	public void buscar(String dic,String palabra) {
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
					System.out.println(vocabulario.get(i).toString());
					encontrado= true;
				}
					
			}
			break;
		case 2:
			for(int i = 0; i < vocabulario.size()&& encontrado==false;i++) {
				if(vocabulario.get(i).getFrances().equalsIgnoreCase(palabra)) {
					System.out.println(vocabulario.get(i).toString());
					encontrado= true;
				}	
			}
			break;
		case 3: 
			for(int i = 0; i < vocabulario.size()&& encontrado==false;i++) {
				if(vocabulario.get(i).getEspanyol().equalsIgnoreCase(palabra)) {
					System.out.println(vocabulario.get(i).toString());
					encontrado= true;
				}	
			}
			break;
		}
	}
	public void modificar(String dic,String palabra,String palabraNueva) {
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
	public void eliminar(String dic,String palabra) {
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
	public String toString(){
		 String resultado="";
		 for ( int i=0;i<vocabulario.size();i++)
		  resultado=resultado+vocabulario.get(i).toString ()+" \n";
		 return resultado;
	}
}
