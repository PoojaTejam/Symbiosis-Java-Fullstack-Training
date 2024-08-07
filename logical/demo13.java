import java.util.Scanner;
public class demo13{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
 System.out.println("enter x:");
 int x=sc.nextInt();

 System.out.println("enter y:");
 int y=sc.nextInt();

 System.out.println("enter z:");
 int z=sc.nextInt();


if (x<y && x<z){
     System.out.println("L1 is minimal");
      }
else if(y<z){
     System.out.println("L2 is minimal");
      }
else{
    System.out.println("L3 is minimal");
    } 
}}