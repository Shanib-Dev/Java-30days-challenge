import java.util.Scanner;

public class Operator_Arith
{
   public static void main(String[] args)
   {
       int a,b,ch;
       double c;
       System.out.println("Enter Two Numbers: ");
       Scanner obj=new Scanner(System.in);
       a=obj.nextInt();
       b=obj.nextInt();
       System.out.println("Enter your Choice: ");

       ch=obj.nextInt();
       
       switch(ch)  //Switch case example
       {
        case 1:c=a+b;  //Arithmetic Operators +,-*,/,%
          System.out.println("Addition :"+c );
          break;       
        case 2:c=a-b;
          System.out.println("Subtraction :"+c );
          break;       
        case 3:c=a*b;
          System.out.println("Multiplication :"+c );
          break;       
        case 4:c=a/b;
          System.out.println("Division :"+c );
          break;       
        case 5:c=a%b;
          System.out.println("Remainder :"+c );
          break;       
        default:
          System.out.println("Invalid Choice.");
       }  
    }
}     