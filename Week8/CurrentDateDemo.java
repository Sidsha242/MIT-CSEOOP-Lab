package proj6;

import java.util.*;


class InvalidDayException extends Exception
{
    void display()
    {
        System.out.println("Day is not valid");
    }
}
class InvalidMonthException extends Exception
{
      void display()
      {
         System.out.println("Month is not valid");
      }
 }

class CurrentDate 
{
    int day;
    int  month;
    int year;
  
    CurrentDate(int d,int m,int y)
    {
      day=d;
      month=m;
      year=y;
    }
     
    static void createDate() throws InvalidMonthException,InvalidDayException
    {
        Scanner sc=new Scanner(System.in);
        int darr[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("Enter year:");
        int y=sc.nextInt();
        System.out.println("Enter month:");
        int m=sc.nextInt();
        if(m>12)
        {
            throw new InvalidMonthException();
        }
        System.out.println("Enter day:");
        int d=sc.nextInt();
        if(d>darr[m])
        {
            throw new InvalidDayException();
        }
        CurrentDate ob=new CurrentDate(d,m,y);
        ob.display();

    }
    
 void display()
  {
      System.out.println("--Date--");
      System.out.println(day+"/"+month+"/"+year);
  }
}

class CurrentDateDemo
{
   public static void main(String args[])
   {
      try{
      CurrentDate.createDate();
     }
     catch(InvalidMonthException e)
     {
         e.display();
     }
     catch(InvalidDayException e)
     {
       e.display();
     }
      
   }
}
      
