import java.util.Scanner;
 class prime{

int flag=0;
int n;
	public void cal(){
	Scanner sc = new Scanner(System.in);
	 System.out.println("enter number:");
	  n =sc.nextInt();
		for(int i=2;i<n/2;i++){
		if(n%i==0){
			flag=1;
			break;
		      }
	else{
		flag=0;
		}
		
				}
if(flag==0){
   System.out.println("prime no");
          }
	else{
 System.out.println("not a prime no");
           }
}}

public class primeno{

public static void main(String []args){


prime p =new prime();
p.cal();

}



}