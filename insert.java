//java program to insert an element between array
import java.util.Scanner;
public class insert
{
  public static void main(String[] args)
{
  int n,pos,x;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the no.of elements");
n=sc.nextInt();
int a[]=new int[n+1];
System.out.println("enter the all elements");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter the position you want");
pos=sc.nextInt();
System.out.println("enter the elements");
x=sc.nextInt();
for(int i=(n-1);i>=(pos-1);i--)
{
   a[i+1]=a[i];
}
a[pos-1]=x;
System.out.println("after inserting:");
for(int i=0;i<n;i++)
{
System.out.println(a[i]+"");
}
System.out.println(a[n]);
}
}