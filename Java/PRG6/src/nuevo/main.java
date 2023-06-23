package nuevo;
import java.io.*;

public class main {

	public static void main(String[] args) {
		String []amigos = {"Sajid", "German","VIktor"};
		
		try {
			File fs = new File("amigos.txt");
			FileWriter fw = new FileWriter(fs);
			
			fw.write("Listado de nombres\n");
			for(String s: amigos) {
				fw.write(s,0,s.length());
				fw.write("\r\n");
			}
			if(fw != null) {fw.close();}
		}catch(IOException e) {
			e.printStackTrace();
		}
		File fe = new File("amigos.txt");
		if(fe.exists()) {
			try {
				FileReader fr = new FileReader(fe);
				BufferedReader br = new BufferedReader(fr);
				String cadena;
				while((cadena = br.readLine()) != null) {
					System.out.println(cadena);
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}

}
}
