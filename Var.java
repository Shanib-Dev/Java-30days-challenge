class Var
{
     int a=10;  // instance Variable
     static double b=20.5;    // static Variable
     public static void main(String[] args)
     {
        boolean c=true;   // local Variable
        
        Var v=new Var();  //Creating Object of class Var
	System.out.println(v.a+" "+b+" "+c); //Concatenation
	//System.out.println(b);
        //System.out.println(c);
      }
}
