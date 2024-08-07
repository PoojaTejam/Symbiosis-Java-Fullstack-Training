import java.util.Scanner;
public class Array2{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("enter size of :");
int n=sc.nextInt();

int arr1[] =new int[10];
System.out.println("enter arr element:");
   for(int i=0;i<5;i++){
		arr1[i]=sc.nextInt();
	   
        }
 System.out.println("enter no to be search:");
 int s =sc.nextInt();
 int count=0;
  for(int i=0;i<n;i++){
	
	if( s==arr1[i]){

		count++;
          }
}

 System.out.println("freq is:"+ count);
}}