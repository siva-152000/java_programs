import java.util.*;
import java.util.Scanner;
interface shape
{
 final static double pi=3.142;
public void area(float r);
}
class circle implements shape
{
   float rad;
float area_circle;
public void area(float r)
{
  rad=r;
 area_circle=(float)pi*rad*rad;
System.out.println("area of circle is:"+area_circle);
}
public static void main(String[] args)throws Exception
{
  circle c=new circle();
float radius;
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius");
radius=sc.nextInt();
c.area(radius);
}}