package proj_pack;

import java.util.Scanner;

class Account
{
	String name;
	int acNo;
	static double roi=5.5;
	static int x=0;
	double bal;
	String type;
	
	Account(String nam,double bal,String type)
	{
		name=new String(nam);
		this.bal=bal;
		this.type=new String(type);
		acNo=++x;                              //new account created
	}
	void deposit(double amt)
	{
		bal=bal+amt;
		System.out.println("Amount deposited successfully!");
	}
	boolean Is_min_bal(double b)
	{
		if(b<500)
		{
			return true ;
		}
		else
		{
			return false;
		}
	}
	void withdraw(double wd)
	{
		
		if(Is_min_bal(bal-wd))
		{
			System.out.println("Amount cannot be withdrawn since minimum balance reached");
		}
		else
		{
			bal=bal-wd;
			System.out.println("Amount withdrawn successfully!");
		}
	}
	void display()
	{
		System.out.println("--Account Details--");
		System.out.println("Name:"+name);
		System.out.println("Account Number:"+acNo);
		System.out.println("Type of account:"+type);
		System.out.println("Balanace:"+bal);
	}
	static void disp_roi()
	{
		System.out.println("Rate of Interest:"+roi);
	}
}

class Account_demo
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int i,num;
    System.out.println("How many users do you want to input?:");
	num=sc.nextInt();
	Account arr[] = new Account[num];
	for(i=0;i<num;i++)
	{
	 System.out.println("Enter new user details:");
     sc.nextLine();
     System.out.println("Enter name:");
     String name=sc.nextLine();
     System.out.println("Enter balance:");
     double bal=sc.nextDouble();
     sc.nextLine();
     System.out.println("Enter Type:");
     String type=sc.nextLine();
	 arr[i]=new Account(name,bal,type);
	 int op;
	 do {

		 System.out.println("Enter (1)To deposit (2)To withdraw (3)To display (4)Exit");
		 op=sc.nextInt();
	 switch(op)
	 {
	    case 1:
	    	System.out.println("Enter amount to be desposited:");
		    double amt=sc.nextDouble();
		    arr[i].deposit(amt);
		break;
	    case 2:
	    	System.out.println("Enter amount to be withdrawn:");
			double wd=sc.nextDouble();
			arr[i].withdraw(wd);
		break;
	    case 3:
	    	    arr[i].display();
	    	    Account.disp_roi();
	    break;   
	 }
	}while(op!=4);
  }
	
  }
}
