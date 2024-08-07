import java.util.*;
 class Base{

Scanner sc = new Scanner(System.in);
int i,j;	
	 public void input(){
 		System.out.println("enter value for i j");
 		 i = sc.nextInt();
		 j = sc.nextInt();}
}


class child extends Base{

    public void sum(){
	int c= i+j;
    System.out.println("sum of two no is:" + c);
			}

}

class subchild extends child{
  
   public void display(){
	double d=Math.pow(i,j);
    System.out.println("power of two no is:"+d);}
  
  public static void main(String args[]){			
  subchild s = new subchild();
   s.input();
   s.sum();
   s.display();
}

}