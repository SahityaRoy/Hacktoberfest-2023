
   // read an integer using datainputstream and print whether it is even or odd;
   import java.io.*;
   class datastreams{
      public static void main(String[]args){
          DataInputStream in= new  DataInputStream (System.in);
          int n=0;
          try{
              System.out.println("enter a digit");
              n= in.readInt();
          }
      catch (Exception e){}
      if(n%2==0)
      System.out.println("you entered a even digit");
      else
          System.out.println("you entered a odd digit");
      
      
          
      }}

      
  /*comments -
   classes of java.io package-
   java.io . InputStream- stores information between an input device and the computer.
   java.io.InputStreamReader- translated byte types received from inputstream object into a stream of characters.
   java.io.BufferedReader- stores the input recieved from InputStreamReader object this is done to improve the efficiency.*/
   
   // Q- obtain some input from the user and print it..
   /*import java.io.*;
   public class myconsoleIO{
       // firstly creating a stringbuffereader for keyboard input.
        private static BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
        public static void main(String[]args) throws IOException{
           System.out.println("type some data for program");
           String input= stdin.readLine();
           System.out.println("input ="+input);
           
           
       }// main method ends here..
       /* */
       
       
   }
   
   
   