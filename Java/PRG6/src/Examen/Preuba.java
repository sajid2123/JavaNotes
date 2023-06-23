package Examen;


import Ejercicio2.Empleado;

public class Preuba {

	public static void main(String[] args) {
		boolean continuar = true;
		int anyo,edad;
		String nombre,creador,distribuidor,version;
		ContenedorOrdenado<Juego> miContenedor = new ContenedorOrdenado<Juego>();
		
		int pos;
		while (continuar) {
			int opcion = Utils.mostrarMenu("Menu", "Anyadir Juego", "Eliminar Juego", "Obtener Juego mas antiguo",
					"Numero de Juegos existentes en la juegoteca", "Mostrar juegoteca","Anyadir VideoJuego","Obtener el VideoJuego mas antiguo","Mostrar los videoJuego", "Salir");
			switch (opcion) {
			case 1: /* Anyadir Juego */
				nombre = Utils.preguntarString("Nombre del Juego");
				creador = Utils.preguntarString("Creador del Juego");
				distribuidor = Utils.preguntarString("Distribuidor del Juego");
				anyo = Utils.preguntarInt("Anyo del Juego", 0, Integer.MAX_VALUE);
				Juego j1 = new Juego(nombre,creador,distribuidor,anyo);
				miContenedor.anyadeDatoOrdenado(j1);
				break;

			case 2:
				nombre = Utils.preguntarString("Nombre del Juego");
				creador = Utils.preguntarString("Creador del Juego");
				distribuidor = Utils.preguntarString("Distribuidor del Juego");
				anyo = Utils.preguntarInt("Anyo del Juego", 0, Integer.MAX_VALUE);
				miContenedor.eliminarDato(new Juego(nombre,creador,distribuidor,anyo));
				break;

			case 3: // Obtener Juego mas antiguo 
				Juego j4 = new Juego();
				
				boolean encontrado =false;
				int i=0,posV=0;
				
				while(encontrado==false && i < miContenedor.numElementos() ) {
					if(miContenedor.getDatoPos(i).getClass().equals(j4.getClass()) == true){
						encontrado=true;
						posV=i;
					}
					i++;
				}
				System.out.println("El juego mas antiguo es:" + miContenedor.getDatoPos(posV));
				break;
			case 4://Nuemro de Juegos
				System.out.println("En el Juegoteca hay " + miContenedor.numElementos() + " Juegos");
				
				break;

			case 5://Mostrar juegoteca
				System.out.println("Juegos en juegoteca");
				System.out.println(miContenedor);
				break;
			case 6: 
				nombre = Utils.preguntarString("Nombre del Juego");
				creador = Utils.preguntarString("Creador del Juego");
				distribuidor = Utils.preguntarString("Distribuidor del Juego");
				anyo = Utils.preguntarInt("Anyo del Juego", 0, Integer.MAX_VALUE);
				version = Utils.preguntarString("Version del VideoJuego");
				edad = Utils.preguntarInt("Edad permitida", 0, Integer.MAX_VALUE);
				Juego j2 = new VideoJuego(nombre,creador,distribuidor,anyo,version,edad);
				miContenedor.anyadeDatoOrdenado(j2);
				break;
			
			case 7: 
				
				VideoJuego v = new VideoJuego();
				boolean encontrado1 =false;
				int j=0,posVe=0;
				
				while(encontrado1==false && j < miContenedor.numElementos() ) {
					if(miContenedor.getDatoPos(j).getClass().equals(v.getClass()) == true){
						encontrado1=true;
						posVe=j;
					}
					j++;
				}
				System.out.println("El VideoJuego mas antiguo es:" + miContenedor.getDatoPos(posVe));
				break;
			case 8: 
				VideoJuego v1 = new VideoJuego();
				
				for(int l=0;l<miContenedor.numElementos();l++) {
					if(miContenedor.getDatoPos(l).getClass().equals(v1.getClass()) == true){
						System.out.println(miContenedor.getDatoPos(l));
					}
				}
				
				break;
			case 9:
				continuar = false;
			}

		}

	}
}
