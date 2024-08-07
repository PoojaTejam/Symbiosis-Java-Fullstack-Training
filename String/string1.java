import java.util.*;
public class string1{
public static void main(String []args){
String s1 = "Bhagirath";
System.out.println("S1:"+s1);

System.out.println("S1 length:"+s1.length());
System.out.println("S1 lower:"+s1.toLowerCase());
System.out.println("S1 lower:"+s1.toUpperCase());
System.out.println("S1 replace a with z:"+s1.replace('a','z'));
System.out.println("S1 index:"+s1.indexOf('e'));
System.out.println("S1 last index:"+s1.lastIndexOf('e'));

String s2="ViewSonic";
System.out.println("S2:"+s2);
System.out.println("trim:"+s1.trim()+s2.trim());
System.out.println("equals:"+s1.equals(s2));
System.out.println("equal ignore:"+s1.equalsIgnoreCase(s2));
System.out.println("compare:"+s1.compareTo(s2));
System.out.println("concat:"+s1.concat(s2));
System.out.println("substr:"+s1.substring(5));

System.out.println("substr(n,m):"+s1.substring(5,8));
System.out.println("tostr:"+s1.toString());
int i=100;
System.out.println("value of:"+(s1.valueOf(i)).length());




}
}