package recursividad;

public class subCad {
	public static void main(String[] args) {
	String str = "abc";
	subCad(str,0,"");
	}
	public static void subCad(String str,int idx, String newString) {
		if(idx == str.length()) {
			return;
		}
		char currChar = str.charAt(idx);
		subCad(str,idx+1,newString+currChar);
		subCad(str,idx+1,newString);
	}
}
