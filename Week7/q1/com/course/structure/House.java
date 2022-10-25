package proj_pack3.com.course.structure;

public class House extends Building
{
   int nbed;
   int nbath;
   public House(int sq,int st,int nobed,int nobath)
   {
     super(sq,st);
     super.display();
     nbed=nobed;
     nbath=nobath;
   }
  public void display()
  {
    System.out.println("Number of bedrooms:"+nbed);
    System.out.println("Number of bathrooms:"+nbath);
  }


}