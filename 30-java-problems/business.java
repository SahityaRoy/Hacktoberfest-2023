import java.util.*;
public class balance{
    public static void main(String[]args){
    System.out.println("Enter the amount:");
    Scanner sc= new Scanner(System.in);
    long amt = sc. nextLong();
    long damt=0;
    if(amt>1000){
        damt= amt*10/100;
          System.out.println("your balance is" +(amt-damt));
         return; 
        }
    }
}