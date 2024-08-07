
public class PrintfExample{
    public static void main(String[] args) {
        double pi = 3.141592;
        int precision = 3;
        System.out.printf("The value of pi with %d decimal places is: %.3f", precision, pi);
    
        String name = "Senthil";
        int age = 15;
        System.out.printf("\nHello, my name is %s and I am %d years old.", name, age);
 
        String name2 = "Senthil";
        int age2 = 30;
        double salary = 50000.50;
        System.out.printf("\nName: %s, Age: %d, Salary: %.2f", name2, age2, salary);
 
        boolean isJavaFun = true;
        System.out.printf("\nIs Java fun? %b", isJavaFun);
    }
}