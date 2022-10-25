package proj_pack2;
import java.util.*;

class Date
{
   
   int yr;
   int mon;
   int day;
   Date(int yr,int mon,int d)
   {
     this.yr=yr;
     this.mon=mon;
     day=d;
    }
  public String toString()
  {
    return(day+"/"+mon+"/"+yr+"\n");
  
  }
}
class Person 
{
  private String name;
  private Date dob;

  Person(String n,Date ob)
  {
      name=n;
      dob=ob;
  }
  void set(String nam,Date ob)
  {
      name=nam;
      dob=ob;
  }

  String getnam()
  {
      return name;
  }

  Date getdob()
  { 
      return dob;
  }
 void display()
 {
    System.out.println(name+" "+dob);
 }
    

}
class CollegeGraduate extends Person
{
    private float GPA;
    private int yrg;
    
    CollegeGraduate(String nam,Date ob,float gp,int y)
    {
       super(nam,ob);
       GPA=gp;
       yrg=y;
    }
      void set(float gpa,int y)
      {
        GPA=gpa;
        yrg=y;
      }
     
    float getGpa()
    {
       return GPA; 
    }

    int getyr()
    {
       return yrg;
    }
  void display()
  {
    super.display();
    System.out.println(GPA+" "+yrg);
}

class Person_demo
{
   public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter name:");
   String name=sc.nextLine();
   System.out.println("Enter D.O.B:");
   int yr=sc.nextInt();
   int mon=sc.nextInt();
   int day=sc.nextInt();
   Date ob=new Date(yr,mon,day);
   System.out.println("Enter GPA:");
   float gpa=sc.nextFloat();
   System.out.println("Enter year of passing:");
   int y=sc.nextInt();
   CollegeGraduate obj=new CollegeGraduate(name,ob,gpa,y);
   obj.display();
 }
}
} 
   
   
  