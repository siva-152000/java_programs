//java program to open calc and notepad
import java.util.*;
import java.io.*;
class open
{
  public static void main(String args[])
{
  Runtime rs=Runtime.getRuntime();
try
{
 rs.exec("notepad");//if you want you can use different name but same name as existed in properties of an application
rs.exec("calc");
}
catch(IOException e)
{
  System.out.println(e);
}
}
}