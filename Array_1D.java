import java.util.Scanner;

public class Array_1D
{
   public static void main(String[] args)
   {
       int a[][]=new int[2][2];
       System.out.println("Enter Array Elements: ");
       Scanner obj=new Scanner(System.in);
       for(int i=0;i<2;i++)
       {
          for(int j=0;j<2;j++)
          {
             a[i][j]=obj.nextInt();
          }       
       }

       System.out.println("1D Array Elements: ");
       for(int i=0;i<2;i++)
       {
          for(int j=0;j<2;j++)
          {
             System.out.print(a[i][j]+"  ");
          }
          System.out.println();       
       }
   }
}