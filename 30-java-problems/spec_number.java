//write a program to check a nuumber is special or not ..  a special number means that eg-145 = 1!+4!=5!= 145 so consider it as special no.
import java.util.*;
public class spec_number{
    public static int faact(int n){
        int fact= 1;
        for(int i=1;i<=n;i++){
            fact*= +i;
        
        }return fact;
    }
  public static boolean specialnumber(int n){
      int n1=n, dig, sum=0;
      while(n1>0){
          dig=n%10;
          sum+=faact(dig);
  }
  if(sum==n) 
  return true;
  else 
  return false;
  
  }
  public static void main(String[]args){
      Scanner sc= new Scanner(System.in);
      System.out.println("enter number");
      int num= sc.nextInt();
      if(specialnumber(num)==true){
          System.out.println(num+ " is a special number");
          
      }else{
          System.out.println("not a special number");
      }
  }
    
}