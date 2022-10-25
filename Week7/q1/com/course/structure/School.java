package proj_pack3.com.course.structure;

public class School extends Building
{
   int ncl;
   String glevel;
   public School(int sq,int st,int nocl,String grade)
   {
     
      super(sq,st);
      super.display();
      ncl=nocl;
      glevel=grade;

   }
  public void display()
  {
    System.out.println("No of classes:"+ncl);
    System.out.println("Grade level:"+glevel);
  }
}
