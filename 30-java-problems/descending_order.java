import java.util.Scanner; // Import the Scanner class

public class descending_order {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Create a Scanner object

    System.out.println("Enter the first integer:");
    int num1 = scanner.nextInt(); // Read the first integer

    System.out.println("Enter the second integer:");
    int num2 = scanner.nextInt(); // Read the second integer

    System.out.println("Enter the third integer:");
    int num3 = scanner.nextInt(); // Read the third integer

    // Sort the numbers in descending order
    int max = Math.max(num1, Math.max(num2, num3));
    int min = Math.min(num1, Math.min(num2, num3));
    int middle = num1 + num2 + num3 - max - min;

    System.out.println("The numbers in descending order are: " + max + ", " + middle + ", " + min);
  }
}