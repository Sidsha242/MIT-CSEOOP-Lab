package proj6;

import java.util.*;
import java.io.*;

class RowSumT implements Runnable
{
   int sum;
   int row[];
   Thread t;
   
    RowSumT(int r[],int i)
    {
      sum=0;
      row=r;
      t=new Thread(this,"Thread"+i);
      
      t.start();
    }
  public void run()
  {
     int l=row.length;
     for(int i=0;i<l;i++)
     {
         sum=sum+row[i];
     }
  }
  int getSum()
  {
    return sum;
  }
}
class RowSumDemo
{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter row and column:");
    int m=sc.nextInt();
    int n=sc.nextInt();
    int mat[][]=new int[m][n];
    System.out.println("Enter elements:");
    int i,j;
    for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
      {
         mat[i][j]=sc.nextInt();
      }
    }
    RowSumT tr[]=new RowSumT[mat.length];
    
    for(i=0;i<mat.length;i++)
    {
        tr[i]=new RowSumT(mat[i],i);
    }
  try{
         for(i=0;i<mat.length;i++)
         {
            tr[i].t.join();
         }
      }
      catch(InterruptedException e)
      {
         System.out.println("Interrupt caught");
      }
    int total=0;
    for(i=0;i<mat.length;i++)
    {
       total=total+tr[i].getSum();
    }
     System.out.println("The total sum is:"+total);
}
}