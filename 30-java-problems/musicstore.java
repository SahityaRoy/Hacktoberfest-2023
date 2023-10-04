//access specifier supported by java are: private,public and protected...
// package- a group of logically related classes.
public class musicstore{
    
    void displayhoursofoperation(){
        System.out.println("store hours");
        System.out.println("daily: 9am - 9pm");
        
    }
}
class Demomusicstore{
    public void test(){
        musicstore ms= new musicstore();
        ms.displayhoursofoperation();
        
    }
    }
    
