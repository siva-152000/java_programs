//java program to run  exceptional handling
import java.io.*;
class MyException extends Exception
{
 private int details;
MyException(int a)
{
details=a;
}
public String tostring()
{
return "minor with age less than 18 and your only"+details;
}
}
class ExceptionDemo
{
static void compute(int x)throws MyException
{
if(x<18)
throw new MyException(x);
else
System.out.println("you can vote");
}
public static void main(String arg[])
{
try
{
compute(20);
compute(15);
}
catch(MyException e)
{
System.out.println("My Exception caught"+e);
}
finally
{
System.out.println("you are indian");
}
}
}
