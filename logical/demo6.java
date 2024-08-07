import java.util.Scanner;
public class demo6{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
 System.out.println("enter principel amt:");
double P =sc.nextInt();

 System.out.println("enter time:");
 double T=sc.nextInt();

 System.out.println("enter rate amt:");
 double R=sc.nextInt();

//int SI=P*R*T/100;
//System.out.println("simple interest is:" + SI);

double CI = P * (Math.pow((1 + R / 100), T))-P;

System.out.println("compound interest is:" + CI);
}}