class A
{
   int a;
   String name;
   void show()
   {
      System.out.println(a+" "+name);
   }
   A()
   {
     a=0; name=null;
   }
}
class Constructor
{
   public static void main(String args[])
   {
     A obj=new A();
     obj.show();
     System.out.println(obj.a);
   }
} 
    