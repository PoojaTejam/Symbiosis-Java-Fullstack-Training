import java.util.Scanner;
public class Array{
public static void main(String[] args){
int sum=0;
float avg;

Scanner sc = new Scanner(System.in);
System.out.println("enter size of :");
int n=sc.nextInt();

int arr1[] =new int[10];
System.out.println("enter arr element:");
   for(int i=0;i<5;i++){
		arr1[i]=sc.nextInt();
		   sum=sum+arr1[i];
 	    
}
     System.out.println("sum of array no :"+ sum);
      avg=sum/5;
     System.out.println("avg of number :"+ avg);


}}