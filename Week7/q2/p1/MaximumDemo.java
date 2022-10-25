package proj_pack4.p1;

import proj_pack4.myPackages.p1.Maximum;

class MaximumDemo {
	
	public static void main(String args[])
	{
		Maximum ob=new Maximum();
		System.out.println(ob.max(1,2,3));
		System.out.println(ob.max(2.5f,7.8f,2.1f));
		int arr1[]= {1,3,4,5,9};
		System.out.println(ob.max(arr1));
		int arr2[][]= {{1,3},{2,4},{5,1}};
		System.out.println(ob.max(arr2,3,2));
		
	}

}
