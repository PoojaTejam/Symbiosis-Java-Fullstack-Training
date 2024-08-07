import java.util.Scanner;
public class demo5{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
 System.out.println("enter num1:");
int n1 =sc.nextInt();

 System.out.println("enter num2:");
 int n2=sc.nextInt();

 System.out.println("enter operator:");
 char op=sc.next().charAt(0);
  
if(op=='+'){
int add=n1+n2;
System.out.println("addtion of no:" + add);
}
else if(op=='-'){
int sub=n1-n2;
System.out.println("subtraction of no:" + sub);
}

else if(op=='*'){
int mult=n1*n2;
System.out.println("multipication of no:" + mult);

}

else if(op=='/'){
int div=n1/n2;
System.out.println("division of no:" + div);
}

}}
 