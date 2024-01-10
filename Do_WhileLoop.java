import java.util.Scanner;

public class Do_WhileLoop
{
    public static void main(String[] args)
    {
       int num;
       System.out.println("Enter any number: ");
       Scanner obj=new Scanner(System.in);
       num=obj.nextInt();

       do
       {
           System.out.println(num);
           num++;
       }
       while(num<=10);

       System.out.println("Loop Ended");
    }
}