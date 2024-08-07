import java.util.Scanner;

public class demo15{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         
        System.out.print("Enter the radius: ");
        double r = s.nextDouble();
      
        if (1<=r && r<=1000) {
		double area = 3.14*r*r;
		double circum= 2*3.14*r;
            System.out.println("area of circle:" +area);
	    System.out.println("circumference of circle:" +circum);
        }
	 else {
            System.out.println("-1");
            }

    }
}
