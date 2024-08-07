import java.util.Scanner;
public class demo1{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
 System.out.println("enter name:");
 String name =sc.next();

 System.out.println("enter Salary:");
 int salary =sc.nextInt();
 
 System.out.println("enter withdrawal amt:");
 int Wamt=sc.nextInt();
 

  int finalamt= salary - Wamt;
System.out.println("final salary :" + finalamt);

}}