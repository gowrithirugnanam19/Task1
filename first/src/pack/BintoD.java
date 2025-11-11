package pack;
public class BintoD {
	public static void main(String[] args) {
		String bin="11011";
		int a=Integer.parseInt(bin);
		int d=0;
		for(int i=0;i<5;i++) {
			d+=a*(int)Math.pow(2, i);
			a=a/10;
		}
        System.out.println(d);		
	}
}
