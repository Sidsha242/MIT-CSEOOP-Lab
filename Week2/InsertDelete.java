import java.util.Scanner;
class InsertDelete
{
  public static void main(String agrs[])
  {
    Scanner sc=new Scanner(System.in);
    int n,i;
    int num,pos,temp;
    System.out.println("Enter n");
    n=sc.nextInt();
    int arr[]=new int[n+1];
    System.out.println("Enter numbers:"); 
    for(i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    System.out.println("(1)Insertion (2)Deletion");
    int choice=sc.nextInt();
    if(choice==1)
    {
       System.out.println("Enter number to be inserted:"); 
       num=sc.nextInt();
       System.out.println("Enter position where insertion will occur:"); //position will be in human readable form
       pos=sc.nextInt();
       for(i=n-1;i>=(pos-1);i--)
      {
         arr[i+1]=arr[i];
      }
         arr[pos-1]=num;
      System.out.println("Edited array:"); 
      for(i=0;i<n+1;i++)
      {
        System.out.println(arr[i]);
      }
     }
     else if(choice==2)
     {
       System.out.println("Enter position where deletion will occur:");
       pos=sc.nextInt();
       for(i=pos;i<n-1;i++)
      {
         arr[i]=arr[i+1];
      }
      System.out.println("Edited array:"); 
      for(i=0;i<n-2;i++)
      {
       System.out.println(arr[i]);
      }
     }
   }
  }      
    



     
    
