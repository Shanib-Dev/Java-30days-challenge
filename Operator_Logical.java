import java.util.Scanner;

public class Operator_Logical
{
   public static void main(String[] args)
   {
       int a=10,b=20;
       System.out.println(a==b && a!=b);  //AND operator
//If both condition is true then only it will give the Statement TRUE.
       System.out.println(a<b || a>b);  //OR operator
//If one of the condition is True then also it will give the statement TRUE.
       System.out.println(!(a<=b)); //NOT operator
//It will Reverse the output, if the output is TRUE then it will give the statement FALSE.
    }
}     

//Logical Operators are ('&&'),('||'),('!')