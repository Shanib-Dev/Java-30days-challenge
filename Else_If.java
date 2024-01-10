import java.util.Scanner;

public class Condition_ElseIf
{
    public static void main(String[] args)
    {
       int marks;
       System.out.println("Enter your Marks: ");
       Scanner obj=new Scanner(System.in);
       marks=obj.nextInt();

       if(marks>=70 &&  marks<=100)
       {
           System.out.println("First Class");
       }
       else if(marks>=50 && marks<70)
       {
           System.out.println("Second Class");
       }
       else if(marks>=32 && marks<50)
       {
           System.out.println("Third Class");
       }
       else
       {
           System.out.println("You're Failed");
       }
    }
}