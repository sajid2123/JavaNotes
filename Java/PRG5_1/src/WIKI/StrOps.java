package WIKI;

public class StrOps {

	public static void main(String[] args) {
	
		char a[] = {'h','o','l','a','\0'};
		char b[] = {'h','o','l','e','\0'};
		int i = 0;
		/*
		while(a[i]!='\0') {
			i++;
		}
		System.out.println("length is: " + i);
		*/
		
		while(a[i] == b[i] && a[i]!='\0' && b[i]!='\0')
		i++;

		if(a[i] ==b[i]) {
			System.out.println("Equals");
		}else {
			System.out.println("Not Equals");
		}
		
		
		

	}

}
