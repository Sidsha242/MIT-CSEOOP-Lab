package proj6;


import java.util.*;

class Student{
	int rollno;
	int marks;
	Scanner sc=new Scanner(System.in);
	void getNumber()
	{
		rollno=sc.nextInt();
	}
	void getMarks()
	{
		marks=sc.nextInt();
	}
	void putNumber()
	{
		System.out.print(rollno);
	}
	void putMarks()
	{
		System.out.print(marks);
	}
}

interface Sports{
	void putGrade();
}

class Result extends Student implements Sports
{
	Result()
	{
		this.getNumber();
		this.getMarks();
	}
	
	public void putGrade()
	{
		if(super.marks>=90 && super.marks<=100)
		{
			System.out.println("A+");
		}
		else if(super.marks>=80 && super.marks<90)
		{
			System.out.println("A");
		}
		else if(super.marks>=70 && super.marks<80)
		{
			System.out.println("B");
		}
		else if(super.marks>=60 && super.marks<70)
		{
			System.out.println("C");
		}
		else if(super.marks>=50 && super.marks<60)
		{
			System.out.println("D");
		}
		else if(super.marks>=40 && super.marks<50)
		{
			System.out.println("E");
		}
		else
		{
			System.out.println("F");
		}
	}
	
}
public class Resultdemo {
	public static void main(String args[])
	{
		Result res[];
		System.out.println("Enter the number of students:");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		res=new Result[n];
		System.out.println("Enter the student RollNo and Marks:");
		for(int i=0;i<n;i++)
		{
			System.out.println("--Enter new student details--");
			res[i]=new Result();
		}
		System.out.println("The student details are:-");
		System.out.println("RollNo\tMarks\tGrade\n");
		for(int i=0;i<n;i++)
		{
			res[i].putNumber();
			System.out.print("\t");
			res[i].putMarks();
			System.out.print("\t");
			res[i].putGrade();
		}
	}

}
