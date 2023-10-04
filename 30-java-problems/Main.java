import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get input from user
    System.out.print("Enter a character: ");
    char Char = scanner.nextLine().charAt(0);

    // Check if the input is a digit or a letter
    if (Character.isDigit(Char)) {
      System.out.println("The input is a digit.");
    } else if (Character.isLetter(Char)) {
      System.out.println("The input is a letter.");
    } else {
      System.out.println("The input is neither a digit nor a letter.");
    }
  }
}
