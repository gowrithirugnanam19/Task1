package pack;

public class Repeatcount {
	public static void main(String[] args) {
		String str="welcome";
		char[] ch=str.toCharArray();
		boolean[] b=new boolean[str.length()];
		for(int i=0;i<ch.length;i++) {
			if(b[i]) continue;
			int c=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					c++;
					b[j]=true;
				}
			}
			System.out.println(ch[i]+" : "+c);
		}
	}
}
