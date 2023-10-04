// write a program that accepts a string and returns a reversed string...
import java.io.*;
public class temperature{
   
    public  void fahTocelcius(float tempF ){
     float tempC=(tempF-32)/5/9;
    System.out.println("temperature in celcius is "+tempC);

}
public void celciusTofah( float tempC){
    float tempF= (tempC*1*8F)+32;
    System.out.println("the temperature in fahrenheit is" +tempF);
    
    
}
public static void main(String[]args){
    System.out.println("fahrenheit to celcius conversion");
    System.out.println(" celcius to fahrenheit conversion");
    System.out.println("enter your choice");
    int ch=0;
    DataInputStream in = new DataInputStream(System.in);
    try
{
    ch=in.readInt();
}
catch(Exception e){System.out.println("Exception"+e);
return;}


float tmp=0;
//System.out.println("enter the temperature to be converted ");
try{
    tmp=in.readFloat();
}
catch(Exception e){
    System.out.println("exception"+e);
    return;
    
} temperature ms = new temperature();
if(ch ==1) 
ms.fahTocelcius(tmp);
else{
   ms. celciusTofah(tmp);
}
System.out.println("ends here...");
}}