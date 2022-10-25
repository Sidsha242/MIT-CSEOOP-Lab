package proj_pack;

import java.util.*;

class Mixer
{
	int arr[]=new int [100];
	int n;
	Scanner sc=new Scanner(System.in);
	void accept()
	{
		int i;
		System.out.println("Enter n:");
		n=sc.nextInt();
		System.out.println("Enter sorted array without any duplicates");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	Mixer mix(Mixer B)
	{
		Mixer resobj=new Mixer();
		int l=this.n;
		int m=B.n;
		resobj.n=m+l;
		int i,j,k;
		i=j=k=0;
		while(i<l)
		{
			resobj.arr[k++]=this.arr[i++];
		}
		while(j<m)
		{
			resobj.arr[k++]=B.arr[j++];
		}
		i=j=k=0;
		while(i<l && j<m)
		{
			if(this.arr[i]<B.arr[j])
			{
				resobj.arr[k++]=this.arr[i++];
			}
		   else
		    {
			    resobj.arr[k++]=B.arr[j++];
		    }
		
       }
		return resobj;
   }
	void display()
	{
		int i;
		System.out.println("Merged array:");
		for(i=0;i<this.n;i++)
		{
			System.out.println(this.arr[i]);
		}
			
	}
 }
public class Mixer_demo
{
	public static void main(String args[])
	{
		Mixer A=new Mixer();
		A.accept();
		Mixer B=new Mixer();
		B.accept();
		Mixer res=new Mixer();
		res=A.mix(B);
		res.display();
	}
}


