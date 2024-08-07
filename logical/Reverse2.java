import java.util.*;
public class Reverse2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no:");
   int num=sc.nextInt();
int res=0;
while(num!=0){
    int rem=num%10;
     res=res*10+rem;
     num=num/10;}
System.out.println("reverse no is:"+ res);
        
        }
    }

