class date{
    int dd, mm, yy;
    public void date(){
        dd=0;     //default constructor
        yy=0;
        mm=0;    
    }
    public date (int d,int m, int t){ // parametrized constructor
        dd=d;
        mm=m;
        yy=t;
    }
    public void usetest(){
      date date1 = new date(1,1,2022);
      System.out.println(date1.dd +"/" +date1.mm +"/" +date1.yy);
    

      
    }
    }
