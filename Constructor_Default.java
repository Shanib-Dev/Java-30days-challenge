class A
{
   int roll_no;
   String name;
   boolean atten;
   /*A()
   {
      roll_no=69;
      name="Shanib";
      atten=true;
   }*/
   void show()
   {
      System.out.println(roll_no+" "+name+" "+atten);
   }
}
class Constructor_Default
{
   public static void main(String args[])
   {
     A obj=new A();
     obj.show();
   }
} 
    