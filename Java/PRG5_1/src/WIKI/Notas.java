package WIKI;

public class Notas {

	public static void main(String[] args) {
		
	
	double [][]notas = {{4.5,3.5,7.9},{1.5,2,8.5}};
	//recorridoPorFilas(notas);
	//recorridoPorColumnas(notas);
	recorridoIrregular(notas);
	}
	public static void recorridoPorFilas(double notas[][]) {

		for(int i=0;i<notas.length;i++) {
			System.out.println("NOTAS DEL ALUMNO "+ i);
			for(int j=0;j<notas[i].length;j++)
			System.out.println( "Eval. " +j+": "+ notas[i][j]);
		}
		
	}
	public static void recorridoPorColumnas(double notas[][]) {
		for(int i=0;i<notas[0].length;i++) {
			for(int j=0;j<notas.length;j++)
			System.out.println(notas[j][i]);
		}
	}
	public static void recorridoIrregular(double notas[][]) {
		for(int i=0;i<notas.length;i++) {
			System.out.println("NOTAS DEL ALUMNO "+ i);
			for(int j=0;j<notas[i].length;j++)
			System.out.println( "Eval. " +j+": "+ notas[i][j]);
		}
		
	}
	
}
