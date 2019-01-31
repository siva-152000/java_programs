//program to create object for TreeSet and Stack and implement demo
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class stacktree
{
	public static void main(String args[]) throws IOException
	{
                // objects created for the built in classes Scanner, TreeSet and Stack
	Scanner sc=new Scanner(System.in);
	TreeSet ts=new TreeSet();
	Stack st=new Stack();

	int cnt,n;
	String str=null;
	System.out.println("\nenter the total no of items in treeset and stack:");
	n=sc.nextInt();
	for(cnt=1;cnt<=n;cnt++)
	{
		System.out.println("enter the "+cnt+"String:");
		str=sc.next();
		ts.add(str); // add element to treeset
		st.push(str); // add element to stack
	}
   System.out.println("**************TREESET***********");
   System.out.println("\n\t The item on the tress are:\t"+ts);
   System.out.println("\n\t The first item on the tree is:\t"+ts.first());
   System.out.println("\n\t The last item on the tree is:\t"+ts.last());
   System.out.println("\n\tThe total item on the tree is:\t"+ts.size());
    System.out.println("\n\tEnter the element you want to delete:");
	String del=sc.next();
	ts.remove(del);
		System.out.println("\n\tThe item on the tree are:\t"+ts);
		System.out.println("*************STACK***************");
		System.out.println("\n\tThe item on the stack are:\t"+st);
		System.out.println("\ntop element is:"+st.peek());
		System.out.println("Poped element is:"+st.pop());
		System.out.println("Elements in stack after deletion:"+st);
		System.out.println("enter element to search:");
	String item=sc.next();
	int loc=st.search(item);
		if(loc>=0)
	System.out.println("element found at:"+loc);
		else
	System.out.println("element not found:");
	}
} 