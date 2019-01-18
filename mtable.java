import java.util.Scanner;
public class mtable
{
  public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int i=1,j=11,p,m;
System.out.println("enter which multiplication table you want:");
p=sc.nextInt();
for(i=1;i<j;i++)
{
m=p*i;
System.out.println(+p+"*"+i+"="+m);
}
}
}