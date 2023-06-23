package WIKI;

public class insertionSort {

	public static void main(String[] args) {
		int a[] = {9,2,34,5,333,1,7,8,45,};
		insertionSort(a);
		mostrar(a);
		
	}
	public static int[] insertionSort(int []a) {
		int i,aux,j;
		for(i=1;i<a.length;i++) {
			aux = a[i];
			j = i-1;
			while(aux < a[j]) {
				a[j+1]=a[j];
				j--;
				if(j==-1) {
					break;
				}
			}
			a[j+1]=aux;
		}
		return a;
	}
	public static void mostrar(int []vector) {
		for(int i = 0;i<vector.length;i++) {
			System.out.println(vector[i] + ",");
		}
	}

}
