import java.util.Scanner;
 class Area{

int l,b;
public void input(){
Scanner sc = new Scanner(System.in);
 System.out.println("enter length:");
 l =sc.nextInt();

 System.out.println("enter Breath:");
  b =sc.nextInt();
}

 public void cal(){
 int area1=l*l;
 System.out.println("area of square:" +area1);

  int area2= l*b;
System.out.println("area of rectangle:" + area2);
}

}
public class Areaclass{

public static void main(String[] args){

Area a = new Area();
a.input();
a.cal();
}
}