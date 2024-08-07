import java.util.Scanner;
public class inputint{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter int :");

int i=0;
for(;;i++){
int n=sc.nextInt();
if(n>0 && n<=8){
  System.out.println("correct input number");
 break;
            }
else{
 System.out.println("wrong input number");

   }

}
}}