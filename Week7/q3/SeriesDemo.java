package proj5;

import java.util.Scanner;

interface Series
{
	int getNext();
	void reset();
	void setStart(int x);
}
class ByTwos implements Series
{
	int start;
	int value;
	
	public int getNext() {
		value=value+2;
		return value;
	}
	public void reset()
	{
		start=0;
		value=start;
	}
	public void setStart(int n)
	{
		start=n;
		value=start;
	}
}
class SeriesDemo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Series s;
		s=new ByTwos();
		int n,op;
		System.out.println("1.To create newSeries 2.To rest 3.To set start 4.Exit");
		do {
			System.out.println("Enter option:");
			op=sc.nextInt();
			switch(op)
			{
			case 1: System.out.println("Enter length of series:");
			        n=sc.nextInt();
			        int i;
			        System.out.println("Series is:");
			        for(i=0;i<n;i++)
			        {
			        	System.out.println(s.getNext()+" ");
			        }
			 break;
			case 2: s.reset();
			break;
			case 3:System.out.println("Enter start:");
			       int k=sc.nextInt();
			       s.setStart(k);
			break;
			}
		}while(op!=4);
		
	}

}
