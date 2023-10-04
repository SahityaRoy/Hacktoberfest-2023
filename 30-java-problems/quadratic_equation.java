public class quadratic_equation{
    public static void roots(double a, double b, double c){
        double d, root1, root2;
        if(a==0)
        System.out.println("the value of a should not be zero");
        else{
         d= b*b- 4*a*c;
         if(d>0){
         root1= (-b +Math.sqrt(d))/2*a;
         root2= (-b -Math.sqrt(d))/2*a;
         System.out.println("roots are real and unequal");
         System.out.println("ROOT1" + root1 + "ROOT2" + root2);
        }
        else 
        System.out.println(" roots are complex and imaginary");
}}
public static void main(String[]args){
    roots(4,2,2);
    roots(1,2,3);
}}