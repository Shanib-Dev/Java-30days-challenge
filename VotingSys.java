import java.util.Scanner;

public class VotingSys
{
    public static void main(String[] args)
    {
       int age;
       System.out.println("Enter Your Age: ");
       Scanner obj=new Scanner(System.in);
       age=obj.nextInt();

       if(age>=18)
       {
          System.out.println("You are eligible for Voting.");
       }
       else
       {
          System.out.println("You are not eligible for Voting.");
       }
    }
}