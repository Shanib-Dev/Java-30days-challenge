import java.util.Scanner;;

public class Condition_IfElse
{
    public static void main(String[] args)
    {
       int pwd;
       System.out.println("Enter Your Password:");
       Scanner obj=new Scanner(System.in);
       pwd=obj.nextInt();
       

       if(pwd==9860)
       {
          System.out.println("My name: Sanib Shaikh");
	  System.out.println("Age: 21");
	  System.out.println("Contact: 9860241029");
          System.out.println("Address: Vasai");
       }
       else
       {
          System.out.println("Sorry, The Password is wrong.");
       }
    }
}