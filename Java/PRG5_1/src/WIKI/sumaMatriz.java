package WIKI;

public class sumaMatriz {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int matriz[][] = sumaMatriz(a,b);
		mostrar(matriz);

	}
	public static int[][] sumaMatriz(int [][]a,int [][]b){
		int suma[][] = new int[a.length][a[0].length];
		
		if(a.length==b.length && a[0].length==b[0].length) {
			for(int i = 0; i < a.length;i++) {
				for(int j=0; j<a[0].length;j++)
					suma[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return suma;
	}
	public static void mostrar(int [][]matriz)
	{
		for(int i=0;i<matriz.length;i++) {
			for(int j = 0; j < matriz[i].length;j++) {
				System.out.print(matriz[i][j] + " ");
			
			}
			System.out.println();
		}
	}
}
