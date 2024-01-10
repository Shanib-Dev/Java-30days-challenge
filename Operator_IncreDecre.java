import java.util.Scanner;

public class Operator_IncreDecre
{
   public static void main(String[] args)
   {
       int a=10;
       System.out.println(a--); //Post Decrement 
       System.out.println(--a); //pre Decrement
       System.out.println(a++); //post Increment
       System.out.println(++a); //pre Increment
    }
}     

//(a--)= In this first it will show the output 10 only but that value of 'a' will become 9 that's why it is called as Post Decrement
//(--a)= In this it will show the output 8 because it show the output after Decrementing the value of 'a' which is 10.
// & Same for the (a++) & (a--).