// write a program that checks whether how ,many  character or vowels present in the string..
 import java.util.Arrays; 

public class string
 {
  public static void main(String[] args) {
    String string = "This is a test string";

    int vowelCount = 0;
    int characterCount = 0;
    for (int i = 0; i < string.length(); i++) {
      char c = string.charAt(i);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
          c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
        vowelCount++;
      }
      if (Character.isLetter(c))  // library function{
       { characterCount++;
      }
      
    }

   
    System.out.println("Original string: " + string);
    System.out.println("Number of vowels: " + vowelCount);
    System.out.println("Number of characters: " + characterCount);
    }
}