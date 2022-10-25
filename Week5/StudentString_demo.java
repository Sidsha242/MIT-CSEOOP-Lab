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
 
  static void start_char(Student arr[],char c)
  {
	  System.out.println("Names Starting with "+c+" is:");
	  int n=arr.length;
	  int i;
	  for(i=0;i<n;i++)
	  {
	   if( arr[i].name.charAt(0) == c)
	   {
		  System.out.println(arr[i].name);
	   }
	  }
  }
  static void sub_str(Student arr[],String str)
  {
	  System.out.println("Names with substring "+str+" is:");
	  int n=arr.length;
	  int i;
	  for(i=0;i<n;i++)
	  {
	   if(arr[i].name.indexOf(str) != -1)
	   {
		  System.out.println(arr[i].name);
	   }
	  }
	  
  }
  static void initial(Student arr[])
  {
	  int n=arr.length;
	  int i,j;
	  for(i=0;i<n;i++)
	  {
	   int len = arr[i].name.length();
	   String nam=arr[i].name;
       nam = nam.trim();
       String na="";
       String str1 = "";
       for (j=0;j<len;j++) 
       {
          char ch = nam.charAt(j);
         if (ch != ' ') {
            str1 = str1 + ch;
          } 
         else 
         {
        	na= Character.toUpperCase(str1.charAt(0)) + ". ";
            System.out.print(Character.toUpperCase(str1.charAt(0)) + ". ");
            str1 = "";
         }
      }
       String str2 = "";
       for (int k = 0; k < str1.length(); k++)
       {
          if (j == 0)
            str2 = str2 + Character.toUpperCase(str1.charAt(0));
          else
            str2 = str2 + Character.toLowerCase(str1.charAt(k));
      }
      System.out.println(str2);
      arr[i].name=na+str2;
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
class StudentString_demo
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
   System.out.println("Enter Character to be checked");
   char c = sc.next().charAt(0); 
   Student.start_char(arr,c);
   sc.nextLine();
   System.out.println("Enter substring to be checked");
   String sub=sc.nextLine();
   Student.sub_str(arr,sub);
   Student.initial(arr);
   
   
   
   
   /*System.out.println("Sort by: (1)Semester (2)CGPA (3)Name");
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
   */
   
   for(i=0;i<num;i++)
   {
     arr[i].sort_display();
   }
}
}


