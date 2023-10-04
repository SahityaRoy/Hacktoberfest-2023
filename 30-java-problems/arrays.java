// array-- collection of similar type od data..
/*  defining 1d array  is- 
type array-name[]= new type [size];
eg- int marks[]= new int[50];
int a[]={1,2,3,4,5}
if values of arrys are other than 0 to n-1 then they are called out of bounds subscripts  like a[]={-1,-2,-3,-5};
subscripts are the elements of array
defining 2d arrays - type aray_name [][]= new type [row][columns];
eg- int [] sales = new int [9][8];

 */

// program to calculate the grades of 10 students from 3 test scores.
public class arrays{
    public static void main(String[]args){
        float marks[][]= {  {40,40,40}, {50,50,50},{70,70,70},{80,80,80}};
        float total[]=new float[4];
        char grade[]=new char[4];
        float avg;
        for (int i=0;i<4;i++){
            total[i]=0;
            for(int j=0;j<3;j++){
                total[i]+=marks[i][j];
                avg= total[i]/3;
                if(avg<45.0){
                    grade[i]='D';}
                    else if(avg<60) {grade [i]= 'C';}
                    else if( avg<75){
                        grade[i]='B';
                    }
                    else grade[i]='A';}
                    
                        System.out.println("student" +(i+1));
                        System.out.println("total marks"+ total[i]);
                        System.out.println("grade" + grade[i]);
                    
                }
            
        }} 