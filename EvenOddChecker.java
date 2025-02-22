import java.util.Scanner;

public class EvenOddChecker {

    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter an integer: ");
        
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
            System.exit(1);
        }
        return number;
    }

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
    
    public static void main(String[] args) {
        int number = getIntegerInput();
        String result = checkEvenOrOdd(number);
        System.out.println(result);
    }
}
