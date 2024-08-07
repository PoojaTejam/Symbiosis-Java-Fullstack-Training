import java.util.*;
public class demo9{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 4 digit no:");
    int num=sc.nextInt();
	int a=num/1000;
	int b=(num/100)%10;
	int c=(num/10)%10;
	int d=num%10;
if((a+b)==(c+d)){
     
System.out.println("num is lucky");
}else{
System.out.println("num is  not lucky");
}
}}