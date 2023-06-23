package WIKI;

public class insercionDirecta {

	final int N_EL = 5;
	public static void main(String[] args) {
		
	int v[]= {7,5,3,2,3,5,15,84,36,334};
	
	insercionDirecta(v);
	mostrar(v);
	}
	
	
	
	public static void insercionDirecta(int []v)
	{
	int i, j, aux;
	for(i = 1; i < v.length; i++){ 
	aux = v[i];
	j = i;
	while (j > 0 && aux < v[j-1]) {
	 v[j] = v[j-1];
	 j--;
	}
	v[j] = aux;
	} 
	}
	public static void mostrar(int n[]) {
		for(int i=0;i <n.length;i++) {
			System.out.print(n[i]+" | ");
		}}
}
