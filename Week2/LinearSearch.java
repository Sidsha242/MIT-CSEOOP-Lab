import java.util.*;
 class LinearSearch
 {
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int ele,n,i;
     System.out.println("Enter n:");
     n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("Enter elements:");
     for(i=0;i<n;i++)
     {
         arr[i]=sc.nextInt();
     }
     System.out.println("Enter element to be searched:");
     ele=sc.nextInt();
     int pos=0;
     for(i=0;i<n;i++)
     {
       if(arr[i]==ele) 
       {
         pos=i+1;
         break;
       }
     }
     if(pos>0)
     {
       System.out.println("Element is present at position:"+pos);
     }
     else
     {
        System.out.println("Element not found:");
     }
   }
 }
