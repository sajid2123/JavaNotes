package WIKI;

public class seleccionDirecta {

	public static void main(String[] args) {
	
	int v[]= {7,5,3,334,2,3,5,15,84,36};
	seleccionDirecta(v);
	mostrar(v);

	}
	public static void seleccionDirecta(int []v){
		
	int i, j, k, aux;
	
	
	for(i = 0; i < v.length-1; i++){
		aux = v[i];
		k = i;
		for (j = i+1; j < v.length; j++) {
			if (v[j] < aux) {
				aux = v[j];
				k = j;
			}
			
		}
				
		v[k] = v[i]; 
		v[i] = aux;
	} 
	
	}

	
	public static void mostrar(int n[]) {
		for(int i=0;i <n.length;i++) 
			System.out.print(n[i]+" | ");
		}
}
