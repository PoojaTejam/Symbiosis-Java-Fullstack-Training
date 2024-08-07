import java.util.*;
class Base{
	
		protected int i,j;
		Scanner sc = new Scanner(System.in);
		public void input()
	{	
		
		System.out.println("enter value of i:");
		 i=sc.nextInt();

		System.out.println("enter value of j:");
		 j=sc.nextInt();


	}
	
}
class Child1 extends Base{

	
	public void sum(){
	int c= i + j;			
	System.out.println("sum of i and j:" +c);

			}
	
}

class Child2 extends Base{

	public void sub(){
	int d= i - j;			
	System.out.println("sum of i and j:" +d);

			}
	
	public static void main(String args[]) {
        Child1 c1 = new Child1(); 
        c1.input();
        c1.sum();
        
        Child2 c2 = new Child2();
        c2.input();
        c2.sub();	
}

}