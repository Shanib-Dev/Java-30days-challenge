import java.util.Scanner;

public class Condition_Nested_IfElse
{
    public static void main(String[] args)
    {
       int num1,num2,num3;
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter Number 1: ");
       num1=obj.nextInt();
       System.out.println("Enter Number 2: ");
       num2=obj.nextInt();
       System.out.println("Enter Number 3: ");
       num3=obj.nextInt();

       if(num1>num2)
       {
          if(num1>num3)
          {
             System.out.println("Number "+num1+" is Greater");
          }  
          else
          { 
             System.out.println("Number "+num3+" is Greater");
          }
       }
       
       else
       {
          if(num2>num3)
          {
             System.out.println("Number "+num2+" is Greater");
          }  
          else
          {
             System.out.println("Number "+num3+" is Greater");
          }
       }
    }
}

       
       