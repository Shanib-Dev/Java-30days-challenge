public class Operator_Ternary
{
  public static void main(String[] args)
  {
    int a=100,b=20,c=50,Res;
    Res=(a>b)?(a>c?a:c):(b>c?b:c);
    System.out.println(Res);
  }
}
// (con1>con2)?(stat1:stat2)
// So here ? = check the condition is true or False, If the Condition is True the it execute the 'stat1', and if it is False then it will execute the 'stat2'.
// : = On the left side of Colun there is True Statement and on the left side there is a False statement.