package proj_pack;

class Counter
{
	static int num=0;
	
	Counter()
	{
	 num=num+1;
	}
	
	static void showCount()
	{
		System.out.println("The number of objects:"+num);
	}
}

class Counter_demo
{
	public static void main(String args[])
	{
	  Counter ob1=new Counter();
	  Counter ob2=new Counter();
	
	  Counter.showCount();
	}
}