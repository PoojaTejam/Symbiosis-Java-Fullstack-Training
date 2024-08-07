import java.util.*;
public class palindrom {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no:");
   int num=sc.nextInt();
int res=0;
int temp=num;
while(num!=0)
{
     int rem=num%10;
     res=res*10+rem;
     num=num/10;
}  
if (temp==res){
System.out.println("num is palindrom:");
}  
else{
System.out.println("not a palindrom:");
}    
  }
   }