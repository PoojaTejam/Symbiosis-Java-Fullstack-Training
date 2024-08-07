import java.util.*;
public class string3{
public static void main(String []args){
Scanner s= new Scanner(System.in);
int count=1;
System.out.println("enter string:");
String str1 =s.nextLine();

for(int i=0;i<=str1.length()-1;i++)
{
 	if(str1.charAt(i)==' ' ){
	count=count+1;
	
			}
}
System.out.println("No of words in a string:"+count);


}}