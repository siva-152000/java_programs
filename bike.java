/*simple program to perform inheritence*/
import java.util.Scanner;
class vehicle
{
int speed=50;
}
class bike extends vehicle
{
 int speed=100;
void display()
{
System.out.println("parent speed is"+super.speed);//super used to call parent object
System.out.println("child speed is"+this.speed);//this is used to call recent object
}
public static void main(String[] args)
{
  bike b=new bike();
  b.display();
}
}