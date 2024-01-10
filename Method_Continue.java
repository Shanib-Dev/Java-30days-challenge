public class Method_Continue
{
   public static void main(String[] args)
   {
      for(int i=0;i<=10;i++)
      {
          if(i==5)
          continue;    // Skip the condition part
          System.out.println(i);
          
      }
   }
}
//In the output the number 5 is skipped because of the continue function