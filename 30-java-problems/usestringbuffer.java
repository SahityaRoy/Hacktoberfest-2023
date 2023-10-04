
/*create a class account that stores a variable balance . the class has methods to start account ;to deposit money, to withdraw money and 
 to tell the current balance amount. the program should include another class to test the class account*/
 public class account{
    static double balance;
    public void start_account( double amount) {
        balance = amount;
        
    }
    public void deposit_money(double amount){
        balance+= amount;
    }
    public void withdraw_money(double amount){
        balance-= amount;
    }
      public double get_balance(){
          return balance;
      }
    }
    
    /*class quadratic{
     public void quadratic() {
         double x, value;
         x=4.0;
         value=3*x*x-8*x+4;
         System.out.println("at" + x + "the value is" +value); 
     }
}*/





