import java.util.*;

class NumberFormat_Example
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number:");
      int n=sc.nextInt();
      String num=String.format("%,03d",n);
      System.out.println(num);
  }
}