import java.util.*;
public class composite_num{
    public static void main(String[]args)
{   
    System.out.println("enter the value for which you want to check that number is composite or not ");
     Scanner sc= new Scanner(System.in);
     int n= sc. nextInt();
     boolean composite =false;
    for(int i=2;i<=n;i++){
        if(n%i==0){
             composite =true; break;
        }
        if(composite){
            System.out.println("this is a composite number");
        }
        else{
            System.out.println("this is not a palindrome number");
        }
    }
    
}}