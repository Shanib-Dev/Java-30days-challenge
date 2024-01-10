class Class_Object
{
    int age=15;
    String name="Shanib";
    int weight=61;
  
  void eat()
  {
     System.out.println("I'm Going to eat my Lunch");
  }  

  public static void main(String[] args) 
  {
     Class_Object obj=new Class_Object();
     System.out.println(obj.age);
     System.out.println(obj.name);
     System.out.println(obj.weight);
     obj.eat();
  }
}