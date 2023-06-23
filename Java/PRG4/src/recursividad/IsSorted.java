package recursividad;

public class IsSorted {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		System.out.println(isSorted(arr,0));
	}
	public static boolean isSorted(int arr[],int idx) {
		boolean sorted=false;
		if(idx==arr.length-1) {
			System.out.println("Entra en primero if");
			sorted = true;
		}
		if(idx!=arr.length-1 && arr[idx] < arr[idx+1]) {
			System.out.println("Entra en segundo if");
			sorted = isSorted(arr,idx+1);
		}
		return sorted;
	}
}



