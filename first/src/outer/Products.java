package outer;
import java.util.Arrays;
import java.util.Scanner;
public class Products {
int prdno;
String prdname;
int prdprice;
Scanner sc=new Scanner(System.in);
Products prd[]=new Products[3];
void addProducts()
{
for(int i=0;i<prd.length;i++)
{
prd[i]=new Products();
System.out.println("Enter product No");
prd[i].prdno=sc.nextInt();
System.out.println("Enter Product Name");
prd[i].prdname=sc.next();
System.out.println("Enter product Price");
prd[i].prdprice=sc.nextInt();
}
}
void displayProducts()
{
for(int i=0;i<prd.length;i++)
{
System.out.println(prd[i].prdname+" "+prd[i].prdprice);
}
}
@Override
public String toString() {
return "Products [prdno=" + prdno + ", prdname=" + prdname + ", prdprice=" + prdprice + ", sc=" + sc + ", prd="
+ "]\n";
}
public static void main(String[] args) {
Products p=new Products();
p.addProducts();
p.displayProducts();
}
}
