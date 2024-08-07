import java.util.*;

public class ArrayListOper {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
      

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert element");
            System.out.println("2. Remove element");
            System.out.println("3. Sort elements");
            System.out.println("4. Display elements");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to insert: ");
			for(int i=0; i<=6;i++){
                    int ele = sc.nextInt();
                    list.add(ele);
                    System.out.println("Element inserted:"+list);}
                    break;
                case 2:
                    System.out.print("Enter element to remove: ");
                    int eleRemove = sc.nextInt();
                    if (list.remove(Integer.valueOf(eleRemove))) {
                        System.out.println("Element removed.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;
                case 3:
                    Collections.sort(list);
                    System.out.println("Elements sorted.");
                    break;
                case 4:
                    System.out.println("Elements in the list: " + list);
                    break;
                case 5:
			System.out.println("exit the menu.");
                     sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid value");
            }
        }
       
    }
}


