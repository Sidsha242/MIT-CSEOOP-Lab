package proj_pack3.com.course.structure;

public class Building
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