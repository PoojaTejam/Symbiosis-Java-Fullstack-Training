public class SwapNum{
 public static void main(String[] args){
	int a = 5;
	int b = 2;
System.out.println(" values before swap  "+ "a:"+ a +" "+"b:"+ b);	
  a = a + b;
 b = a - b;
 a = a - b;
System.out.println("values after swap  "+ "a:"+ a +" "+"b:"+ b);
}
}