import java.util.*;

class Add{
 int a,b;
 void add(int a,int b)
  {
 
int sum = a+b;
System.out.println("addition of two no:" + sum);
  
  }

 void sub(int a,int b)
  {
 
int sum = a-b;
System.out.println("subtraction of two no:" + sum);
  
  }

 void mult(int a,int b)
  {
 
int sum = a*b;
System.out.println("muiltipication of two no:" + sum);
  
  }


 void div(int a,int b)
  {
 
int sum = a/b;
System.out.println("division of two no:" + sum);
  
  }


public static void main(String args[])
{
 Add a1 = new Add();
a1.add(2,5);
a1.sub(10,5);
a1.mult(2,3);
a1.div(4,2);}
}