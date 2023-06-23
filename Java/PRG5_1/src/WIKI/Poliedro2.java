package WIKI;

public class Poliedro2 {

	public static void main(String[] args) {
		int [][][]a = {{{0,0},{1,6},{2,6}},
					   {{3,1},{4,7},{5,5}},
					   {{6,2},{7,8},{8,4}},
					   {{9,3},{8,9},{7,3}}};
		int mediaEval,mediaFinal;
		double mediaAsig;
		for(int j=0; j<a.length;j++) {
				System.out.println("alumno: " + (j) );
				for(int k=0; k<a[0][0].length;k++) {
					System.out.println("Asig: " + (k));
					mediaAsig=0;
					for(int i=0;i <a[0].length;i++) {
						System.out.println("Eval: " + (i) + ": " + a[j][i][k]);
						mediaAsig =+ a[j][i][k];
					}
					System.out.println("Media Asig: " + mediaAsig);
					
	
				}
				
			}

	}

}

