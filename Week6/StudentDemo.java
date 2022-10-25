import java.util.Scanner;

class Student
{
	String name;
	int ID;
	
	Student(String name, int ID)
	{
		this.name=name;
		this.ID=ID;
	}
}

class Sports extends Student
{
	int s_grade;
	Sports(String name, int Id, int sGrade)
	{
		super(name,Id);
		s_grade=sGrade;
	}
}

class Exam extends Student
{
	int e_grade;
	Exam(String name, int Id, int eGrade)
	{
		super(name,Id);
		e_grade=eGrade;
	}
}

class Results extends Sports
{
	Exam e;
	char finalResult;
	int result;
	
	Results(String name, int Id, int sGrade, int eGrade)
	{
		super(name,Id,sGrade);
		e=new Exam(name,Id,eGrade);
	}
	
	void displayResult()
	{
		int result=s_grade+e.e_grade;
		
		if(result>=90&&result<=100)
		{
			finalResult='A';
		}
		else if(result>=80&&result<=89)
		{
			finalResult='B';
		}
		else if(result>=70&&result<=79)
		{
			finalResult='C';
		}
		else if(result>=60&&result<=69)
		{
			finalResult='D';
		}
		else if(result>=50&&result<=59)
		{
			finalResult='E';
		}
		else
		{
			finalResult='F';
		}
		
		System.out.println("Result is: " + finalResult);
		
	}
}

class StudentDemo
{
	public static void main(String[] args)
	{
		Results r = new Results("Rithika",210905002,50,49);
		r.displayResult();
	}
}
