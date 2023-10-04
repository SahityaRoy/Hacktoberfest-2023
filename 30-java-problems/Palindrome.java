
public class Palindrome {
  public static void main(String[] args) {
    int num = 12321; // example number
    int temp = num;
    int reverse = 0;

    // reverse the number
    while (temp != 0) {
      int digit = temp % 10;
      reverse = reverse * 10 + digit;
      temp /= 10;
    }

    // check if the number is a palindrome
    if (num == reverse) {
      System.out.println(num + " is a palindrome");
    } else {
      System.out.println(num + " is not a palindrome");
    }
  }
}






