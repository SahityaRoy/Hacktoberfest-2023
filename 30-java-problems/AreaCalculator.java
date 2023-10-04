import java.util.Scanner;

public class AreaCalculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("1. Square");
    System.out.println("2. Circle");
    System.out.println("3. Rectangle");
    System.out.print("Enter your choice: ");
    int choice = scanner.nextInt();

    switch (choice) {
      case 1:
        // Calculate area of square
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        double area = calculateSquareArea(side);
        System.out.println("The area of the square is " + area);
        break;
      case 2:
        // Calculate area of circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        area = calculateCircleArea(radius);
        System.out.println("The area of the circle is " + area);
        break;
      case 3:
        // Calculate area of rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();
        area = calculateRectangleArea(width, height);
        System.out.println("The area of the rectangle is " + area);
        break;
      default:
        System.out.println("Invalid choice.");
    }
  }

  public static double calculateSquareArea(double side) {
    return side * side;
  }

  public static double calculateCircleArea(double radius) {
    return Math.PI * radius * radius;
  }

  public static double calculateRectangleArea(double width, double height) {
    return width * height;
  }
}