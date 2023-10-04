public class SOLUTION {
    /* public static void main(String args[]){
        int k=1;
        int i=2;
        while(++i<6){
            k*=i;
            System.out.println(k);
        }}
    }*/
 public void test(){
     int count=0;
      for (int i=0;i<3;i++)
          
          for(int j=0;j<4;j++)
          for(int k=0;k<5;k++){
              resume:
              ++count;
              if(i==1&& j==2&& k==3)  break;
            
          System.out.println("count=" +count);
      }
    }
