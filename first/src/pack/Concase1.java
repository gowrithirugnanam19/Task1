package pack;

public class Concase1 {
	public static void main(String[] args) {
		String s="wElCoMe";
		String out="";
		for(int i=0;i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				out+=Character.toLowerCase(s.charAt(i));
			}
			else {
				out+=Character.toUpperCase(s.charAt(i));
			}
		}
		System.out.println(out);
	}
}
