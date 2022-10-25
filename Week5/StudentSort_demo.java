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
   
   /*void display()
   {
        System.out.println("--Student Details--");
        System.out.println("Name:"+name);
        System.out.println("RegistrationNumber:"+regNo);
        System.out.print("Date of Joining:"+gcal.get(Calendar.DATE)+"," +gcal.get(Calendar.MONTH) + ","+ gcal.get(Calendar.YEAR) + "\n");
        System.out.println("Semester:"+sem);
        System.out.println("GPA:"+GPA);
        System.out.println("CGPA:"+CGPA);
        System.out.println("");
   }*/
 
    static void sort_sem(Student arr[])
   {
       int i,j;
       Student temp;
       int n=arr.length;
       for(i=0;i<n-1;i++)
       {
         for(j=0;j<n-i-1;j++)
         {
             if(arr[j].sem>arr[j+1].sem)
             {
                 temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }
         }
       }    

   }
   static void sort_CGPA(Student arr[])
   {
      int i,j;
      Student temp;
       int n=arr.length;
       for(i=0;i<n-1;i++)
       {
         for(j=0;j<n-i-1;j++)
         {
             if(arr[j].CGPA>arr[j+1].CGPA)
             {
                 temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }
         }
       }    

   }
   static void sort_name(Student arr[])
   {
	   int i,j;
	   Student temp;
	   int n=arr.length;
	   for (i=0;i<n-1;i++) {
           for (j=0;j<n-i-1;j++) 
           {
               if (arr[j].name.compareTo(arr[j].name) > 0) 
               {
                   temp=arr[j];
                   arr[j]= arr[j+1];
                   arr[j+1]= temp;
               }
           }
       }
   }
   
   void sort_display()
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
class StudentSort_demo
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
   System.out.println("Sort by: (1)Semester (2)CGPA (3)Name");
   int op=sc.nextInt();
   switch(op)
   {
     case 1: System.out.println("Sorting by Semester");
             Student.sort_sem(arr);
     break;
     case 2: System.out.println("Sorting by CGPA");
             Student.sort_CGPA(arr);
     break;
     case 3: System.out.println("Sorting by Name");
             Student.sort_name(arr);
     break;
   }
   for(i=0;i<num;i++)
   {
     arr[i].sort_display();
   } 
}
}



