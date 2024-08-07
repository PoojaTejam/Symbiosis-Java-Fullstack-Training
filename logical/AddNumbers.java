public class AddNumbers {
    public static void main(String[] args) {
        int num1 = 5, num2 = 10;
        int sum = num1 + num2;
        System.out.println("Sum of two numbers: " + sum);

        String binary1 = "1010", binary2 = "0101";
        int binarySum = Integer.parseInt(binary1, 2) + Integer.parseInt(binary2, 2);
        System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(binarySum));

        char char1 = 'A', char2 = 'B';
        int charSum = char1 + char2;
        System.out.println("Sum of two characters: " + charSum);
    }
}
