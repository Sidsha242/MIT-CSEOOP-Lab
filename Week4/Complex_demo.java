package proj_pack;

import java.util.*;

class Complex
{ 
  int rel,img;
  Complex()
  {
	  rel=0;
	  img=0;
  }
  Complex(int r,int i)
  {
	  rel=r;
	  img=i;
  }
 void display()
 {
  System.out.println("Complex number:"+rel+"+i"+img);
 }
 Complex add(Complex c2)
 {
  Complex sumobj=new Complex();
  sumobj.rel=this.rel+c2.rel;
  sumobj.img=this.img+c2.img;

 return sumobj;
 }
 Complex sub(Complex c2)
 {
  Complex diffobj=new Complex();
  diffobj.rel=this.rel-c2.rel;
  diffobj.img=this.img-c2.img;

  return diffobj;
 }
}
class Complex_demo
{
  public static void main(String args[])
  {
	Scanner sc=new Scanner(System.in);
	int r1,i1,r2,i2;
	System.out.println("Enter real and imaginary part of 1st number:");
	r1=sc.nextInt();
	i1=sc.nextInt();
    Complex c1=new Complex(r1,i1);
    c1.display();
    System.out.println("Enter real and imaginary part of 2nd number:");
	r2=sc.nextInt();
	i2=sc.nextInt();
    Complex c2=new Complex(r2,i2);
    c2.display();
    Complex res1=c1.add(c2);
    Complex res2=c1.sub(c2);
    System.out.println("Addition:"+res1.rel+"+i"+res1.img);
    System.out.println("Substraction:"+res2.rel+"+i"+res2.img);
  }
}
    
  

