import java.util.*;
public class perfect_number{
public static boolean palindrome(int num){
    int temp=num;
    int sum=0;
    int rev=0;
    int dig;
    while (temp>0){
        dig= num%10;
        rev= (rev*10)+dig;
        dig=num/10;
    }
    if(rev==num)
    return true;
    else
    return false;
}
public static boolean perfect_number(int num) {
    int sum=0;
    for(int i=0;i<num;i++){
        if(num%i==0){
            sum+=i;
        }    }
        if(sum==num)return true;
        else return false;
    }
    
}