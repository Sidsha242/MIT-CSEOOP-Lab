import java.util.*;

class Complex
{ 
  int rel,img;
 void assign(int a,int b)
 {
  rel=a;
  img=b;
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
    Complex c1=new Complex();
    c1.assign(3,7);
    c1.display();
    Complex c2=new Complex();
    c2.assign(8,11);
    c2.display();
    Complex res1=c1.add(c2);
    Complex res2=c1.sub(c2);
    System.out.println("Addition:"+res1.rel+"+i"+res1.img);
    System.out.println("Substraction:"+res2.rel+"+i"+res2.img);
  }
}
    
  

