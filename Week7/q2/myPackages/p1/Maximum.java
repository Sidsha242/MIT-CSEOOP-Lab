package proj_pack4.myPackages.p1;

public class Maximum {

public int max(int a,int b,int c)
{
	int max=0;
	if(a>b && a>c)
	{
		max=a;
	}
	else if(b>a && b>c)
	{
		max=b;
	}
	else
	{
		max=c;
	}
	return max;
}
public float max(float a,float b,float c)
{
	float max=0f;
	if(a>b && a>c)
	{
		max=a;
	}
	else if(b>a && b>c)
	{
		max=b;
	}
	else
	{
		max=c;
	}
	return max;
	
}
public int max(int arr[])
{
	int max=0;
	int l=arr.length;
	for(int i=0;i<l;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	return max;
}
public int max(int arr[][],int m,int n)
{
	int max=0;
	int i,j;
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			if(arr[i][j]>max)
			{
				max=arr[i][j];
			}
		}
	}
	return max;
}
}

