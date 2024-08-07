import java.util.Scanner;
public class demo7{
public static void main(String[] args){
String username="pooja";
int pw=123;
Scanner sc = new Scanner(System.in);
 System.out.println("enter username:");
 String Username =sc.next();

System.out.println("enter username:");

int Pw =sc.nextInt();

if(username.equals(Username))
{
    if(pw==Pw)
	{
	System.out.println("username and pw is valid ");
	}
   else
	{
	System.out.println(" password is invalid ");
	}}

   else{
     if (pw != Pw) {
                System.out.println("Both username and password are invalid.");
            } else {
                System.out.println("Username is invalid.");
            }
   }
}}
