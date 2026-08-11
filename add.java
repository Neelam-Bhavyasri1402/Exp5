import java.util.Scanner; // Import the Scanner class to read user input

public class AdditionProgram {
    public static void main(String[] args) {
        // Create a Scanner object to read data from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Calculate the sum of the two numbers
        int sum = number1 + number2;

        // Display the final result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);

        // Close the scanner object to prevent memory leaks
        scanner.close();
    }
}
