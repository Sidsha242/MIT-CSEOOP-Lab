package proj_pack;

import java.util.*;
class Time
{
  long hrs,min,sec;
  Time ()
  {
	  hrs=0;
	  min=0;
	  sec=0;
  }
  Time (long h,long m,long s)
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
	Scanner sc=new Scanner(System.in);
	int h1,m1,s1,h2,m2,s2;
	System.out.println("Enter hour mins and seconds of time 1:");
	h1=sc.nextInt();
	m1=sc.nextInt();
	s1=sc.nextInt();
    Time c1=new Time(h1,m1,s1);
    c1.display();
    System.out.println("Enter hour mins and seconds of time 2:");
	h2=sc.nextInt();
	m2=sc.nextInt();
	s2=sc.nextInt();
    Time c2=new Time(h2,m2,s2);
    c2.display();
    Time res1=c1.add(c2);
    Time res2=c1.sub(c2);
    System.out.println("Addition Result:"+res1.hrs+":"+res1.min+":"+res1.sec);
    System.out.println("Subtraction Result:"+res2.hrs+":"+res2.min+":"+res2.sec);
    c1.cmp(c2);
  }
}
    

