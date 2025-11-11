package outer;

public class Jump {
	public static void main(String[] args) {
		int i,j =0;
		First:
			for(i=0;i<5;i++) {
				Second:
					for(j=0;j<5;j++) {
						if(j==2)
							break First;
					}
			}
		System.out.println("i: "+i+" j: "+j+"\t");
	}
}
