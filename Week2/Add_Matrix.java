import java.util.*;
class Add_Matrix
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int m,n,p,q;
    int i,j;
    System.out.println("Enter rows and columns of 1st matrix:");
    m=sc.nextInt();
    n=sc.nextInt();
    System.out.println("Enter rows and columns of 2nd matrix:");
    p=sc.nextInt();
    q=sc.nextInt();
    if(m!=p && n!=q)
    {
      System.out.println("Matrix orders are not suitable for addition");
      System.exit(0);
    }
    int arr1[][]=new int[m][n];
    int arr2[][]=new int[p][q];
    System.out.println("Enter elements of 1st matrix");
    for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
      {
        arr1[i][j]=sc.nextInt();
      }
    }
    System.out.println("Enter elements of 2nd matrix");
    for(i=0;i<p;i++)
    {
      for(j=0;j<q;j++)
      {
        arr2[i][j]=sc.nextInt();
      }
    }
   int res[][]=new int[m][n];
   for(i=0;i<m;i++)
   {
     for(j=0;j<n;j++)
     {
       res[i][j]=arr1[i][j]+arr2[i][j];
     }
   }
  System.out.println("Resultant matrix:");
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      System.out.print(res[i][j]+"\t");
    }
   System.out.println("");
  }
 }
}


