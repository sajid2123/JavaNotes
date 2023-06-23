package recursividad;

public class RemoveDuplicate {
	public static boolean	[] map = new boolean[26];
	public static void main(String[] args) {
		String str = "abdcdcbffhsa";
		removeDuplicate(str,0,"");
	}
	public static void removeDuplicate(String str,int idx,String newString) {
		
		if(idx == str.length()) {
			System.out.println(newString);
			return;
		}
		char currChar = str.charAt(idx);
		if(map[currChar - 'a']) {
			removeDuplicate(str, idx+1, newString);
		}else {
			newString += currChar;
			map[currChar - 'a'] = true;
			removeDuplicate(str,idx+1,newString);
		}
}
}
