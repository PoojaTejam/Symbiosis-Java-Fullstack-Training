import java.util.Scanner;
public class demo4{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
 System.out.println("enter name:");
 String name =sc.next();

 System.out.println("enter Salary:");
 int salary =sc.nextInt();
 
 System.out.println("enter withdrawal amt:");
 int Wamt=sc.nextInt();
 
if (salary<25000){
  int finalamt= salary - Wamt;
System.out.println("final salary :" + finalamt);}

else(salary > 25000){
int tax = salary * 10/100;
int finalamt= salary - Wamt -tax;
System.out.println("final salary  with tax:" + finalamt);
}
}}