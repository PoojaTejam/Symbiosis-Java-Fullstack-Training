import java.util.*;
public class string2{
public static void main(String []args){
Scanner s= new Scanner(System.in);
int vowel=0;
int con=0;
System.out.println("enter string:");
String str1 =s.nextLine();

for(int i=0;i<=str1.length()-1;i++)
{
if (str1.charAt(i)=='a'|| str1.charAt(i)=='e'|| str1.charAt(i)=='i'|| str1.charAt(i)=='o'|| str1.charAt(i)=='u')
	{
   	vowel++;
   
	}
 else{
  	con++;
	}
}
System.out.println("no of vowels"+vowel);
System.out.println("no of consonate"+con);

}}