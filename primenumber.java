import java.util.Scanner;
public class primenumber
{
    public static void main(String args[])
    {
         int num1, num2 , flag = 0, i, j;
         Scanner sc = new Scanner(System.in);
         System.out.println ("Enter the first number :"); 
         num1 = sc.nextInt();
         System.out.println ("Enter the second number :"); 
         num2 = sc.nextInt();
         System.out.println ("The prime numbers in between the entered numbers are :");
         for(i = num1; i <= num2; i++)
         {
               if(i==2)
                { 
                 System.out.println(+i);
                 }
          for( j = 2; j < i; j++)
             {
               
                 else
                 if(i % j == 0)
                 {
                     flag = 0;
                     break;
                 }
                 else
                 {
                     flag = 1;
                 }
             }
             if(flag == 1)
             {
                 System.out.println(i);
             }
         }
    }
}