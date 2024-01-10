import java.util.Scanner;

public class Array
{
   public static void main(String[] args)
   {
       int a[]=new int[5];
       System.out.println("Enter Array Elements: ");
       Scanner obj=new Scanner(System.in);
       for(int i=0;i<5;i++)
       {
          a[i]=obj.nextInt();
       }
       
       System.out.println("Array Elements: ");
       for( int b : a)
       {
          System.out.println(b);
       }
   }
}