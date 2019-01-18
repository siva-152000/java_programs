//java program to list extensions files in a folder
import java.io.*;
class onlyext implements FilenameFilter
{
  String ext;
public onlyext(String ext)
{
  this.ext="."+ext;
}
 public boolean accept(File dir,String name)
{
return name.endsWith(ext);
}
}
public class listfiles
{
 public static void main(String args[])
{
  String dirname=".";
File f1 = new File(dirname);
FilenameFilter only=new onlyext("java");//here i mentioned extension java if you want another one you can change it
String s[]=f1.list(only);
for(int i=0;i<s.length;i++)
{
 System.out.println(s[i]);
}
}}  