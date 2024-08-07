import java.util.Scanner;
public class Array3{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("enter size of :");
int n=sc.nextInt();

int arr1[] =new int[10];
System.out.println("enter arr element:");
   for(int i=0;i<5;i++){
		arr1[i]=sc.nextInt();
	   
                     }
   int max=0;
int min=arr1[0];
   for(int i=0;i<5;i++){
  
 max=arr1[i]>max?arr1[i]:max;
min=arr1[i]<min?arr1[i]:min;

                     }
		
System.out.println("max value:"+max);	
System.out.println("min value:"+min);	   
	   


}
}