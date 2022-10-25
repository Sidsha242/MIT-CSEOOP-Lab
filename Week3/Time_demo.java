import java.util.*;
class Time
{
  long hrs,min,sec;
  void assign(long h,long m,long s)
  {
    hrs=h;
    min=m;
    sec=s;
  }
  void display()
  {
    System.out.println(hrs+":"+min+":"+sec);
  }
  long timetosec()
  {
    long seconds=hrs*3600+min*60+sec;
    return seconds;
  }
  Time sectotime(long seconds)
  {
     Time timeobj=new Time();
     timeobj.hrs =seconds/3600;
     timeobj.min =(seconds % 3600)/60;
     timeobj.sec=seconds%60;
   
    return timeobj;
  }

  Time add(Time c2)
  {
     long t1=this.timetosec();
     long t2=c2.timetosec();
      
    return (sectotime(t1+t2));
   
  }
  Time sub(Time c2)
  {
     long t1=this.timetosec();
     long t2=c2.timetosec();

    return (sectotime(t1-t2));
  }
  void cmp(Time c2)
  {
     long t1=this.timetosec();
     long t2=c2.timetosec();
    
    if(t1>t2)
    {
       System.out.println("Time 1 is greater");
    }
    else
    {
      System.out.println("Time 2 is greater");
    } 
  }
}
class Time_demo
{
  public static void main(String args[])
  {
    Time c1=new Time();
    c1.assign(10,40,10);
    c1.display();
    Time c2=new Time();
    c2.assign(7,10,5);
    c2.display();
    Time res1=c1.add(c2);
    Time res2=c1.sub(c2);
    c1.cmp(c2);
  }
}
    

