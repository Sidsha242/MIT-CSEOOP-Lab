package proj_pack7;

import java.util.*;

class UniqueT extends Thread
{
   int mat[][];
   boolean flag=true;
   UniqueT(int m[][])
   {
     mat=m;
   }
   public void run()
   { 
      for(int i=0;i<mat.length;i++) 
      {
        for(int j=0;j<mat[i].length;j++)
        {
          for(int k=0;k<mat[i].length;k++)
              {
            if(mat[i][j]==mat[i][k])
            {
               flag=false;
               break;
            }
          }
        }
       if(flag)
       {
            System.out.println("All elements are unique");
       }
       else
       {
            System.out.println("Elements are not unique");
       }
    }
   }
   boolean getFlag()
  {
    return flag;
  }
}

class RowSumT extends Thread
{
    int mat[][];
    boolean flag=true;
    RowSumT(int m[][])
    {
        mat=m;
    }
    public void run()
    {
        int i,j;
       int[] rarr=new int[mat.length];
       for(i=0;i<mat.length;i++) 
       {
         int sum=0;
         for(j=0;j<mat[i].length;j++)
         {
            sum=sum+mat[i][j];
         }
          rarr[i]=sum;
        }
        for(i=0;i<mat.length;i++)
        {
            if(rarr[i]!=rarr[0])
            {
                flag=false; 
                System.out.println("Row sums are not equal");
            }
            else
            {
                System.out.println("Row sums are equal");
            }
        }
  }
    boolean getFlag()
    {
      return flag;
    }
}

class ColSumT extends ThreadGroup
{

    int mat[][];
    boolean flag=true;
    ColSumT(int m[][])
    {
        mat=m;
    }
    public void run()
    {
        int i,j;
        int[] carr=new int[mat[i].length];
        for(i=0;i<mat.length;i++) 
       {
         int sum=0;
         for(j=0;j<mat.length;j++)
         {
            sum=sum+mat[j][i];
         }
          carr[i]=sum;
        }
        for(i=0;i<mat[].length;i++)
        {
            if(carr[i]!=carr[0])
            {
                flag=false; 
                System.out.println("Column sums are not equal");
            }
            else{
                System.out.println("Column sums are equal");
            }
        }
    }
         boolean getFlag()
        {
         return flag;
        } 
}    
class PDiaSumT extends Thread
{
    int mat[][];
    int pdsum=0;
    PDiaSumT(int m[][])
    {
        mat=m;
    }
    public void run()
    {
    for(int i=0;i<mat.length;i++) 
      {
        for(int j=0;j<mat[].length;j++)
        {
          pdsum=mat[i][i]+pdsum;
        }
    }
    }
    int getPdsum()
    {
        return pdsum;
    }

  }
          
class SDiaSumT extends Thread
{
    int mat[][];
    int sdsum=0;
    SDiaSumT(int m[][])
    {
        mat=m;
    }
    public void run()
    {

    for(int i=0;i<mat.length;i++) 
      {
        for(int j=0;j<mat[i].length;j++)
        {
          sdsum=mat[i][(mat[].length)-i-1]+sdsum;
        }
    }
    }
    int getSdsum()
    {
        return sdsum;
    }

  }  
          
class MagicSquareDemo
{
    public static void main(String args[])
    {
        int mat[][]={{2,7,6},{9,5,1},{4,3,8}};
        UniqueT t1=new UniqueT(mat);
        RowSumT t2=new RowSumT(mat);
        ColSumT t3=new ColSumT(mat);
        PDiaSumT t4=new PDiaSumT(mat);
        SDiaSumT t5=new SDiaSumT(mat);
        

    }
}


              
