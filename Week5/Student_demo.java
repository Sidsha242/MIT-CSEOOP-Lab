import java.util.*;

class Student
{
   int regNo;
   String name;
   short sem;
   float GPA;
   float CGPA;
   
   static int x=0;
   GregorianCalendar gcal;

   Student(String nam,int yr,int mon,int day,short semester,float GPA,float CGPA)
   {
       gcal=new GregorianCalendar(yr,mon,day);
       name=nam;
       sem=semester;
       this.GPA=GPA;
       this.CGPA=CGPA;
       x=x+1;
   }
      
   void regisNo()
   {
           regNo=(gcal.get(Calendar.YEAR)%100)*100+x;
   }
   void display()
   {
        System.out.println("--Student Details--");
        System.out.println("Name:"+name);
        System.out.println("RegistrationNumber:"+regNo);
        System.out.print("Date of Joining:"+gcal.get(Calendar.DATE)+"," +gcal.get(Calendar.MONTH) + ","+ gcal.get(Calendar.YEAR) + "\n");
        System.out.println("Semester:"+sem);
        System.out.println("GPA:"+GPA);
        System.out.println("CGPA:"+CGPA);
        System.out.println("");
   }


}
class Student_demo
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number of students:");
     int num=sc.nextInt();
     Student arr[]=new Student[num];
     int i;
     for(i=0;i<num;i++)
    {
      System.out.println("Enter new user details");
      System.out.println("Enter name:");
        sc.nextLine();
      String name=sc.nextLine();
      System.out.println("Enter Date of joining:");
      int day=sc.nextInt();
      int mon=sc.nextInt();
      int yr=sc.nextInt();
      System.out.println("Enter Semester:");
      short sem=sc.nextShort();
      System.out.println("Enter GPA:");
      float GPA=sc.nextFloat();
      System.out.println("Enter CGPA:");
      float CGPA=sc.nextFloat();
     

     arr[i]=new Student(name,yr,mon,day,sem,GPA,CGPA);
     arr[i].regisNo();
   }
   for(i=0;i<5;i++)
   {
     arr[i].display();
   } 
}
}





