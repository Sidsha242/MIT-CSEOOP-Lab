package proj_pack2;

import java.util.*;

class Building
{
   int sqrft;
   int stories;
   Building(int sq,int st)
   {
      sqrft=sq;
      stories=st;    
   }
  void display()
  {
    System.out.println("Square footage:"+sqrft);
    System.out.println("Stories:"+stories);
   }

}
class House extends Building
{
   int nbed;
   int nbath;
   House(int sq,int st,int nobed,int nobath)
   {
     super(sq,st);
     super.display();
     nbed=nobed;
     nbath=nobath;
   }
  void display()
  {
    System.out.println("Number of bedrooms:"+nbed);
    System.out.println("Number of bathrooms:"+nbath);
  }


}
class School extends Building
{
   int ncl;
   String glevel;
   School(int sq,int st,int nocl,String grade)
   {
     
      super(sq,st);
      super.display();
      ncl=nocl;
      glevel=grade;

   }
  void display()
  {
    System.out.println("No of classes:"+ncl);
    System.out.println("Grade level:"+glevel);
  }
}

class BuildingDemo
{

public static void main(String args[])
 {

   School obj1=new School(1000,3,10,"Primary");
   obj1.display();
   House obj2=new House(2000,2,3,4);
   obj2.display();  
 }
}