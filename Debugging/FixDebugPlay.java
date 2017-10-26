public class FixDebugPlay
{
   protected String title;
   protected String author;

   public FixDebugPlay(String death_of_a_salesman, String arthur_miller) {
   }

   public void FixDebugPlay(String title, String author)
   {
      this.title = title;
      this.author = author;
   }
   public void display()
   {
      System.out.println("The performance is " + title +
        " by " + author);
   }
}