import java.util.*;
 public class automorphic_number{
     public static void main(String[]args){
       System.out.println("enter the value");
       Scanner sc= new Scanner(System.in);
       int num= sc.nextInt();
       int square= num*num;
       int numdig= (int)Math.log10(num) +1; // to count the number of digits in num
       int lastdig= square % (int) Math.pow(10, numdig);  // get the last numDigits digits of the square
       if(lastdig == num){
           System.out.println(" this is an automorphic number");
       }
       else{
           System.out.println("this is not a automorphic number");
       }
       
     }
 }