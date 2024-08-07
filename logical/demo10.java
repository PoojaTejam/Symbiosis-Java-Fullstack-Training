import java.util.*;
public class demo10{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   System.out.println("enter num:");
    int num1=sc.nextInt();
    int num2;
int max=num1;
int min=num1;
while(true){
  System.out.println("enter num:");
    num2=sc.nextInt();
    if(num2<0){
    break;
}else{
if(num2>max){
max=num2;
System.out.println(" max no:"+max);
}
else if(min<num2){
min=num2;
System.out.println(" min no:"+min);}
}
}






}}