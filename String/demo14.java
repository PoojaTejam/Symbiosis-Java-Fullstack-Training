import java.util.Scanner;

public class demo14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String url = scanner.nextLine();
	System.out.print("Enter the start string: ");
        String startStr = scanner.nextLine();
	
	 
        if (url.startsWith(startStr)) {
            System.out.println(url+" "+ "starts with" +" "+ startStr);
        } else {
            System.out.println(url+" "+ "does not start with" +" "+ startStr);
        }


    }
}
