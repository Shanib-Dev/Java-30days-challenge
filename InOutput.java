import java.util.Scanner;

class InOutput
{
     public static void main(String[] args)
     {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");

        a=s.nextInt();
	b=s.nextInt();
       
        c=a+b;
        System.out.println("Addition of two numbers is: "+c);
        
      }
}
