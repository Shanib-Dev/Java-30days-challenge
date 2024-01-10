import java.util.Scanner;

public class While_Loop
{
    public static void main(String[] args)
    {
       int num;
       System.out.println("Enter any number: ");
       Scanner obj=new Scanner(System.in);
       num=obj.nextInt();

       while(num>=0)
       {
          if(num%2==0)
          {
          System.out.println("Number is even");
          break;
          }
          else
          {
          System.out.println("Number is odd");
          break;
          }
       }
       System.out.println("Loop Ended");
    }
}