//java program to run grabage collection by using method gc
import java.util.*;
public class garbage
{
  public static void main(String args[])
throws Exception
{
Runtime rs=Runtime.getRuntime();
System.out.println("Total memory is"+rs.totalMemory());
System.out.println("free memory in jvm before garbage collection="+rs.freeMemory());
rs.gc();
System.out.println("free memory in jvm after garbage collecion="+rs.freeMemory());
}
}