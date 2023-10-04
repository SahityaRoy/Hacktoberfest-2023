import java.io.*;
import java.util.*;
class string_prop
{
    public static void main (String[] args)
    {
                   String s= "LIZABHUTANI";
        // or String s= new String ("LIZABHUTANI");
  
        // Returns the number of characters in the String.
        System.out.println("String length = " + s.length());
  
        // Returns the character at ith index.
        System.out.println("Character at 3rd position = "
                           + s.charAt(3));
  
        // Return the substring from the ith  index character
        // to end of string
        System.out.println("Substring " + s.substring(3));
  
        // Returns the substring from i to j-1 index.
        System.out.println("Substring  = " + s.substring(2,5));
  
        // Concatenates string2 to the end of string1.
        String s1 = "liza";
    String s2 = "bhutani";
        System.out.println("Concatenated string  = " +
                            s1.concat(s2));
  
        // Returns the index within the string
        // of the first occurrence of the specified string.
        String s4 = " THE TAJ MAHAL";
        System.out.println("Index of MAHAL " + 
                           s4.indexOf("MAHAL"));
  
        // Returns the index within the string of the
        // first occurrence of the specified string,
        // starting at the specified index.
        System.out.println("Index of M  = " + 
                           s4.indexOf('M'));
  
        // Checking equality of Strings
        Boolean out = "LIZA".equals("LIZA");
        System.out.println("Checking Equality  " + out);
        out= "LIZA".equals("LIZA");
        System.out.println("Checking Equality  " + out);
  
        out = "LIZA".equalsIgnoreCase("AZIL ");
        System.out.println("Checking Equality " + out);
          
        //If ASCII difference is zero then the two strings are similar
        int out1 = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is="+out1);
        // Converting cases
        String word1 = "THIS IS LIZA BHUTANI";
        System.out.println("Changing to lower Case " +
                            word1.toLowerCase());
  
        // Converting cases
        String word2 = "hello";
        System.out.println("Changing to UPPER Case " + 
                            word2.toUpperCase());
  
        // Trimming the word
        String word4 = " Learn Share Learn ";
        System.out.println("Trim the word " + word4.trim());
  
        // Replacing characters
        String str1 = "THE EIFFEL TOVER";
        System.out.println("Original String " + str1);
        String str2 = "THE EIFFEL TOVER".replace('V' ,'W') ;
        System.out.println("Replaced V with W -> " + str2);
    } 
}