import java.util.Scanner;
import java.util.Arrays;

public class Array_Sorted
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
       Arrays.sort(a);  // Sorting the Array.
       System.out.println("Sorted Array Elements: ");
       for( int b : a)  // Foreach Loop.
       {
          System.out.println(b);
       }
   }
}