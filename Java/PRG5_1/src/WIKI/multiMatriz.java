package WIKI;

public class multiMatriz {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6}};
		int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int matriz[][] = multiMatriz(a,b);
		
		mostrar(matriz);
	}
	public static int[][] multiMatriz(int [][]a,int [][]b){
		int matriz[][] = new int[a.length][b[0].length];
		if(a[0].length != b.length) {
			System.out.println("No compatible");
		}
		else {
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<b[0].length;j++) {
					for(int k=0;k<a[0].length;k++) {
						matriz[i][j] += a[i][k] * b[k][j];
					}
			}
		}
	}
		return matriz;
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
