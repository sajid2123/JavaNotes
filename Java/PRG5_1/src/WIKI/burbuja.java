package WIKI;

public class burbuja {

	public static void main(String[] args) {
		int v[]= {7,5,3,2,3,5,15,84,36,334};
		
		burbuja(v);
		mostrar(v);
	}
	public static void burbuja(int []v) {
		int aux;
		for(int i = 0; i < v.length - 1; i++) 
			 for(int j = 0; j < v.length-i-1 ; j++)
			if (v[j] > v[j+1]) {
			 aux = v[j];
			 v[j] = v[j+1];
			 v[j+1] = aux; 
			}
		
	}
	public static void mostrar(int n[]) {
		for(int i=0;i <n.length;i++) 
			System.out.print(n[i]+" | ");
		}

}
