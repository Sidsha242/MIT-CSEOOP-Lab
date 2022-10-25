import java.util.Scanner;
class Bubble
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int n,temp;
      int i,j;
      System.out.println("Enter n");
      n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter numbers:"); 
      for(i=0;i<n;i++)
      {
         arr[i]=sc.nextInt();
      }
      System.out.println("(1)Ascending order (2)Descending order"); 
      int choice=sc.nextInt();
      if(choice==1)
      {
       System.out.println("Ascending order:");
       for(i=0;i<n-1;i++)
       {
         for(j=0;j<n-i-1;j++)
         {
           if(arr[j]>arr[j+1])
           {
             temp=arr[j];
             arr[j]=arr[j+1];
             arr[j+1]=temp;
           }
         } 
       }
      for(i=0;i<n;i++)
      {
         System.out.println(arr[i]);
      }
      else if(choice==2)
      {
        System.out.println("Descending order:");
        for(i=0;i<n-1;i++)
       {
         for(j=0;j<n-i-1;j++)
         {
           if(arr[j]<arr[j+1])
           {
             temp=arr[j];
             arr[j]=arr[j+1];
             arr[j+1]=temp;
           }
         } 
       }
       for(i=0;i<n;i++)
       {
         System.out.println(arr[i]);
       }
     }
    }
}
     
      
      
