class A
{
   int x,y;
   A(int A,int B) // Parameterized
   {
       x=A; y=B;
   }
   A(int A,String B) // Parameterized
   {
      System.out.println(A+" "+B);
   } 
   void show()
   {
      System.out.println(x+" "+y);
   }
}
class Constructor_Parameterized
{
   public static void main(String args[])
   {
     A obj=new A(100,200); // A(100,200) is a Parameterized constructor
     A ob=new A(200,"Shanib");
     obj.show();
   }
} 
    