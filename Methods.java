public class Methods
{
   public static void main(String[] args)
   { 
       int r=sum(10,20); //1---
       System.out.println("Addition: "+r); 
       bio(); //2---
       Methods m=new Methods();
       m.met();//3---
          
   }
   static int sum(int a, int b) 
//1--- In this we Pass the return value as 'INT' that's why we have to put int before the method sum()
   {
      return a+b;
   }
   static void bio() 
//2--- here, We are not passing any of the return  value, so that's why we are putting void before the method bio()
   {
      System.out.println("Without Return Value");
   }
   void met()
//3--- here, We are not putting the static method, so that's why we have to make the object of Method met() in the main class.
   {
      System.out.println("Without static");
   }
}