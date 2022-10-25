package proj_pack;

import java.util.*;

class Stack
{
   int stack[];
   int tos;
   void assign(int MAX)
   {
      tos=-1;
      stack=new int[MAX];
   }
   boolean is_Full()
   {
      if(tos==stack.length-1)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   boolean is_Empty()
   {
      if(tos==-1)
      {
         return true;
      }
      else
      {
          return false;
      }
   }
   void push(int k)
   {
     if(is_Full())
     {
       System.out.println("STACK OVERFLOW");
     }
     else
     {
       stack[++tos]=k;
     }
    }
   int pop()
   {
      if(is_Empty())
      {
        System.out.println("STACK UNDERFLOW");
        return -9999;
      }
      else  
      {
         return(stack[tos--]);         
      }
   }
  void display()
  {
     int i;
     System.out.println("STACK:");
     for(i=0;i<=tos;i++)
     {
       System.out.println(stack[i]);
     }
  }
}
class Stack_demo
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     Stack ob=new Stack();
     int op,max;
     System.out.println("Enter MAX");
     max=sc.nextInt();
     ob.assign(max);
     do{
     System.out.println("Enter option (1)push (2)pop (3)display (4)exit");
     op=sc.nextInt();
     
      switch(op)
     {
       case 1:
              System.out.println("Enter element to be pushed:");
              int ele=sc.nextInt();
              ob.push(ele);
      break;
      case 2:
             System.out.println("Element popped:"+ob.pop());
      break;
      case 3:
              ob.display();
      break;
      case 4:
             System.exit(0);
      default:
               System.out.println("Invalid option");
    }
   }while(true);
    
 }
}
