package WIKI;

public class binarySearch {

	public static void main(String[] args) {
		
	int a[] = {2,5,9,12,17,19,24,27,31,35,41,45,50};
	
	binarySearch(a);
	

}
	public static void binarySearch(int a[]) {
		int i=0,j=13,bandera=0,buscando=9,pos=0,centro;
		
		
		while(i<=j && bandera ==0) {
		
			centro = (i+j)/2;
		if(a[centro]==buscando) {
			bandera=1;
			pos=centro+1;
		}else if(a[centro]>buscando)
			j=centro-1;
		else if(a[centro]<buscando)
			i=centro+1;
		}
		if(bandera==0)
			System.out.println("NO ENCONTRADO");
		else 
			System.out.println("ENCONTRADO EN LA POSICION " + pos);
		
	}
}