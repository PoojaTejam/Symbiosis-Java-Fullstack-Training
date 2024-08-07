import java.util.Scanner;
public class demo3{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
 System.out.println("enter num1:");
 int n1=sc.nextInt();

 System.out.println("enter num2:");
 int n2=sc.nextInt();

 System.out.println("enter num3:");
 int n3=sc.nextInt();


if (n1>n2 && n1>n3){
     System.out.println("num1 is greater");
      }
else if(n2>n3){
     System.out.println("num2 is grater");
      }
else{
    System.out.println("num3 is greater");
    } 
}}